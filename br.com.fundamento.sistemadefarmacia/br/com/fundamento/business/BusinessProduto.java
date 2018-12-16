package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.dao.DaoProduto;
import br.com.fundamento.dao.IDaoProduto;
import br.com.fundamento.modelos.Produto;

public class BusinessProduto implements IBusinessProduto {

    IDaoProduto daoProduto;

    public BusinessProduto() {
        this.daoProduto = new DaoProduto();
    }

    @Override
    public int salvar(Produto produto) {
        return this.daoProduto.salvar(produto);
    }

    @Override
    public Produto buscarPorId(int id) {
        return this.daoProduto.buscarPorId(id);
    }

    @Override
    public List<Produto> getAll() {
        return this.daoProduto.getAll();
    }

    @Override
    public void editar(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
