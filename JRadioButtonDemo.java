import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioButtonDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RadioButtonFrame frame = new RadioButtonFrame();
            frame.setSize(400, 200);
            frame.setTitle("RadioButtonFrame Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class RadioButtonFrame extends JFrame {
    private JLabel textLabel;
    private ButtonGroup group;
    private JRadioButton small;
    private JRadioButton medium;
    private JRadioButton large;

    RadioButtonFrame() {
        textLabel = new JLabel("SAMPLE TEXT");
        textLabel.setFont(new Font("SansSerif", Font.PLAIN, 24));
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);

        small = new JRadioButton("Small");
        medium = new JRadioButton("Medium");
        large = new JRadioButton("Large");

        medium.setSelected(true);

        RadioButtonListener listener = new RadioButtonListener();
        small.addActionListener(listener);
        medium.addActionListener(listener);
        large.addActionListener(listener);

        group = new ButtonGroup();
        group.add(small);
        group.add(medium);
        group.add(large);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(small);
        buttonPanel.add(medium);
        buttonPanel.add(large);

        setLayout(new BorderLayout());
        add(textLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
    }

    class RadioButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (small.isSelected()) {
                textLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
            } else if (medium.isSelected()) {
                textLabel.setFont(new Font("SansSerif", Font.PLAIN, 24));
            } else if (large.isSelected()) {
                textLabel.setFont(new Font("SansSerif", Font.PLAIN, 36));
            }
        }
    }
}
