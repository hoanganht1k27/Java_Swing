import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyKeyListener extends JFrame implements KeyListener {
    private int speed = 5;

    JLabel label;

    MyKeyListener() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);

        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX() - this.speed, label.getY());
                    break;
            case 'w': label.setLocation(label.getX(), label.getY() - this.speed);
                    break;
            case 'd': label.setLocation(label.getX() + this.speed, label.getY());
                    break;
            case 's': label.setLocation(label.getX(), label.getY() + this.speed);
                    break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
