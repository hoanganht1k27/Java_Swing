import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class Slider extends JFrame implements ChangeListener{
    JPanel panel;
    JLabel label;
    JSlider slider;

    Slider() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));

        slider.setOrientation(SwingConstants.VERTICAL);
        // slider.setOrientation(SwingConstants.HORIZONTAL);

        label.setText("\' C = " + slider.getValue());

        panel.add(slider);
        panel.add(label);
        

        this.add(panel);

        
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
