import java.awt.*;
import javax.swing.*;

public class FramePropertiesDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Properties Demo By Rojina");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setResizable(false); // Prevent resizing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit application on close

        // Set background color
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        // Add a button to the content pane
        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }
}
