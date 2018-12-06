package br.com.fundamento.dao;

import java.util.List;

import br.com.fundamento.modelos.Farmacia;

public interface IDaoFarmacia {

    public void salvar(Farmacia farmacia);
    public Farmacia buscarPorId(int id);
    public List<Farmacia> getAll();
    public void editar(Farmacia farmacia);
    public void ativarDesativar(int id);

	
}
