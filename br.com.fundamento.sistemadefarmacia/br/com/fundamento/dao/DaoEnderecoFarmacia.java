package br.com.fundamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.fundamento.modelos.EnderecoFarmacia;
import br.com.fundamento.sql.SQLConections;
import br.com.fundamento.sql.SQLUtil;

public class DaoEnderecoFarmacia implements IDaoEnderecoFarmacia {

	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	DaoCidade daoCidade = new DaoCidade();

	@Override
	public int salvar(EnderecoFarmacia enderecoFarmacia) {
		int id = 0;
		try {
			int id_cidade = this.daoCidade.salvar(enderecoFarmacia.getCidade());
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.EnderecoFarmacia.INSERT);
            this.statement.setString(1, enderecoFarmacia.getNumero());
            this.statement.setInt(2, id_cidade);
            this.result = this.statement.executeQuery();
            
            if (result.next()) {
                id = result.getInt(1);
            }
            this.statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoEnderecoFarmacia.class.getName()).log(Level.SEVERE, null, ex);
        }
		return id;
	}

	@Override
	public EnderecoFarmacia buscarPorId(int id) {
		EnderecoFarmacia enderecoFarmacia = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.EnderecoFarmacia.NOME_TABELA, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
                enderecoFarmacia = new EnderecoFarmacia();
                enderecoFarmacia.setId(result.getInt(1));
                enderecoFarmacia.setNumero(result.getString(SQLUtil.EnderecoFarmacia.COL_NUMERO));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoEnderecoFarmacia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enderecoFarmacia;
	}

	@Override
	public List<EnderecoFarmacia> getAll() {
		List<EnderecoFarmacia> enderecoFarmacias = new ArrayList<>();
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectAll(SQLUtil.EnderecoFarmacia.NOME_TABELA));
            this.result = this.statement.executeQuery();
            EnderecoFarmacia enderecoFarmacia;
            while (result.next()) {
                enderecoFarmacia = new EnderecoFarmacia();
                enderecoFarmacia.setId(result.getInt(1));
                enderecoFarmacia.setNumero(result.getString(SQLUtil.EnderecoFarmacia.COL_NUMERO));
                enderecoFarmacias.add(enderecoFarmacia);
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoEnderecoFarmacia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enderecoFarmacias;
	}

	@Override
	public void editar(EnderecoFarmacia enderecoFarmacia) {
        throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}
	
}
