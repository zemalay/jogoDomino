package br.com.domino.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.domino.controller.LoginController;
import br.com.domino.controller.UsuarioController;
import br.com.domino.model.Login;
import br.com.domino.model.Usuario;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JPasswordField passwordFieldSenha;

	ImageIcon i1 = new ImageIcon(".\\resource\\imagens\\gaara.png");
	ImageIcon i2 = new ImageIcon(".\\resource\\imagens\\gai.png");
	ImageIcon i3 = new ImageIcon(".\\resource\\imagens\\naruto.png");
	ImageIcon i4 = new ImageIcon(".\\resource\\imagens\\pain.png");
	ImageIcon i5 = new ImageIcon(".\\resource\\imagens\\sasuke.png");
	JComboBox<String> combo;
	ImageIcon[] img = { i1, i2, i3, i4, i5 };
	JLabel lblMostrarAvatar;
	private JTextField txtLogin;

	public Cadastro() {
		setLocation(new Point(500, 100));
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFont(new Font("Dialog", Font.BOLD, 14));
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\resource\\imagens\\user_add.png"));
		setSize(new Dimension(400, 400));
		setTitle("Cadastro");
		getContentPane().setLayout(null);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNome);

		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setBounds(10, 123, 46, 14);
		getContentPane().add(lblSenha);

		JLabel lblcone = new JLabel("Avatar ");
		lblcone.setBounds(10, 183, 46, 14);
		getContentPane().add(lblcone);

		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 275, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(10, 148, 275, 20);
		getContentPane().add(passwordFieldSenha);

		ImageIcon imgSave = new ImageIcon(".\\resource\\imagens\\iconesalvar.png");
		JButton btnSalvar = new JButton(imgSave);
		btnSalvar.setPreferredSize(new Dimension(100, 37));
		btnSalvar.setMinimumSize(new Dimension(100, 37));
		btnSalvar.setMaximumSize(new Dimension(100, 37));
		btnSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

				// recupera nome e caminho do icone avatar e envia para a classe usuario.
				Usuario user = new Usuario();
				user.setNome(txtNome.getText());
				user.setAvatar(combo.getSelectedIndex());// pegando apenas a posição do jComboBox para salvar no BD
				
				UsuarioController userC = new UsuarioController();
				try {
					userC.salvar(user);
				} catch (Exception e) {
					e.printStackTrace();
				}

				// recupera login, senha e ultimo id do usuario, envia para a classe login
				Login l = new Login();
				l.setLogin(txtLogin.getText());
				l.setSenha(passwordFieldSenha.getPassword().toString());

				// recupera o ultimo ID do usuario salvo no BD
				UsuarioController uc = new UsuarioController();
				try {
					l.setUsuario(uc.recuperaUltimoId(txtNome.getText()));
				} catch (Exception e) {
					e.printStackTrace();
				}

				// enviar as informações para serem salvas no BD
				LoginController lc = new LoginController();
				try {
					lc.salvar(l);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		btnSalvar.setBounds(47, 292, 100, 50);
		getContentPane().add(btnSalvar);
		ImageIcon imgCancel = new ImageIcon(".\\resource\\imagens\\iconecancelar.png");
		JButton btnCancelar = new JButton(imgCancel);
		btnCancelar.setPreferredSize(new Dimension(100, 37));
		btnCancelar.setMinimumSize(new Dimension(100, 37));
		btnCancelar.setMaximumSize(new Dimension(100, 37));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		btnCancelar.setBounds(197, 292, 100, 50);
		getContentPane().add(btnCancelar);

		combo = new JComboBox<String>();
		combo.addItem("Gaara");
		combo.addItem("Guy");
		combo.addItem("Naruto");
		combo.addItem("Pain");
		combo.addItem("Sasuke");
		combo.setBounds(10, 221, 89, 20);
		getContentPane().add(combo);
		combo.addItemListener(new tratarCombobox());

		lblMostrarAvatar = new JLabel(img[0]);
		lblMostrarAvatar.setBounds(253, 183, 100, 100);
		getContentPane().add(lblMostrarAvatar);

		JLabel lblLogin = new JLabel("Login: ");
		lblLogin.setBounds(10, 67, 46, 14);
		getContentPane().add(lblLogin);

		txtLogin = new JTextField();
		txtLogin.setBounds(10, 92, 275, 20);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);

		setVisible(true);
	}

	public class tratarCombobox implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {

			if (e.getStateChange() == ItemEvent.SELECTED) {

				lblMostrarAvatar.setIcon(img[combo.getSelectedIndex()]);
			}

		}

	}

	public static void main(String[] args) {
		new Cadastro();
	}
}
