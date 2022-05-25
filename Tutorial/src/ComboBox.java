import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBox extends JFrame implements ActionListener{
    JComboBox comboBox;

    ComboBox() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};

        comboBox = new JComboBox(animals);

        comboBox.addActionListener(this);
        // comboBox.setEditable(true);
        comboBox.addItem("fish");
        comboBox.insertItemAt("horse", 1);

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
