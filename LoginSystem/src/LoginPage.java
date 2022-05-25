import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;


public class LoginPage implements ActionListener{

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("User ID: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();

    LoginPage(HashMap<String, String> loginInfoOriginal) {
        System.out.println(loginInfoOriginal);
        loginInfo = loginInfoOriginal;

        userIdLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        userIdField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);

        resetButton.setBounds(235, 200, 100, 25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);

        messageLabel.setBounds(125, 300, 100, 25);

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);   
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton) {
            userIdField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource() == loginButton) {
            String userId = userIdField.getText();
            String userPassword = String.valueOf(userPasswordField.getPassword());

            if(loginInfo.containsKey(userId)) {
                if(loginInfo.get(userId).equals(userPassword)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage();
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password");
                }
            }
        }
    }

}
