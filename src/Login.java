import javax.swing.*;
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

    public Login() {
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
                String pass = Textpassword.getText();

                if(user.equals("richard") && pass.equals("123456")){
                    JOptionPane.showMessageDialog(null, "Credenciales correctas");
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta. Intente de nuevo!.");
                }
            }
        });
    }
}
