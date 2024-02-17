package br.com.locacao.veiculos.main.models;
	
public class Marca {
		
	private String descricaoMarca;
	
	public Marca(String descricaoMarca) {
		this.descricaoMarca = descricaoMarca;
	}

	/**
	 * @return the descricaoMarca
	 */
	public String getDescricaoMarca() {
		return descricaoMarca;	
	}

	/**
	 * @param descricaoMarca the descricaoMarca to set
	 */
	public void setDescricaoMarca(String descricaoMarca) {
		this.descricaoMarca = descricaoMarca;
	}
}
