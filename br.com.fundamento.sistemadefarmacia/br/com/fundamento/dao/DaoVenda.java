package br.com.fundamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.fundamento.modelos.Venda;
import br.com.fundamento.sql.SQLConections;
import br.com.fundamento.sql.SQLUtil;

public class DaoVenda implements IDaoVenda {
	
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	DaoFuncionario daoFuncionario = new DaoFuncionario();
	DaoCliente daoCliente = new DaoCliente();
	DaoProduto daoProduto = new DaoProduto();
	
	@Override
	public int salvar(Venda venda) {
		int id = 0;
		try {
			int id_produto = this.daoProduto.salvar(venda.getProduto());
			int id_cliente = this.daoCliente.salvar(venda.getCliente());
			int id_funcionario = this.daoFuncionario.salvar(venda.getFuncionario());
			this.conexao = SQLConections.getInstance();
			this.statement = this.conexao.prepareStatement(SQLUtil.Venda.INSERT);
			this.statement.setInt(1, venda.getQuantidade());
			this.statement.setFloat(2, venda.getValor());
			this.statement.setInt(3, id_produto);
			this.statement.setInt(3, id_cliente);
			this.statement.setInt(3, id_funcionario);			
			this.result = this.statement.executeQuery();

			if (result.next()) {
				id = result.getInt(1);
			}
			this.statement.close();
		} catch (SQLException ex) {
			Logger.getLogger(DaoVenda.class.getName()).log(Level.SEVERE, null, ex);
		}
		return id;
	}
	@Override
	public Venda buscarPorId(int id) {
		Venda venda = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Venda.NOME_TABELA, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
                venda = new Venda();
                venda.setId(result.getInt(1));
                venda.setQuantidade(result.getInt(SQLUtil.Venda.COL_QUANTIDADE));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return venda;
	}
	
	@Override
	public List<Venda> getAll() {
		List<Venda> vendas = new ArrayList<>();
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectAll(SQLUtil.Venda.NOME_TABELA));
            this.result = this.statement.executeQuery();
            Venda venda;
            while (result.next()) {
                venda = new Venda();
                venda.setId(result.getInt(1));
                venda.setQuantidade(result.getInt(SQLUtil.Venda.COL_QUANTIDADE));
                vendas.add(venda);
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vendas;
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
