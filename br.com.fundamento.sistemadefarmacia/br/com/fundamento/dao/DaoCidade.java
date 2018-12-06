package br.com.fundamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.fundamento.modelos.Cidade;
import br.com.fundamento.sql.SQLConections;
import br.com.fundamento.sql.SQLUtil;

public class DaoCidade implements IDaoCidade{

	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	DaoRua daoRua = new DaoRua();

	@Override
	public int salvar(Cidade cidade) {
		int id = 0;
		try {
			
			int id_rua = this.daoRua.salvar(cidade.getRua());
			this.conexao = SQLConections.getInstance();
			this.statement = this.conexao.prepareStatement(SQLUtil.Cidade.INSERT);
			this.statement.setString(1, cidade.getNome());
			this.statement.setString(2, cidade.getCep());
			this.statement.setInt(3, id_rua);
			this.result = this.statement.executeQuery();
			if (result.next()) {
				id = result.getInt(1);
			}
			this.statement.close();

		} catch (SQLException ex) {
			Logger.getLogger(DaoCidade.class.getName()).log(Level.SEVERE, null, ex);
		}
		return id;

	}

	@Override
	public Cidade buscarPorId(int id) {
		Cidade cidade = null;
		try {
			this.conexao = SQLConections.getInstance();
			this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Cidade.NOME_TABELA, id));
			this.result = this.statement.executeQuery();

			if (result.next()) {
				cidade = new Cidade();
				cidade.setId(result.getInt(1));
				cidade.setNome(result.getString(SQLUtil.Cidade.COL_NOME));
			}
			this.conexao.close();

		} catch (SQLException ex) {
			Logger.getLogger(DaoCidade.class.getName()).log(Level.SEVERE, null, ex);
		}
		return cidade;
	}

	@Override
	public List<Cidade> getAll() {
		List<Cidade> cidades = new ArrayList<>();
		try {
			this.conexao = SQLConections.getInstance();
			this.statement = this.conexao.prepareStatement(SQLUtil.selectAll(SQLUtil.Cidade.NOME_TABELA));
			this.result = this.statement.executeQuery();
			Cidade cidade;
			while (result.next()) {
				cidade = new Cidade();
				cidade.setId(result.getInt(1));
				cidade.setNome(result.getString(SQLUtil.Cidade.COL_NOME));
				cidades.add(cidade);
			}
			this.conexao.close();

		} catch (SQLException ex) {
			Logger.getLogger(DaoCidade.class.getName()).log(Level.SEVERE, null, ex);
		}
		return cidades;
	}

	@Override
	public void editar(Cidade cidade) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void ativarDesativar(int id) {
		throw new UnsupportedOperationException("Not supported yet.");
	}



}
