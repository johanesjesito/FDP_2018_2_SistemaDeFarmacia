package br.com.fundamento.business;

import br.com.fundamento.dao.DaoProduto;
import br.com.fundamento.dao.IDaoProduto;
import br.com.fundamento.modelos.Produto;
import java.util.List;

public class BusinessProduto implements IBusinessProduto {

    IDaoProduto daoProduto;

    public BusinessProduto() {
        this.daoProduto = new DaoProduto();
    }

    @Override
    public void salvar(Produto produto) {
        this.daoProduto.salvar(produto);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
