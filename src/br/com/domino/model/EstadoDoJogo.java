package br.com.domino.model;

public class EstadoDoJogo {

	private Integer pecasDistribuidas;
	private Integer pecasNaoDistribuidas;
	private Integer pontuacao;
	private Integer tempoJogado;
	private String pecasJogador;
	private String pecasComputador;
	private String estadoDoJogo;
	private Usuario usuario;

	public Integer getPecasDistribuidas() {
		return pecasDistribuidas;
	}

	public void setPecasDistribuidas(Integer pecasDistribuidas) {
		this.pecasDistribuidas = pecasDistribuidas;
	}

	public Integer getPecasNaoDistribuidas() {
		return pecasNaoDistribuidas;
	}

	public void setPecasNaoDistribuidas(Integer pecasNaoDistribuidas) {
		this.pecasNaoDistribuidas = pecasNaoDistribuidas;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Integer getTempoJogado() {
		return tempoJogado;
	}

	public void setTempoJogado(Integer tempoJogado) {
		this.tempoJogado = tempoJogado;
	}

	public String getPecasJogador() {
		return pecasJogador;
	}

	public void setPecasJogador(String pecasJogador) {
		this.pecasJogador = pecasJogador;
	}

	public String getPecasComputador() {
		return pecasComputador;
	}

	public void setPecasComputador(String pecasComputador) {
		this.pecasComputador = pecasComputador;
	}

	public String getEstadoDoJogo() {
		return estadoDoJogo;
	}

	public void setEstadoDoJogo(String estadoDoJogo) {
		this.estadoDoJogo = estadoDoJogo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
