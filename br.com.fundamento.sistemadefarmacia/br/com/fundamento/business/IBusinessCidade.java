package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.modelos.Cidade;

public interface IBusinessCidade {
	
    public int salvar(Cidade cidade);
    public Cidade buscarPorId(int id);
    public List<Cidade> getAll();
    public void editar(Cidade cidade);
    public void ativarDesativar(int id);


}
