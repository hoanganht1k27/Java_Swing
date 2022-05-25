import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridLayout;

public class Frame4 extends JFrame {
    Frame4() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new GridLayout(3, 3, 10, 10));

        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
        this.add(new JButton("10"));

        this.setVisible(true);
    }
}
