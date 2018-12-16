package br.com.fundamento.dao;

import java.util.List;

import br.com.fundamento.modelos.EnderecoFarmacia;

public interface IDaoEnderecoFarmacia {
	
    public int salvar(EnderecoFarmacia enderecofarmacia);
    public EnderecoFarmacia buscarPorId(int id);
    public List<EnderecoFarmacia> getAll();
    public void editar(EnderecoFarmacia enderecofarmacia);
    public void ativarDesativar(int id);


}
