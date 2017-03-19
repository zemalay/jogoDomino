package br.com.domino.model;

public class Pecas {

	private Integer valorTopo;
	private Integer valorInferior;
	private Integer pecaAssociada;
	private int estadoDoJogo;

	public Integer getValorTopo() {
		return valorTopo;
	}

	public void setValorTopo(Integer valorTopo) {
		this.valorTopo = valorTopo;
	}

	public Integer getValorInferior() {
		return valorInferior;
	}

	public void setValorInferior(Integer valorInferior) {
		this.valorInferior = valorInferior;
	}

	public Integer getPecaAssociada() {
		return pecaAssociada;
	}

	public void setPecaAssociada(Integer pecaAssociada) {
		this.pecaAssociada = pecaAssociada;
	}

	public int getEstadoDoJogo() {
		return estadoDoJogo;
	}

	public void setEstadoDoJogo(int estadoDoJogo) {
		this.estadoDoJogo = estadoDoJogo;
	}

}
