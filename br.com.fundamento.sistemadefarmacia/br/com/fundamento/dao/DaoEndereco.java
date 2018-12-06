package br.com.fundamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.fundamento.modelos.Endereco;
import br.com.fundamento.sql.SQLConections;
import br.com.fundamento.sql.SQLUtil;

public class DaoEndereco implements IDaoEndereco {

    private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    DaoCidade daoCidade = new DaoCidade();
	
	@Override
	public int salvar(Endereco endereco) {
		int id = 0;
		try {
			int id_cidade = this.daoCidade.salvar(endereco.getCidade());
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Endereco.INSERT);
            this.statement.setString(1, endereco.getNumero());
            this.statement.setInt(2, id_cidade);
            this.result = this.statement.executeQuery();
            
            if (result.next()) {
                id = result.getInt(1);
            }
            this.statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoEndereco.class.getName()).log(Level.SEVERE, null, ex);
        }
		return id;
	}

	@Override
	public Endereco buscarPorId(int id) {
		Endereco endereco = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Endereco.NOME_TABELA, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
                endereco = new Endereco();
                endereco.setId(result.getInt(1));
                endereco.setNumero(result.getString(SQLUtil.Endereco.COL_NUMERO));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoEndereco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return endereco;
	}

	@Override
	public List<Endereco> getAll() {
		List<Endereco> enderecos = new ArrayList<>();
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectAll(SQLUtil.Endereco.NOME_TABELA));
            this.result = this.statement.executeQuery();
            Endereco endereco;
            while (result.next()) {
                endereco = new Endereco();
                endereco.setId(result.getInt(1));
                endereco.setNumero(result.getString(SQLUtil.Endereco.COL_NUMERO));
                enderecos.add(endereco);
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoEndereco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enderecos;
	}

	@Override
	public void editar(Endereco endereco) {
        throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}
	
	

}
