import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionListener;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class CheckBox extends JFrame implements ActionListener{
    JButton button = new JButton("Submit");
    JTextField textFiled = new JTextField();
    JCheckBox checkBox = new JCheckBox();

    CheckBox() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.setText("Submit");
        button.addActionListener(this);

        checkBox.setText("I\'m not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Monospace", Font.PLAIN, 15));

        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
