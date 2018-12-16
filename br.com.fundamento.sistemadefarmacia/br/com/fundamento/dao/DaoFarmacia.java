package br.com.fundamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.fundamento.modelos.Farmacia;
import br.com.fundamento.sql.SQLConections;
import br.com.fundamento.sql.SQLUtil;

public class DaoFarmacia implements IDaoFarmacia {
	
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	DaoEstoque daoEstoque = new DaoEstoque();
	DaoFuncionario daoFuncionario = new DaoFuncionario();
	DaoEnderecoFarmacia daoEnderecoFarmacia = new DaoEnderecoFarmacia();

	@Override
	public int salvar(Farmacia farmacia) {
		int id = 0;
		try {
			int id_estoque = this.daoEstoque.salvar(farmacia.getEstoque());
			int id_funcionario = this.daoFuncionario.salvar(farmacia.getFuncionario());
			int id_enderecoFarmacia = this.daoEnderecoFarmacia.salvar(farmacia.getEnderecoFarmacia());
			this.conexao = SQLConections.getInstance();
			this.statement = this.conexao.prepareStatement(SQLUtil.Farmacia.INSERT);
			this.statement.setString(1, farmacia.getNome());
			this.statement.setInt(2, id_estoque);
			this.statement.setInt(3, id_funcionario);
			this.statement.setInt(4, id_enderecoFarmacia);
			this.result = this.statement.executeQuery();

			if (result.next()) {
				id = result.getInt(1);
			}
			this.statement.close();
		} catch (SQLException ex) {
			Logger.getLogger(DaoFarmacia.class.getName()).log(Level.SEVERE, null, ex);
		}
		return id;
	}

	@Override
	public Farmacia buscarPorId(int id) {
		Farmacia farmacia = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Farmacia.NOME_TABELA, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
                farmacia = new Farmacia();
                farmacia.setId(result.getInt(1));
                farmacia.setNome(result.getString(SQLUtil.Farmacia.COL_NOME));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoFarmacia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return farmacia;
	}

	@Override
	public List<Farmacia> getAll() {
		List<Farmacia> farmacias = new ArrayList<>();
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectAll(SQLUtil.Farmacia.NOME_TABELA));
            this.result = this.statement.executeQuery();
            Farmacia farmacia;
            while (result.next()) {
                farmacia = new Farmacia();
                farmacia.setId(result.getInt(1));
                farmacia.setNome(result.getString(SQLUtil.Farmacia.COL_NOME));
                farmacias.add(farmacia);
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoFarmacia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return farmacias;
	}

	@Override
	public void editar(Farmacia farmacia) {
        throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");		
	}

}
