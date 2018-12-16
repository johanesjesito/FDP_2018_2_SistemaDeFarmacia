package br.com.fundamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.fundamento.modelos.Estoque;
import br.com.fundamento.sql.SQLConections;
import br.com.fundamento.sql.SQLUtil;

public class DaoEstoque implements IDaoEstoque {
	
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	DaoProduto daoProduto = new DaoProduto();

	@Override
	public int salvar(Estoque estoque) {
		int id = 0;
		try {
			int id_produto = this.daoProduto.salvar(estoque.getProduto());
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Estoque.INSERT);
            this.statement.setInt(1, estoque.getQuantidade());
            this.statement.setInt(2, id_produto);
            this.result = this.statement.executeQuery();
            
            if (result.next()) {
                id = result.getInt(1);
            }
            this.statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
		return id;
	}

	@Override
	public Estoque buscarPorId(int id) {
		Estoque estoque = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Estoque.NOME_TABELA, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
                estoque = new Estoque();
                estoque.setId(result.getInt(1));
                estoque.setQuantidade(result.getInt(SQLUtil.Estoque.COL_QUANTIDADE));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estoque;
	}

	@Override
	public List<Estoque> getAll() {
		List<Estoque> estoques = new ArrayList<>();
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectAll(SQLUtil.Estoque.NOME_TABELA));
            this.result = this.statement.executeQuery();
            Estoque estoque;
            while (result.next()) {
                estoque = new Estoque();
                estoque.setId(result.getInt(1));
                estoque.setQuantidade(result.getInt(SQLUtil.Estoque.COL_QUANTIDADE));
                estoques.add(estoque);
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estoques;
	}

	@Override
	public void editar(Estoque estoque) {
        throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

}
