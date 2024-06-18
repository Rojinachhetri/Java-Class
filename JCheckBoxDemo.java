import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JCheckBoxFrame frame = new JCheckBoxFrame();
            frame.setSize(400, 200);
            frame.setTitle("JCheckBox Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class JCheckBoxFrame extends JFrame {
    private JLabel textLabel;
    private JCheckBox boldCheckBox;
    private JCheckBox italicCheckBox;

    JCheckBoxFrame() {
        textLabel = new JLabel("Sample Text");
        textLabel.setFont(new Font("SansSerif", Font.PLAIN, 24));
        // Set the text in the center
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);

        boldCheckBox = new JCheckBox("Bold");
        italicCheckBox = new JCheckBox("Italic");
        
        // Add listener to the checkbox
        CheckBoxListener listener = new CheckBoxListener();
        boldCheckBox.addItemListener(listener);
        italicCheckBox.addItemListener(listener);

        // Add label to the frame
        add(textLabel, BorderLayout.CENTER);
        
        JPanel checkBoxPanel = new JPanel();
        // Add CheckBox to the panel
        checkBoxPanel.add(boldCheckBox);
        checkBoxPanel.add(italicCheckBox);

        // Add CheckBox panel to the frame
        add(checkBoxPanel, BorderLayout.SOUTH);
    }

    class CheckBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            int style = Font.PLAIN;
            if (boldCheckBox.isSelected()) {
                style += Font.BOLD;
            }
            if (italicCheckBox.isSelected()) {
                style += Font.ITALIC;
            }
            textLabel.setFont(new Font("SansSerif", style, 24));
        }
    }
}
