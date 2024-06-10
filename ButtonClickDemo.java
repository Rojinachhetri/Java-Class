import javax.swing.*;
import java.awt.event.*;

public class ButtonClickDemo {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Event Handling Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("Click the button!");
        frame.add(label);

        // Create a button
        JButton button = new JButton("Click Me!");
        frame.add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        // Set layout
        frame.setLayout(new java.awt.FlowLayout());

        // Set visibility
        frame.setVisible(true);
    }
}
