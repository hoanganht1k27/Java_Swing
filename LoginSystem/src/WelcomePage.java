import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    WelcomePage() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);

        label.setBounds(0, 0, 200, 200);
        label.setText("Hello");
        label.setFont(new Font("Monospace", Font.ITALIC, 30));

        frame.add(label);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
