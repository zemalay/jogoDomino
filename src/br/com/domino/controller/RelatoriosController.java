package br.com.domino.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.domino.model.Relatorios;
import br.com.domino.model.DAO.Conecta;

public class RelatoriosController {

	public void salvar(Relatorios r) throws Exception {

		Conecta conexao = Conecta.getInstance();

		conexao.conecta();

		try {
			PreparedStatement stm = conexao.conn
					.prepareStatement("INSERT INTO relatorios (tempo_de_jogo,pontuacao,fk_usuario) VALUES (?,?,?)");
			stm.setTime(1, r.getTempoDeJogo());
			stm.setInt(2, r.getPontuacao());
			stm.setInt(3, r.getUsuario());
			stm.execute();

			JOptionPane.showMessageDialog(null, "realtorio salvo com sucesso");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "erro ao salvar na tabela realtorio" + ex.getMessage());
		}
		conexao.desconecta();
	}
}
