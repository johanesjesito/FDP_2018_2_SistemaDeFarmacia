package br.com.fundamento.dao;

import java.util.List;

import br.com.fundamento.modelos.Funcionario;

public interface IDaoFuncionario {
	
    public int salvar(Funcionario funcionario);
    public Funcionario buscarPorId(int id);
    public List<Funcionario> getAll();
    public void editar(Funcionario funcionario);
    public void ativarDesativar(int id);


}
