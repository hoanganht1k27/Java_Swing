import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class TicTacToe implements ActionListener{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;
    boolean gameOver = false;
    boolean started = false;

    int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

    TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 0));
        textField.setFont(new Font("Ink Free", Font.BOLD, 75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Tic Tac Toe");
        textField.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 150));

        for(int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textField);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        this.firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!started || gameOver) return;
        // TODO Auto-generated method stub
        for(int i = 0; i < 9; i++) {
            if(e.getSource() == buttons[i]) {
                if(player1_turn) {
                    if(buttons[i].getText() == "") {
                        buttons[i].setForeground(Color.blue);
                        buttons[i].setText("X");
                        player1_turn = false;
                        textField.setText("O Turn");
                        check();
                    }
                } else {
                    if(buttons[i].getText() == "") {
                        buttons[i].setForeground(Color.red);
                        buttons[i].setText("O");
                        player1_turn = true;
                        textField.setText("X Turn");
                        check();
                    }
                }
            }
        }
    }

    public void firstTurn() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if(random.nextInt(2) == 0) {
            player1_turn = true;
            textField.setText("X turn");
            started = true;
        } else {
            player1_turn = false;
            textField.setText("O turn");
            started = true;
        }
    }

    public void check() {
        // check X wins condition
        for(int i = 0 ; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(checkDirection1(i, j, "X") || checkDirection2(i, j, "X") || checkDirection3(i, j, "X")) {
                    textField.setText("X wins");
                    gameOver = true;
                    return;
                }
            }
        }

        // check X wins condition
        for(int i = 0 ; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(checkDirection1(i, j, "O") || checkDirection2(i, j, "O") || checkDirection3(i, j, "O")) {
                    textField.setText("O wins");
                    gameOver = true;
                    return;
                }
            }
        }
    }

    public boolean checkValueOfButton(int x, int y, String s) {
        if(x >= 0 && x < 3 && y >= 0 && y < 3) {
            int id = x * 3 + y;
            if(buttons[id].getText() == s) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDirection1(int x, int y, String s) {
        if(checkValueOfButton(x, y, s) && checkValueOfButton(x, y + 1, s) && checkValueOfButton(x, y + 2, s)) return true;
        return false;
    }

    public boolean checkDirection2(int x, int y, String s) {
        if(checkValueOfButton(x, y, s) && checkValueOfButton(x + 1, y + 1, s) && checkValueOfButton(x + 2, y + 2, s)) return true;
        return false;
    }

    public boolean checkDirection3(int x, int y, String s) {
        if(checkValueOfButton(x, y, s) && checkValueOfButton(x + 1, y, s) && checkValueOfButton(x + 2, y, s)) return true;
        return false;
    }
}
