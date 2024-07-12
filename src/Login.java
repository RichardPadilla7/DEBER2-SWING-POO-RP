import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public JPanel login;
    public JTextArea titulo;
    public JTextField textuser;
    public JPasswordField Textpassword;
    public JButton btnsesion;
    public JLabel usuario;
    public JLabel contrasenia;
    public JFrame loginFrame;

    public Login(JFrame frame) {
        this.loginFrame = frame;

        textuser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        Textpassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnsesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = textuser.getText();
                String pass = new String(Textpassword.getPassword());

                if (user.equals("richard") && pass.equals("123456")) {
                    JOptionPane.showMessageDialog(null, "Credenciales correctas");

                    loginFrame.dispose();

                    JFrame frame = new JFrame("Bibliografía - Richard Padilla");
                    frame.setContentPane(new Bibliografia(frame).biblio);
                    frame.setSize(600, 400);
                    frame.setPreferredSize(new Dimension(600, 400));
                    frame.setMinimumSize(new Dimension(600, 400));
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta. ¡Intente de nuevo!");
                }
            }
        });
    }
}
