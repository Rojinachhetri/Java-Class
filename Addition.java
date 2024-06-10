import java.awt.event.*;
import javax.swing.*;

public class Addition {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalcButtonFrame frame = new CalcButtonFrame();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}

class CalcButtonFrame extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField resultField;
    private static final int DEFAULT_HEIGHT = 150;
    private static final int DEFAULT_WIDTH = 300;

    public CalcButtonFrame() {
        initializeFrame();
        addTextFields();
        addButton("Sum");
    }

    private void initializeFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        panel = new JPanel();
        add(panel);
    }

    private void addTextFields() {
        textField1 = new JTextField(10); // Adjusted width
        textField2 = new JTextField(10); // Adjusted width
        resultField = new JTextField(10); // Adjusted width
        resultField.setEditable(false); 

        JLabel plusLabel = new JLabel("+"); // Create a label with "+" sign

        panel.add(textField1);
        panel.add(plusLabel); // Add the label to the panel
        panel.add(textField2);
        panel.add(resultField);
    }

    private void addButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(new SumAction());
        panel.add(button);
    }

    private class SumAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                
                double sum = num1 + num2;
                
                resultField.setText(Double.toString(sum));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(panel, "Invalid input. Please enter valid numbers.");
            }
        }
    }
}
