import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyMouseListener extends JFrame implements MouseListener{
    JLabel label;

    MyMouseListener() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setText("ahihi");
        label.setBackground(Color.black);
        label.setForeground(Color.red);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Monospace", Font.PLAIN, 20));

        this.add(label);
        this.addMouseListener(this);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You cliced the mouse");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You pressed the mouse");
        label.setBackground(Color.yellow); 
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}
