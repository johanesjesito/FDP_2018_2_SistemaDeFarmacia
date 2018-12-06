package br.com.fundamento.dao;

import br.com.fundamento.modelos.Cliente;
import java.util.List;

public interface IDaoCliente {
    
    public void salvar(Cliente cliente);
    public Cliente buscarPorId(int id);
    public List<Cliente> getAll();
    public void editar(Cliente cliente);
    public void ativarDesativar(int id);
    
    
    
}
