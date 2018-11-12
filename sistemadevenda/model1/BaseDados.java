package model1;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Produto> produtos = new ArrayList<Produto>();

	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	private static Gerente gerente = new Gerente("João", "Admin", "admin", "99999-9999", "123456789");

	public boolean confirmarFuncionario(String login, String senha) {
		for (Funcionario func : funcionarios) {
			if (func.getLogin().equalsIgnoreCase(login) && func.getSenha().equals(senha))
				return true;
		}
		return false;
	}

	public boolean confirmarGerente(String login, String senha) {
		if (login.equalsIgnoreCase(gerente.getLogin()) && senha.equals(gerente.getSenha()))
			return true;
		return false;
	}

	public boolean validarFuncionario(String login) {

		for (Funcionario func : funcionarios) {
			if (func.getLogin().equalsIgnoreCase(login))
				return false;
		}
		return true;
	}

	public boolean validarProduto(String nome) {
		for (Produto prod : produtos) {
			if (prod.getProduto().equalsIgnoreCase(nome))
				return false;
		}
		return true;
	}
	
	public boolean validarQuantidade(int quantidade) {
		for (Produto prod : produtos) {
			if (quantidade >= 0 && quantidade <= prod.getQuantidade())
				return false;
		}
		return true;
	}

	public static ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public static void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		BaseDados.funcionarios = funcionarios;
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public static void setProdutos(ArrayList<Produto> produtos) {
		BaseDados.produtos = produtos;
	}

}
