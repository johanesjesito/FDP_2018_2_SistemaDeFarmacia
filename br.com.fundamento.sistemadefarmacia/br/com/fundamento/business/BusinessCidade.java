package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.dao.DaoCidade;
import br.com.fundamento.dao.IDaoCidade;
import br.com.fundamento.modelos.Cidade;

public class BusinessCidade implements IBusinessCidade{
	
	IDaoCidade daoCidade;
	
	public BusinessCidade() {
		// TODO Auto-generated constructor stub
		this.daoCidade = new DaoCidade();
	}

	@Override
	public int salvar(Cidade cidade) {
		// TODO Auto-generated method stub
		return this.daoCidade.salvar(cidade);
	}

	@Override
	public Cidade buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.daoCidade.buscarPorId(id);
	}

	@Override
	public List<Cidade> getAll() {
		// TODO Auto-generated method stub
		return this.daoCidade.getAll();
	}

	@Override
	public void editar(Cidade cidade) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

}
