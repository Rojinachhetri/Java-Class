import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorFrame frame = new CalculatorFrame();
            frame.setTitle("Calculator App");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class CalculatorFrame extends JFrame {
    JTextField text;
    JPanel btnPanel;
    JButton[] button;
    String[] btnLabels = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "+", "="
    };

    CalculatorFrame() {
        text = new JTextField();
        text.setPreferredSize(new Dimension(getWidth(), 75));
        text.setEditable(false);
        btnPanel = new JPanel();
        button = new JButton[btnLabels.length];
        btnPanel.setLayout(new GridLayout(4, 4));

        ButtonListener listener = new ButtonListener();
        for (int i = 0; i < btnLabels.length; i++) {
            button[i] = new JButton(btnLabels[i]);
            button[i].addActionListener(listener);
            btnPanel.add(button[i]);
        }

        add(text, BorderLayout.NORTH);
        add(btnPanel, BorderLayout.CENTER);
    }

    class ButtonListener implements ActionListener {
        private StringBuilder currentInput = new StringBuilder();
        private String operator = "";
        private double operand1 = 0;
        private boolean isOperatorClicked = false;
        private boolean isResultDisplayed = false;

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();

            if (command.matches("[0-9\\.]")) {
                if (isResultDisplayed) {
                    currentInput.setLength(0);
                    isResultDisplayed = false;
                }
                currentInput.append(command);
                text.setText(currentInput.toString());
            } else if (command.matches("[\\+\\-\\*/]")) {
                if (!isOperatorClicked) {
                    operand1 = Double.parseDouble(currentInput.toString());
                    currentInput.setLength(0);
                } else if (isResultDisplayed) {
                    operand1 = Double.parseDouble(text.getText());
                    currentInput.setLength(0);
                }
                operator = command;
                isOperatorClicked = true;
            } else if (command.equals("=")) {
                if (operator.isEmpty()) return;
                double operand2 = Double.parseDouble(currentInput.toString());
                double result = 0;

                switch (operator) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        if (operand2 != 0) {
                            result = operand1 / operand2;
                        } else {
                            text.setText("Error");
                            currentInput.setLength(0);
                            operator = "";
                            return;
                        }
                        break;
                }

                text.setText(String.valueOf(result));
                operand1 = result;
                currentInput.setLength(0);
                isResultDisplayed = true;
                isOperatorClicked = false;
                operator = "";
            }
        }
    }
}
