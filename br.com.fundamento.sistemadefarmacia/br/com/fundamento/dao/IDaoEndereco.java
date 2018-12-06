package br.com.fundamento.dao;

import java.util.List;

import br.com.fundamento.modelos.Endereco;

public interface IDaoEndereco {
	
    public int salvar(Endereco endereco);
    public Endereco buscarPorId(int id);
    public List<Endereco> getAll();
    public void editar(Endereco endereco);
    public void ativarDesativar(int id);


}
