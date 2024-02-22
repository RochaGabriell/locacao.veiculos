package br.com.locacao.veiculos.main.models;

public class Cliente {
	
	private Long cpfCliente;
	private String nomeCliente;
	private String enderecoCliente;
	private String telefoneCliente;
	private String emailCliente;
	
	public Cliente() {
	}
	
	public String consultarCliente() {
		return "CPF: " + this.cpfCliente + "\n" +
					"Nome: " + this.nomeCliente + "\n" +
					"Endereço: " + this.enderecoCliente + "\n" +
					"Telefone: " + this.telefoneCliente + "\n" +
					"Email: " + this.emailCliente;
	}

	/**
	 * @return the cpfCliente
	 */
	public Long getCpfCliente() {
		return cpfCliente;
	}

	/**
	 * @param cpfCliente the cpfCliente to set
	 */
	public void setCpfCliente(Long cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	/**
	 * @return the nomeCliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * @param nomeCliente the nomeCliente to set
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	/**
	 * @return the enderecoCliente
	 */
	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	/**
	 * @param enderecoCliente the enderecoCliente to set
	 */
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	/**
	 * @return the telefoneCliente
	 */
	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	/**
	 * @param telefoneCliente the telefoneCliente to set
	 */
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	/**
	 * @return the emailCliente
	 */
	public String getEmailCliente() {
		return emailCliente;
	}

	/**
	 * @param emailCliente the emailCliente to set
	 */
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	
}
