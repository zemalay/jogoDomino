package br.com.domino.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;
	
	ImageIcon i1 = new ImageIcon(".\\resource\\imagens\\gaara.png");
	ImageIcon i2 = new ImageIcon(".\\resource\\imagens\\gai.png");
	ImageIcon i3 = new ImageIcon(".\\resource\\imagens\\naruto.png");
	ImageIcon i4 = new ImageIcon(".\\resource\\imagens\\pain.png");
	ImageIcon i5 = new ImageIcon(".\\resource\\imagens\\sasuke.png");
	JComboBox<String> combo;
	ImageIcon[] img = {i1,i2,i3,i4,i5} ;
	JLabel lblMostrarAvatar;
	private JTextField textField_1;
	
	
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
		
		textField = new JTextField();
		textField.setBounds(10, 36, 275, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 148, 275, 20);
		getContentPane().add(passwordField);
		
		
		
	    
		ImageIcon imgSave = new ImageIcon(".\\resource\\imagens\\iconesalvar.png");
		JButton btnSalvar = new JButton(imgSave);
		btnSalvar.setPreferredSize(new Dimension(100, 37));
		btnSalvar.setMinimumSize(new Dimension(100, 37));
		btnSalvar.setMaximumSize(new Dimension(100, 37));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSalvar.setBounds(47, 292, 100, 50);
		getContentPane().add(btnSalvar);
		ImageIcon imgCancel = new ImageIcon(".\\resource\\imagens\\iconecancelar.png");
		JButton btnCancelar = new JButton(imgCancel );
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
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 92, 275, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		
		
		
		setVisible(true);
	}
	
	public class tratarCombobox implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getStateChange() == ItemEvent.SELECTED){
				
				lblMostrarAvatar.setIcon(img[combo.getSelectedIndex()]);
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		new Cadastro();
	}
}

