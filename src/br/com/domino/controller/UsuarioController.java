package br.com.domino.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.domino.model.Usuario;
import br.com.domino.model.DAO.Conecta;

public class UsuarioController {

	public void salvar(Usuario user) throws Exception {

		Conecta conexao = Conecta.getInstance();
		
		conexao.conecta();
		
			try {
				PreparedStatement stm = conexao.conn.prepareStatement("INSERT INTO usuario (nome,email,avatar) VALUES (?,?,?)");
				stm.setString(1, user.getNome());
				stm.setString(2, user.getEmail());
				stm.setString(3, user.getAvatar());
				stm.execute();
				JOptionPane.showMessageDialog(null, "Usuario salvo com sucesso");
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null, "erro ao salvar na tabela Usuario" + ex.getMessage());
			}
		conexao.desconecta();

	}

}
