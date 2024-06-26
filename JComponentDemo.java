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

        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rect);
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

public class JComponentDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FrameDemo();
        });
    }
}
