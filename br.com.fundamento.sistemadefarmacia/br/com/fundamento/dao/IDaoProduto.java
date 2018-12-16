package br.com.fundamento.dao;

import br.com.fundamento.modelos.Produto;
import java.util.List;

public interface IDaoProduto {
    
    public int salvar(Produto produto);
    public Produto buscarPorId(int id);
    public List<Produto> getAll();
    public void editar(Produto produto);
    public void ativarDesativar(int id);
    
    
    
}
