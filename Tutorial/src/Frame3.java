import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Frame3 extends JFrame{
    Frame3() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

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
