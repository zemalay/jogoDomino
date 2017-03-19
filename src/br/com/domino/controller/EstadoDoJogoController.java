package br.com.domino.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.domino.model.EstadoDoJogo;
import br.com.domino.model.DAO.Conecta;

public class EstadoDoJogoController {

	public void salvar(EstadoDoJogo estadoJogo) throws Exception {

		Conecta conexao = Conecta.getInstance();
		
		conexao.conecta();
		
			try {
				PreparedStatement stm = conexao.conn.
						prepareStatement("INSERT INTO estado_do_jogo (pecas_distribuidas,pecas_nao_distribuidas,"
								+ "pontuaco,tempo_de_jogado,pecas_jogador,pecas_computador,estado_do_jogo,fk_usuario"
								+ ") VALUES (?,?,?,?,?,?,?,?)");
				stm.setInt(1,estadoJogo.getPecasDistribuidas());
				stm.setInt(2, estadoJogo.getPecasNaoDistribuidas());
				stm.setInt(3, estadoJogo.getPontuacao());
				stm.setInt(4, estadoJogo.getTempoJogado());
				stm.setString(5, estadoJogo.getPecasJogador());
				stm.setString(6, estadoJogo.getPecasComputador());
				stm.setString(7, estadoJogo.getEstadoDoJogo());
				stm.setInt(8, estadoJogo.getUsuario());
				
				stm.execute();
				JOptionPane.showMessageDialog(null, "estado do jogo salvo com sucesso");
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null, "erro ao salvar na tabela Usuario" + ex.getMessage());
			}
		conexao.desconecta();

	}

}
