package br.com.domino.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class telaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaLogin frame = new telaLogin();
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
	public telaLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 450, 300);
		setSize(635,400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(268, 177, 167, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(268, 98, 167, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancelar.setBounds(346, 259, 138, 33);
		contentPane.add(btnCancelar);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEntrar.setBounds(149, 259, 138, 33);
		contentPane.add(btnEntrar);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSenha.setBounds(197, 146, 100, 80);
		contentPane.add(lblSenha);
		
		JLabel lbllogin = new JLabel("Login");
		lbllogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbllogin.setForeground(Color.BLACK);
		lbllogin.setBounds(197, 64, 100, 87);
		contentPane.add(lbllogin);
		
		JLabel lblbackground = new JLabel("");
		lblbackground.setFont(new Font("Arial", Font.PLAIN, 18));
		lblbackground.setIcon(new ImageIcon(telaLogin.class.getResource("/resource/imagens/modelodomino.png")));
		lblbackground.setBounds(0, 0, 628, 371);
		contentPane.add(lblbackground);
		setIcon();
	}
	
	private void setIcon() {
	setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resource/imagens/pretaicon.png")));
		
		}
}
