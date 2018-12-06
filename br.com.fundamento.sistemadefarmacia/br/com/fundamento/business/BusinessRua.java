package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.dao.DaoRua;
import br.com.fundamento.dao.IDaoRua;
import br.com.fundamento.modelos.Rua;

public class BusinessRua implements IBusinessRua{
	
	IDaoRua daoRua;
	
	public BusinessRua() {
		
		this.daoRua = new DaoRua();
	}

	@Override
	public int salvar(Rua rua) {
		// TODO Auto-generated method stub
		return this.daoRua.salvar(rua);
	}

	@Override
	public Rua buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.daoRua.buscarPorId(id);
	}

	@Override
	public List<Rua> getAll() {
		// TODO Auto-generated method stub
		return this.daoRua.getAll();
	}

	@Override
	public void editar(Rua rua) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}
	
	

}
