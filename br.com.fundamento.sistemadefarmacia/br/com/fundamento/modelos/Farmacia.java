package br.com.fundamento.modelos;

public class Farmacia {
	
	private int id;
	private String nome;
	private Estoque estoque;
	private Funcionario funcionario;
	private EnderecoFarmacia enderecofarmacia;
	
	public Farmacia() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public EnderecoFarmacia getEnderecoFarmacia() {
		return enderecofarmacia;
	}

	public void setEnderecoFarmacia(EnderecoFarmacia enderecofarmacia) {
		this.enderecofarmacia = enderecofarmacia;
	}

}
