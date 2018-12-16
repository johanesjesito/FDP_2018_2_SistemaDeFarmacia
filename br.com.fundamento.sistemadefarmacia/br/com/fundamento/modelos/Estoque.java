package br.com.fundamento.modelos;

public class Estoque {
	
	private int id;
	private int quantidade;
	private Produto produto;
	
	public Estoque() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProdutos(Produto produto) {
		this.produto = produto;
	}

}
