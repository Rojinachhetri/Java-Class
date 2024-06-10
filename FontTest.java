import java.awt.*;
import javax.swing.*;

class FontComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 500;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();
        for (String fontName : fontNames) {
            System.out.println(fontName);
        }

        Font sansbold36 = new Font("SansSerif", Font.BOLD, 36);
        g2.setFont(sansbold36);

        String msg = "Hello Rojina";
        g2.drawString(msg, 50, 50);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}

class FontFrame extends JFrame {
    public FontFrame() {
        add(new FontComponent());
        pack();
    }
}

public class FontTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FontFrame frame = new FontFrame();
            frame.setTitle("Font Demo");
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
