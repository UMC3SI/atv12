package view;
/**
 * @author Gustavo de Almeida Monteiro - 11211100223@alunos.umc.br
 * @author Julia Araujo Calazans - 11211102258@alunos.umc.br
 */
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import java.awt.Window;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Ajuda extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajuda frame = new Ajuda();
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
	public Ajuda() {
		setTitle("Ajuda");
		setBounds(100, 100, 259, 179);
		
		JLabel jLblCons = new JLabel("Em construção");
		jLblCons.setFont(new Font("Arial", Font.BOLD, 13));
		
		JButton jBtnFec = new JButton("Fechar Janela");
		jBtnFec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //you can't see me!
				dispose();
			}
		});
		jBtnFec.setFont(new Font("Arial", Font.BOLD, 13));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(62, Short.MAX_VALUE)
					.addComponent(jBtnFec)
					.addGap(58))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(74)
					.addComponent(jLblCons)
					.addContainerGap(76, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addComponent(jLblCons)
					.addGap(18)
					.addComponent(jBtnFec)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
