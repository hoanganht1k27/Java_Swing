import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionListener;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

public class TextField extends JFrame implements ActionListener{
    JButton button = new JButton("Submit");
    JTextField textFiled = new JTextField();

    TextField() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        
        button.addActionListener(this);

        textFiled.setPreferredSize(new Dimension(250, 40));

        this.add(button);
        this.add(textFiled);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            String text = textFiled.getText();
            System.out.println(text); 
        }
    }
}
