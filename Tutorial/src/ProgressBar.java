import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgressBar extends JFrame{
    JProgressBar bar = new JProgressBar();

    ProgressBar() {
        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        this.add(bar);

        this.setSize(420, 420);
        this.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 0;
        while(counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            counter += 1;
        }
        bar.setString("Well done");
    }
}