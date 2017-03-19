package br.com.domino.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.domino.model.Pecas;
import br.com.domino.model.DAO.Conecta;

public class PecasController {

	public void salvar(Pecas p) throws Exception {

		Conecta conexao = Conecta.getInstance();
		
		conexao.conecta();
		
			try {
				PreparedStatement stm = conexao.conn.
						prepareStatement("INSERT INTO pecas (valor_topo,valor_inferior,peca_associada,"
								+ "fk_estado_do_jogo) VALUES (?,?,?,?)");
				stm.setInt(1,p.getValorTopo());
				stm.setInt(2, p.getValorInferior());
				stm.setInt(3, p.getPecaAssociada());
				stm.setInt(4,p.getEstadoDoJogo());
				stm.execute();
				JOptionPane.showMessageDialog(null, "peças do jogo salvo com sucesso");
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null, "erro ao salvar na tabela pecas" + ex.getMessage());
			}
		conexao.desconecta();
	}
}
