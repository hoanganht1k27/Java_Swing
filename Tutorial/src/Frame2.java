import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Frame2 extends JFrame {
    Frame2() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(new BorderLayout(10, 10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.black);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.red);
        panel5.setBackground(Color.green);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        panel5.setLayout(new BorderLayout());

        // Sub panels
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(new Color(100, 123, 200));
        panel7.setBackground(new Color(200, 100, 0));
        panel8.setBackground(new Color(10, 10, 100));
        panel9.setBackground(new Color(255, 1, 100));
        panel10.setBackground(new Color(50, 200, 100));

        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.SOUTH);
        panel5.add(panel9, BorderLayout.EAST);
        panel5.add(panel10, BorderLayout.CENTER);




        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.WEST);
        this.add(panel3, BorderLayout.SOUTH);
        this.add(panel4, BorderLayout.EAST);
        this.add(panel5, BorderLayout.CENTER);
    }

}
