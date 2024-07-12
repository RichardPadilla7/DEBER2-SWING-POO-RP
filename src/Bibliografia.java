import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bibliografia {
    public JPanel biblio;
    public JTextArea BIBLIOGRAFIATextArea;
    public JTextArea nombreRichardPadillaTextArea;
    public JTextArea carreraTecnologiasDeDesarrolloTextArea;
    public JTextArea pasatiemposMusicaLeerJugarTextArea;
    public JTextArea tituloDeBachillerCienciasTextArea;
    public JButton btnnext;
    public JFrame biblioFrame;

    public Bibliografia(JFrame frame) {
        this.biblioFrame = frame;

        btnnext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                biblioFrame.dispose();

                JFrame newFrame = new JFrame("Hobbies - Richard Padilla");
                newFrame.setContentPane(new Hobbies(newFrame).pasatiempo);
                newFrame.setSize(600, 400);
                newFrame.setPreferredSize(new Dimension(600, 400));
                newFrame.setMinimumSize(new Dimension(600, 400));
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.pack();
                newFrame.setVisible(true);
            }
        });
    }
}
