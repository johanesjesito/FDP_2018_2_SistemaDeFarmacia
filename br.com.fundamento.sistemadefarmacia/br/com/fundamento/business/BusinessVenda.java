package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.dao.DaoVenda;
import br.com.fundamento.dao.IDaoVenda;
import br.com.fundamento.modelos.Venda;

public class BusinessVenda implements IBusinessVenda {
	
	IDaoVenda daoVenda;
	
	public BusinessVenda() {
		this.daoVenda = new DaoVenda();
	}

	@Override
	public int salvar(Venda venda) {
		return this.daoVenda.salvar(venda);
	}

	@Override
	public Venda buscarPorId(int id) {
		return this.daoVenda.buscarPorId(id);
	}

	@Override
	public List<Venda> getAll() {
		return this.daoVenda.getAll();
	}

	@Override
	public void editar(Venda venda) {
        throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
	}

}
