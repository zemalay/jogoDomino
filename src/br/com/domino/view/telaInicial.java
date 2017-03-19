package br.com.domino.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;


public class telaInicial extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaInicial frame = new telaInicial();
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
	public telaInicial() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 450, 300);
		setSize(644,410);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setForeground(Color.BLACK);
		btnFechar.setBackground(Color.WHITE);
		btnFechar.setBounds(297, 317, 124, 23);
		contentPane.add(btnFechar);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(238, 47, 124, 23);
		contentPane.add(btnLogin);
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.setForeground(Color.BLACK);
		btnCadastro.setBackground(Color.WHITE);
		btnCadastro.setBounds(272, 186, 111, 23);
		contentPane.add(btnCadastro);
		
		JLabel lblimagem = new JLabel("");
		lblimagem.setForeground(Color.ORANGE);
		lblimagem.setIcon(new ImageIcon(telaInicial.class.getResource(".\\resource\\imagens\\domino.png")));
		lblimagem.setBounds(0, 0, 654, 398);
		contentPane.add(lblimagem);
		
		setIcon();
	}

	private void setIcon() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(".\\resource\\imagens\\pretaicon.png")));
		
	}
}
