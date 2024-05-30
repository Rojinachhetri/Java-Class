import javax.swing.*;

public class DemoJFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JFrame Properties Demo");

            frame.setSize(400, 300);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setLocationRelativeTo(null);

            frame.setResizable(false);

            frame.setAlwaysOnTop(true);

            JLabel label = new JLabel("Welcome to JFrame Properties Demo", JLabel.CENTER);
            frame.add(label);

            frame.setVisible(true);
        });
    }
}
