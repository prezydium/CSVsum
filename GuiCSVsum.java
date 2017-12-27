import javafx.embed.swing.JFXPanel;
import javax.swing.JFileChooser;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

public class GuiCSVsum{
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton button1;
    private JPanel panelButton;
    private File file;
    public File getFile() {
        return file;
    }



    public GuiCSVsum(){
        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(fc);
                if (fc.getSelectedFile()!=null) {
                    file = fc.getSelectedFile();
                    Processor proc1 = new Processor();
                    try {
                        textArea1.append(proc1.doJob(file));
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
    }

}
