package br.com.domino.model.DAO;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conecta {

	public Connection conn;
	public Statement stm;
	public ResultSet rs;
	public PreparedStatement prep;

	public void conecta() throws Exception {
		Class.forName("org.sqlite.JDBC");
		conn = DriverManager.getConnection("jdbc:sqlite:domino.sqlite");
		stm = conn.createStatement();
		conn.setAutoCommit(false);
		conn.setAutoCommit(true);
		System.out.println("conectado com sucesso!");
	}

	public void desconecta() {
		boolean result = true;
		try {
			conn.close();
			JOptionPane.showMessageDialog(null, "banco fechado");
		} catch (SQLException fecha) {
			JOptionPane.showMessageDialog(null, "Não foi possivel " + "fechar o banco de dados: " + fecha);
			result = false;
		}
	}
}