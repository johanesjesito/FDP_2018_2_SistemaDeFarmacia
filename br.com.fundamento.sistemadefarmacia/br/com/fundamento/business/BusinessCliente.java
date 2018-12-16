package br.com.fundamento.business;

import br.com.fundamento.dao.DaoCliente;
import br.com.fundamento.dao.IDaoCliente;
import br.com.fundamento.modelos.Cliente;
import java.util.List;

public class BusinessCliente implements IBusinessCliente{

    IDaoCliente daoCliente;
    
    public BusinessCliente(){
        this.daoCliente = new DaoCliente();
    }
    
    
    @Override
    public int salvar(Cliente cliente) {
    	return this.daoCliente.salvar(cliente);
    }

    @Override
    public Cliente buscarPorId(int id) {
        return this.daoCliente.buscarPorId(id);
    }

    @Override
    public List<Cliente> getAll() {
    	return this.daoCliente.getAll();
    }

    @Override
    public void editar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
