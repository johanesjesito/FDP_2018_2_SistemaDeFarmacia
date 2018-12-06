package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.modelos.Estoque;

public interface IBusinessEstoque {
	
    public void salvar(Estoque estoque);
    public Estoque buscarPorId(int id);
    public List<Estoque> getAll();
    public void editar(Estoque estoque);
    public void ativarDesativar(int id);


}
