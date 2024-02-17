package br.com.locacao.veiculos.main.models;

public class Modelo {
		
	private String descricaoModelo;
	
	public Modelo(String descricaoModelo) {
		this.setDescricaoModelo(descricaoModelo);
	}

	/**
	 * @return the descricaoModelo
	 */
	public String getDescricaoModelo() {
		return descricaoModelo;
	}
	
	/**
	 * @param descricaoModelo the descricaoModelo to set
	 */
	public void setDescricaoModelo(String descricaoModelo) {
		this.descricaoModelo = descricaoModelo;
	}

}	