import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login - Richard Padilla");
        frame.setContentPane(new Login(frame).login);
        frame.setSize(600, 400);
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setMinimumSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
    }
}