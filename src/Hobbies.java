//Richard Padilla
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobbies {
    public JPanel pasatiempo;
    public JButton btnregresar;
    public JFrame hobbiesFrame;

    public Hobbies(JFrame frame) {
        this.hobbiesFrame = frame;

        pasatiempo = new JPanel(new BorderLayout());

        btnregresar = new JButton("Regresar");
        pasatiempo.add(btnregresar, BorderLayout.SOUTH);

        JLabel label = new JLabel(new ImageIcon("C:\\Users\\richa\\OneDrive\\Imágenes\\Capturas de pantalla\\OIP.jpg"));
        pasatiempo.add(label, BorderLayout.CENTER);

        btnregresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hobbiesFrame.dispose();

                JFrame frame = new JFrame("Bibliografía - Richard Padilla");
                frame.setContentPane(new Bibliografia(frame).biblio);
                frame.setSize(600, 400);
                frame.setPreferredSize(new Dimension(600, 400));
                frame.setMinimumSize(new Dimension(600, 400));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
