package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.modelos.Farmacia;

public interface IBusinessFarmacia {

    public void salvar(Farmacia farmacia);
    public Farmacia buscarPorId(int id);
    public List<Farmacia> getAll();
    public void editar(Farmacia farmacia);
    public void ativarDesativar(int id);

	
}
