import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class MouseAdapterExample {

    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Mouse Adapter Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label to display the message
        JLabel label = new JLabel("Click inside the frame.", SwingConstants.CENTER);
        
        // Add a MouseAdapter to handle mouse events
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Add the label to the frame
        frame.add(label);

        // Display the frame
        frame.setVisible(true);
    }
}
