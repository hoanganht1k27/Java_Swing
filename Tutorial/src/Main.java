import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ProgressMonitor;
import javax.swing.border.Border;
import javax.swing.plaf.LabelUI;

public class Main {

	public static void main(String[] args) {
		// ImageIcon image = new ImageIcon("logo.jpg");
		// Border border = BorderFactory.createLineBorder(Color.green, 3);

		// JLabel label = new JLabel();
		// label.setText("Bro do you even code");
		// label.setIcon(image);
		// label.setHorizontalTextPosition(JLabel.CENTER);
		// label.setVerticalTextPosition(JLabel.TOP);
		// label.setHorizontalAlignment(JLabel.CENTER);
		// label.setForeground(new Color(100, 100, 200));
		// label.setFont(new Font("MV Boli", Font.BOLD, 50));
		// label.setBackground(Color.black);
		// label.setOpaque(true);
		// label.setBorder(border);
		// label.setVerticalAlignment(JLabel.CENTER);
		// label.setBounds(0, 0, 450, 450);

		// new MyFrame(label);

		// JLabel label = new JLabel();
		// label.setText("Hi");
		// label.setVerticalAlignment(JLabel.BOTTOM);
		// label.setHorizontalAlignment(JLabel.RIGHT);

		// JPanel redPanel = new JPanel();
		// redPanel.setBackground(Color.red);
		// redPanel.setBounds(0, 0, 250, 250);

		// JPanel bluePanel = new JPanel();
		// bluePanel.setBackground(Color.blue);
		// bluePanel.setBounds(250, 0, 250, 250);

		// JPanel greenPanel = new JPanel();
		// greenPanel.setBackground(Color.green);
		// greenPanel.setBounds(0, 250, 500, 250);
		// greenPanel.setLayout(new BorderLayout());


		// JFrame frame = new JFrame();
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(1000, 1000);
		// frame.setVisible(true);
		// frame.setLayout(null);
		// frame.add(redPanel);
		// frame.add(bluePanel);
		// frame.add(greenPanel);
		// greenPanel.add(label);
		// frame.add(label);
		// frame.pack();

		new MyMouseListener();
	}
	
}
