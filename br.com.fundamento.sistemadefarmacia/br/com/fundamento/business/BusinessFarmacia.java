package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.dao.DaoFarmacia;
import br.com.fundamento.dao.IDaoFarmacia;
import br.com.fundamento.modelos.Farmacia;

public class BusinessFarmacia implements IBusinessFarmacia{

	IDaoFarmacia daoFarmacia;
	
	public BusinessFarmacia() {
		this.daoFarmacia = new DaoFarmacia();
	}

	@Override
	public int salvar(Farmacia farmacia) {
		return this.daoFarmacia.salvar(farmacia);
	}

	@Override
	public Farmacia buscarPorId(int id) {
		return this.daoFarmacia.buscarPorId(id);
	}

	@Override
	public List<Farmacia> getAll() {
		return this.daoFarmacia.getAll();
	}

	@Override
	public void editar(Farmacia farmacia) {
        throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
	}
	
}
