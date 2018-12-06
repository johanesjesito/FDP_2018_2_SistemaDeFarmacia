package br.com.fundamento.modelos;

public class EnderecoFarmacia {

	private int id;
	private Cidade cidade;
	private String numero;

	public EnderecoFarmacia() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
