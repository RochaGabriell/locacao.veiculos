package br.com.locacao.veiculos.main.models;

import java.util.ArrayList;

public class Automovel {

	private String placaAutomovel;
	private Long renavamAutomovel; 
	private String classiAutomovel;
	private String corAutomovel;
	private Integer numeroPortasAutomovel;
	private Integer tipoCombustivelAutomovel;
	private Long quilometragemAutomovel;
	private Double valorLocacaoAutomovel;
	private Modelo modelo;
	private ArrayList<Locacao> locacoes;
	
	public Automovel() {
		setLocacoes(new ArrayList<Locacao>());
	}
	
	public String consultarAutomovel() {
		return "Placa: " + placaAutomovel + "\n" +
	               "Renavam: " + renavamAutomovel + "\n" +
	               "Classificação: " + classiAutomovel + "\n" +
	               "Cor: " + corAutomovel + "\n" +
	               "Número de Portas: " + numeroPortasAutomovel + "\n" +
	               "Tipo de Combustível: " + tipoCombustivelAutomovel + "\n" +
	               "Quilometragem: " + quilometragemAutomovel + "\n" +
	               "Valor de Locação: " + valorLocacaoAutomovel + "\n" +
	               "Modelo: " + modelo.consultarModelo();
	}

	/**
	 * @return the placaAutomovel
	 */
	public String getPlacaAutomovel() {
		return placaAutomovel;
	}

	/**
	 * @param placaAutomovel the placaAutomovel to set
	 */
	public void setPlacaAutomovel(String placaAutomovel) {
		this.placaAutomovel = placaAutomovel;
	}

	/**
	 * @return the renavamAutomovel
	 */
	public Long getRenavamAutomovel() {
		return renavamAutomovel;
	}

	/**
	 * @param renavamAutomovel the renavamAutomovel to set
	 */
	public void setRenavamAutomovel(Long renavamAutomovel) {
		this.renavamAutomovel = renavamAutomovel;
	}

	/**
	 * @return the classiAutomovel
	 */
	public String getClassiAutomovel() {
		return classiAutomovel;
	}

	/**
	 * @param classiAutomovel the classiAutomovel to set
	 */
	public void setClassiAutomovel(String classiAutomovel) {
		this.classiAutomovel = classiAutomovel;
	}

	/**
	 * @return the corAutomovel
	 */
	public String getCorAutomovel() {
		return corAutomovel;
	}

	/**
	 * @param corAutomovel the corAutomovel to set
	 */
	public void setCorAutomovel(String corAutomovel) {
		this.corAutomovel = corAutomovel;
	}

	/**
	 * @return the numeroPortasAutomovel
	 */
	public Integer getNumeroPortasAutomovel() {
		return numeroPortasAutomovel;
	}

	/**
	 * @param numeroPortasAutomovel the numeroPortasAutomovel to set
	 */
	public void setNumeroPortasAutomovel(Integer numeroPortasAutomovel) {
		this.numeroPortasAutomovel = numeroPortasAutomovel;
	}

	/**
	 * @return the tipoCombustivelAutomovel
	 */
	public Integer getTipoCombustivelAutomovel() {
		return tipoCombustivelAutomovel;
	}

	/**
	 * @param tipoCombustivelAutomovel the tipoCombustivelAutomovel to set
	 */
	public void setTipoCombustivelAutomovel(Integer tipoCombustivelAutomovel) {
		this.tipoCombustivelAutomovel = tipoCombustivelAutomovel;
	}

	/**
	 * @return the quilometragemAutomovel
	 */
	public Long getQuilometragemAutomovel() {
		return quilometragemAutomovel;
	}

	/**
	 * @param quilometragemAutomovel the quilometragemAutomovel to set
	 */
	public void setQuilometragemAutomovel(Long quilometragemAutomovel) {
		this.quilometragemAutomovel = quilometragemAutomovel;
	}

	/**
	 * @return the valorLocacaoAutomovel
	 */
	public Double getValorLocacaoAutomovel() {
		return valorLocacaoAutomovel;
	}

	/**
	 * @param valorLocacaoAutomovel the valorLocacaoAutomovel to set
	 */
	public void setValorLocacaoAutomovel(Double valorLocacaoAutomovel) {
		this.valorLocacaoAutomovel = valorLocacaoAutomovel;
	}
	
	/**
	 * @return the modelo
	 */
	public Modelo getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the locacoes
	 */
	public ArrayList<Locacao> getLocacoes() {
		return locacoes;
	}

	/**
	 * @param locacoes the locacoes to set
	 */
	public void setLocacoes(ArrayList<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
}
