package br.com.fundamento.modelos;

public class Cliente {
    
	private int id;
	private Cidade nome;
	private String cpf;
	private Endereco endereco;
    
    public Cliente() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cidade getNome() {
		return nome;
	}

	public void setNome(Cidade nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
 
}
