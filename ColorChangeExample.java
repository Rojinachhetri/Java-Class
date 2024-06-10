import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeExample {

    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Color Change Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        JButton button1 = new JButton("Click Me!");
        JButton button2 = new JButton("Reset");
        JButton button3 = new JButton("Change Color");

        // Create a label to display the message
        JLabel label = new JLabel("Press a button.", SwingConstants.CENTER);

        // Add action listener to button1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 1 clicked!");
            }
        });

        // Add action listener to button2
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Press a button.");
            }
        });

        // Add action listener to button3 to change the frame color
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(new Color((int)(Math.random() * 0x1000000)));
            }
        });

        // Create a panel and add buttons to it
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Add the panel and label to the frame
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.SOUTH);
        frame.add(label, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
