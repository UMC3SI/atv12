package view;
/**
 * @author Gustavo de Almeida Monteiro - 11211100223@alunos.umc.br
 * @author Julia Araujo Calazans - 11211102258@alunos.umc.br
 */
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NovaJanela extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovaJanela frame = new NovaJanela();
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
	public NovaJanela() {
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
