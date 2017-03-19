package br.com.domino.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.domino.model.Usuario;
import br.com.domino.model.DAO.Conecta;

public class UsuarioController {
	Conecta conexao = Conecta.getInstance();

	public void salvar(Usuario user) throws Exception {

		conexao.conecta();

		try {
			PreparedStatement stm = conexao.conn.prepareStatement("INSERT INTO usuario (nome,avatar) VALUES (?,?)");
			stm.setString(1, user.getNome());
			stm.setInt(2, user.getAvatar());
			stm.execute();
			JOptionPane.showMessageDialog(null, "Usuario salvo com sucesso");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "erro ao salvar na tabela Usuario" + ex.getMessage());
		}
		conexao.desconecta();

	}

	public int recuperaUltimoId(String nome) throws Exception {
		Integer id = null;
		conexao.conecta();

		try {
			PreparedStatement stm = conexao.conn.prepareStatement("SELECT idusuario FROM usuario");
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				id = rs.getInt("idusuario");
			}
			JOptionPane.showMessageDialog(null, "id do usuario recuperado com  sucesso");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "erro ao recuperar id do Usuario" + ex.getMessage());
		}
		conexao.desconecta();
		return id;
	}

}
