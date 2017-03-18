package br.com.domino.view;

import br.com.domino.controller.UsuarioController;
import br.com.domino.model.Usuario;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//Teste de salvamento no Banco de Dados
		Usuario user = new Usuario();
		user.setNome("Joanes Miranda");
		user.setEmail("joanestecnico@gmail.com");
		user.setAvatar("testedecaminho");
		
		UsuarioController userControle = new UsuarioController();
		userControle.salvar(user);

	}

}
