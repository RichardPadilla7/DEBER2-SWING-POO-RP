import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Hobbies {
    public JPanel pasatiempo;
    public JButton btnregresar;
    public JFrame hobbiesFrame;

    public Hobbies(JFrame frame) {
        this.hobbiesFrame = frame;

        pasatiempo = new JPanel(new BorderLayout());

        btnregresar = new JButton("Regresar");
        pasatiempo.add(btnregresar, BorderLayout.SOUTH);

        try {
            URL imageUrl = new URL("https://th.bing.com/th/id/OIP.ph2ASpZAZoAmqgJ6qN174wAAAA?rs=1&pid=ImgDetMain");
            ImageIcon imageIcon = new ImageIcon(imageUrl);
            JLabel label = new JLabel(imageIcon);
            pasatiempo.add(label, BorderLayout.CENTER);
        } catch (Exception e) {
            JLabel errorLabel = new JLabel("Error al cargar la imagen");
            pasatiempo.add(errorLabel, BorderLayout.CENTER);
            e.printStackTrace();
        }

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
