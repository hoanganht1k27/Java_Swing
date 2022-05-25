import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class RadioButton extends JFrame implements ActionListener{

    JRadioButton pizzaButton = new JRadioButton("pizza");
    JRadioButton hamburgerButton = new JRadioButton("hamburger");
    JRadioButton hotdogButton = new JRadioButton("hotdog");

    RadioButton() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaButton) {
            System.out.println("Yor ordered pizza");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered hamburger");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered hotdog");
        }
    }
}
