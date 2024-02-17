package br.com.locacao.veiculos.main.models;

public class Automovel {

	private String placaAutomovel;
	private Long renavamAutomovel; 
	private String classiAutomovel;
	private String corAutomovel;
	private Integer numeroPortasAutomovel;
	private Integer tipoCombustivelAutomovel;
	private Long quilometragemAutomovel;
	private Double valorLocacaoAutomovel;
	
	public Automovel() {
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
}
