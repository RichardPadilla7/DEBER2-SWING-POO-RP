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

        JLabel imageLabel = new JLabel(new ImageIcon("https://th.bing.com/th/id/OIP.mLCV_UHkm9JiAT6ywSX45QHaEK?rs=1&pid=ImgDetMain"));
        pasatiempo.add(imageLabel);
    }
}
