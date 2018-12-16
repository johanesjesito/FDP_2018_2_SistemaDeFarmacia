package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.dao.DaoEstoque;
import br.com.fundamento.dao.IDaoEstoque;
import br.com.fundamento.modelos.Estoque;

public class BusinessEstoque implements IBusinessEstoque {
	
	IDaoEstoque daoEstoque;
	
	public BusinessEstoque() {
		this.daoEstoque = new DaoEstoque();
	}

	@Override
	public int salvar(Estoque estoque) {
		return this.daoEstoque.salvar(estoque);
	}

	@Override
	public Estoque buscarPorId(int id) {
		return this.daoEstoque.buscarPorId(id);
	}

	@Override
	public List<Estoque> getAll() {
		return this.daoEstoque.getAll();
	}

	@Override
	public void editar(Estoque estoque) {
        throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
	}

}
