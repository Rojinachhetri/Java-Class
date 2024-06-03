import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class ComponentDemo extends JComponent {
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 500;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        double leftX = 100;
        double topY = 200;
        double width = 200;
        double height = 150;

        // Draw the rectangle
        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rect);

        // Calculate the center of the rectangle
        double centerX = leftX + width / 2;
        double centerY = topY + height / 2;
        
        // Define the radius of the circle
        double radius = 50; // Example radius

        // Draw the circle centered at the rectangle's center
        Ellipse2D circle = new Ellipse2D.Double(centerX - radius, centerY - radius, radius * 2, radius * 2);
        g2.draw(circle);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}

class FrameDemo extends JFrame {
    public FrameDemo() {
        add(new ComponentDemo());
        pack();
        setTitle("JComponent in a JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class JComponentDemo_circle {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FrameDemo();
        });
    }
}
