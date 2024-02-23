package br.com.locacao.veiculos.main.models;

import java.util.ArrayList;

public class Marca {
		
	private String descricaoMarca;
	private ArrayList<Modelo> modelo;
	
	public Marca() {
	}
	
	public String consultarMarca() {
		return this.descricaoMarca;
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

	/**
	 * @return the modelo
	 */
	public ArrayList<Modelo> getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(ArrayList<Modelo> modelo) {
		this.modelo = modelo;
	}
}
