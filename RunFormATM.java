import javax.swing.*;

public class RunFormATM {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form ATM");
        jFrame.setContentPane(new FormATM().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
    }
}
