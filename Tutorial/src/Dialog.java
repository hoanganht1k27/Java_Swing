import javax.swing.JOptionPane;

public class Dialog {
    Dialog() {
        // JOptionPane.showMessageDialog(null, "This is some useless info", "plain", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "info", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "question", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "warning", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "error", JOptionPane.ERROR_MESSAGE);

        // System.out.println(JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION));
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        System.out.println("Hello " + name);
    }
}
