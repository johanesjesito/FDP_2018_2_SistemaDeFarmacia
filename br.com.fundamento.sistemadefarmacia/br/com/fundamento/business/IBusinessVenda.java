package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.modelos.Venda;

public interface IBusinessVenda {
	
    public void salvar(Venda venda);
    public Venda buscarPorId(int id);
    public List<Venda> getAll();
    public void editar(Venda venda);
    public void ativarDesativar(int id);

}
