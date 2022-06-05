package view;
/**
 * @author Gustavo de Almeida Monteiro - 11211100223@alunos.umc.br
 * @author Julia Araujo Calazans - 11211102258@alunos.umc.br
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import javax.swing.JDesktopPane;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 340);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu jMenuArq = new JMenu("Arquivo");
		menuBar.add(jMenuArq);
		
		JMenuItem jMenuItJan = new JMenuItem("Abrir Janela");
		
		
		jMenuArq.add(jMenuItJan);
		
		JMenuItem jMenuItFec = new JMenuItem("Fechar");
		jMenuItFec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(
			            null,
			            "Você está fechando o aplicativo, tem certeza?",
			            "Atenção!!",
			            JOptionPane.YES_NO_OPTION);
				if (n == 0){
					setVisible(false); //you can't see me!
					dispose();
		        }
			}
		});
		jMenuArq.add(jMenuItFec);
		
		JMenu jMenuAj = new JMenu("Ajuda");
		
		
		menuBar.add(jMenuAj);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		jMenuItJan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NovaJanela nj = new NovaJanela();
				desktopPane.add(nj);
				nj.setVisible(true);
			}
		});
		jMenuAj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ajuda aj = new Ajuda();
				desktopPane.add(aj);
				aj.setVisible(true);
			}
		});
	}

}
