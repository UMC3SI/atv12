package View;

/**
 * @author Matheus Meirielli RGM : 11211102089 EMAIL : 11211102089@Alunos.umc.br
 * @co-author Guilherme Antunes RGM: 11211102142 EMAIL :
 * 11211102142@Alunos.umc.br
 */
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JInternalFrame {

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Janela frame = new Janela();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Janela() {
        setTitle("Minha Nova Janela");
        setBounds(100, 100, 274, 174);
        getContentPane().setLayout(null);

        JLabel jLblObg = new JLabel("Obrigado por Abrir!");
        jLblObg.setFont(new Font("Arial", Font.BOLD, 13));
        jLblObg.setBounds(62, 39, 131, 14);
        getContentPane().add(jLblObg);

        JButton jBtnFec = new JButton("Fechar Janela");
        jBtnFec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false); //you can't see me!
                dispose();
            }
        });
        jBtnFec.setFont(new Font("Arial", Font.BOLD, 13));
        jBtnFec.setBounds(51, 80, 154, 23);
        getContentPane().add(jBtnFec);

    }

}
