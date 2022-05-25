
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import java.io.File;


public class SelectFile extends JFrame implements ActionListener{
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");

    JMenuItem loadItem = new JMenuItem("Load");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");

    JButton button = new JButton("Select file");

    SelectFile() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);

        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        button.addActionListener(this);

        this.add(button);

        this.setLayout(new FlowLayout());

        this.setJMenuBar(menuBar);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem) {
            System.out.println("Loading a file");
        } else if (e.getSource() == saveItem) {
            System.out.println("Saving a file");
        } else if (e.getSource() == exitItem) {
            System.out.println("Exit");
            this.dispose();
        } else if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null); // select file to open
            if(response == JFileChooser.APPROVE_OPTION) {
                System.out.println(fileChooser.getSelectedFile().getAbsolutePath());
                // File file = new File(fileChooser.getSelectedFile().getAbsoluteFile());
                // System.out.println(file);
            }
        }
    }
}
