package br.com.locacao.veiculos.main.models;

public class Modelo {
		
	private String descricaoModelo;
	private Marca marca;
	
	public Modelo() {
	}
	
	public String consultarModelo() {
		return this.descricaoModelo + "\n" + 
					"Marca: " + this.marca.getDescricaoMarca();
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

	/**
	 * @return the marca
	 */
	public Marca getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}	