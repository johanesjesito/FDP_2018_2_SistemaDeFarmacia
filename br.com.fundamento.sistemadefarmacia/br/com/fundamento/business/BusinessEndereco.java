package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.dao.DaoEndereco;
import br.com.fundamento.dao.IDaoEndereco;
import br.com.fundamento.modelos.Endereco;

public class BusinessEndereco implements IBusinessEndereco{
	
	IDaoEndereco daoEndereco;
	
	public BusinessEndereco() {
		// TODO Auto-generated constructor stub
		this.daoEndereco = new DaoEndereco();
	}

	@Override
	public int salvar(Endereco endereco) {
		// TODO Auto-generated method stub
		return this.daoEndereco.salvar(endereco);
	}

	@Override
	public Endereco buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.daoEndereco.buscarPorId(id);
	}

	@Override
	public List<Endereco> getAll() {
		// TODO Auto-generated method stub
		return this.daoEndereco.getAll();
	}

	@Override
	public void editar(Endereco endereco) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}
	
	

}
