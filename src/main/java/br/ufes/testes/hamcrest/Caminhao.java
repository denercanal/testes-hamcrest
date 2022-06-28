package br.ufes.testes.hamcrest;

public class Caminhao {

	private String modelo;
	private String fabricante;
	private Integer ano;

	public Caminhao( String modelo, String fabricante, Integer ano ) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
	}

	// getters/setters
	public String getModelo() {
		return modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno( Integer ano ) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Caminhao{modelo:" + this.getModelo() + ", ano:" + this.getAno().toString() + ", fabricante" + this.getFabricante();
	}

}
