package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.dao.DaoFuncionario;
import br.com.fundamento.dao.IDaoFuncionario;
import br.com.fundamento.modelos.Funcionario;

public class BusinessFuncionario implements IBusinessFuncionario{

	IDaoFuncionario daoFuncionario;
	
	public BusinessFuncionario() {
		// TODO Auto-generated constructor stub
		this.daoFuncionario = new DaoFuncionario();
	}

	@Override
	public int salvar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		return this.daoFuncionario.salvar(funcionario);
	}

	@Override
	public Funcionario buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.daoFuncionario.buscarPorId(id);
	}

	@Override
	public List<Funcionario> getAll() {
		// TODO Auto-generated method stub
		return this.daoFuncionario.getAll();
	}

	@Override
	public void editar(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}
	
	
}
