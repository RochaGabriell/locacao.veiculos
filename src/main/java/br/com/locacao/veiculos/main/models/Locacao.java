package br.com.locacao.veiculos.main.models;

import java.util.Date;

public class Locacao {

	private Date dataHoraLocacao;
	private Date dtaHoraDevolucao;
	private Long quilometragemLocacao;
	private Long quilometragemDevolucao;
	private Long valorCaucao;
	private Double valorLocacao;
	private Boolean locacaoDevolvida;
	private Cliente cliente;
	
	public Locacao() {
	}
	
	public int registrarLocacao() {
        return 0;
    }

	/**
	 * @return the dataHoraLocacao
	 */
	public Date getDataHoraLocacao() {
		return dataHoraLocacao;
	}

	/**
	 * @param dataHoraLocacao the dataHoraLocacao to set
	 */
	public void setDataHoraLocacao(Date dataHoraLocacao) {
		this.dataHoraLocacao = dataHoraLocacao;
	}

	/**
	 * @return the dtaHoraDevolucao
	 */
	public Date getDtaHoraDevolucao() {
		return dtaHoraDevolucao;
	}

	/**
	 * @param dtaHoraDevolucao the dtaHoraDevolucao to set
	 */
	public void setDtaHoraDevolucao(Date dtaHoraDevolucao) {
		this.dtaHoraDevolucao = dtaHoraDevolucao;
	}

	/**
	 * @return the quilometragemLocacao
	 */
	public Long getQuilometragemLocacao() {
		return quilometragemLocacao;
	}

	/**
	 * @param quilometragemLocacao the quilometragemLocacao to set
	 */
	public void setQuilometragemLocacao(Long quilometragemLocacao) {
		this.quilometragemLocacao = quilometragemLocacao;
	}

	/**
	 * @return the quilometragemDevolucao
	 */
	public Long getQuilometragemDevolucao() {
		return quilometragemDevolucao;
	}

	/**
	 * @param quilometragemDevolucao the quilometragemDevolucao to set
	 */
	public void setQuilometragemDevolucao(Long quilometragemDevolucao) {
		this.quilometragemDevolucao = quilometragemDevolucao;
	}

	/**
	 * @return the valorCaucao
	 */
	public Long getValorCaucao() {
		return valorCaucao;
	}

	/**
	 * @param valorCaucao the valorCaucao to set
	 */
	public void setValorCaucao(Long valorCaucao) {
		this.valorCaucao = valorCaucao;
	}

	/**
	 * @return the valorLocacao
	 */
	public Double getValorLocacao() {
		return valorLocacao;
	}

	/**
	 * @param valorLocacao the valorLocacao to set
	 */
	public void setValorLocacao(Double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	/**
	 * @return the locacaoDevolvida
	 */
	public Boolean getLocacaoDevolvida() {
		return locacaoDevolvida;
	}

	/**
	 * @param locacaoDevolvida the locacaoDevolvida to set
	 */
	public void setLocacaoDevolvida(Boolean locacaoDevolvida) {
		this.locacaoDevolvida = locacaoDevolvida;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
