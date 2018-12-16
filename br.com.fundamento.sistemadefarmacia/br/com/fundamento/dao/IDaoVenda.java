package br.com.fundamento.dao;

import java.util.List;

import br.com.fundamento.modelos.Venda;

public interface IDaoVenda {
	
    public int salvar(Venda venda);
    public Venda buscarPorId(int id);
    public List<Venda> getAll();
    public void editar(Venda venda);
    public void ativarDesativar(int id);

}
