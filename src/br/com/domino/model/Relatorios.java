package br.com.domino.model;

import java.sql.Time;

public class Relatorios {

	private Time tempoDeJogo;
	private Integer pontuacao;
	private int usuario;

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

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

}
