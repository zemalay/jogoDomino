package br.com.domino.model;

import java.sql.Time;

public class Relatorios {

	private Time tempoDeJogo;
	private Integer pontuacao;
	private Usuario usuario;

	public Time getTempoDeJogo() {
		return tempoDeJogo;
	}

	public void setTempoDeJogo(Time tempoDeJogo) {
		this.tempoDeJogo = tempoDeJogo;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
