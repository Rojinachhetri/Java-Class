import java.awt.*;
import javax.swing.*;

public static void main(String[] args) {
    JFrame frame = new JFrame("Shape Component Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new ShapeComponent());
    frame.pack();
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
}
public class ShapeComponent extends JPanel {
    public ShapeComponent() {
        setPreferredSize(new Dimension(400, 300));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw a rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 50, 100, 50);
        
        // Draw an oval
        g.setColor(Color.BLUE);
        g.drawOval(200, 50, 100, 50);
        
        // Draw a filled circle
        g.setColor(Color.GREEN);
        g.fillOval(50, 150, 50, 50);
        
        // Draw a line
        g.setColor(Color.BLACK);
        g.drawLine(200, 150, 300, 200);
    }


}
