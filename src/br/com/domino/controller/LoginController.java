package br.com.domino.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.domino.model.Login;
import br.com.domino.model.DAO.Conecta;

public class LoginController {
	Conecta conexao = Conecta.getInstance();

	public void salvar(Login login) throws Exception {
		conexao.conecta();

		try {
			PreparedStatement stm = conexao.conn
					.prepareStatement("INSERT INTO login (usuario,senha,fk_usuario) VALUES (?,?,?)");
			stm.setString(1, login.getLogin());
			stm.setString(2, login.getSenha());
			stm.setInt(3, login.getUsuario());
			stm.execute();
			JOptionPane.showMessageDialog(null, "login salvo com sucesso");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "erro ao salvar na tabela login" + ex.getMessage());
		}
		conexao.desconecta();
	}

	public boolean loginUsuario(String usuario, String senha) throws Exception {
		boolean confirma = false;
		conexao.conecta();
		try {
			PreparedStatement stm = conexao.conn.prepareStatement("SELECT usuario,senha FROM login");
			ResultSet rs = stm.executeQuery();
			rs.first();// pega os primeiros elementos da tabela
			do {
				String user = rs.getString("usuario");
				String password = rs.getString("senha");

				if (usuario.equals(user) && senha.equals(password)) {
					confirma = true;
				}
			} while (rs.next()); // pega os demais eleemntos da tabela

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		conexao.desconecta();
		return confirma;
	}

}
