package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.dao.DaoEnderecoFarmacia;
import br.com.fundamento.dao.IDaoEnderecoFarmacia;
import br.com.fundamento.modelos.EnderecoFarmacia;

public class BusinessEnderecoFarmacia implements IBusinessEnderecoFarmacia {

	IDaoEnderecoFarmacia daoEnderecoFarmacia;
	
	public BusinessEnderecoFarmacia() {
		this.daoEnderecoFarmacia = new DaoEnderecoFarmacia();
	}
	
	@Override
	public int salvar(EnderecoFarmacia enderecofarmacia) {
		return this.daoEnderecoFarmacia.salvar(enderecofarmacia);
	}

	@Override
	public EnderecoFarmacia buscarPorId(int id) {
		return this.daoEnderecoFarmacia.buscarPorId(id);
	}

	@Override
	public List<EnderecoFarmacia> getAll() {
		// TODO Auto-generated method stub
		return this.daoEnderecoFarmacia.getAll();
	}

	@Override
	public void editar(EnderecoFarmacia enderecofarmacia) {
        throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
	}

}
