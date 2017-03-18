package br.com.domino.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.domino.model.Login;
import br.com.domino.model.DAO.Conecta;

public class LoginController {

	public void salvar(Login login) throws Exception {

		Conecta conexao = Conecta.getInstance();

		conexao.conecta();

		try {
			PreparedStatement stm = conexao.conn
					.prepareStatement("INSERT INTO login (usuario,senha,fk_usuario) VALUES (?,?,?)");
			stm.setString(1, login.getUsuario().getNome());
			stm.setString(2, login.getSenha());
			stm.setInt(3, login.getUsuario().getId());
			stm.execute();

			JOptionPane.showMessageDialog(null, "login salvo com sucesso");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "erro ao salvar na tabela login" + ex.getMessage());
		}
		conexao.desconecta();

	}

}
