import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooser extends JFrame implements ActionListener{
    JButton button;
    JLabel label;

    ColorChooser() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text");
        label.setOpaque(true);
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));

        button.addActionListener(this);

        this.add(button);
        this.add(label);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);

            label.setForeground(color);
        }
    }
}
