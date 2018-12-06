package br.com.fundamento.dao;

import java.util.List;

import br.com.fundamento.modelos.Cidade;

public interface IDaoCidade {
	
    public int salvar(Cidade cidade);
    public Cidade buscarPorId(int id);
    public List<Cidade> getAll();
    public void editar(Cidade cidade);
    public void ativarDesativar(int id);


}
