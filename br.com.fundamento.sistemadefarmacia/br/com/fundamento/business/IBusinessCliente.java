package br.com.fundamento.business;

import br.com.fundamento.modelos.Cliente;
import java.util.List;

public interface IBusinessCliente {
    
    public int salvar(Cliente cliente);
    public Cliente buscarPorId(int id);
    public List<Cliente> getAll();
    public void editar(Cliente cliente);
    public void ativarDesativar(int id);
    
    
    
}
