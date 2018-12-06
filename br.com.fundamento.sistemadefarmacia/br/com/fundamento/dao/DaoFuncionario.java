package br.com.fundamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.fundamento.modelos.Funcionario;
import br.com.fundamento.sql.SQLConections;
import br.com.fundamento.sql.SQLUtil;

public class DaoFuncionario implements IDaoFuncionario {

    private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    DaoEndereco daoEndereco = new DaoEndereco();
	
	@Override
	public int salvar(Funcionario funcionario) {
		int id = 0;
		try {
			int id_endereco = this.daoEndereco.salvar(funcionario.getEndereco());
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Funcionario.INSERT);
            this.statement.setString(1, funcionario.getNome());
            this.statement.setString(2, funcionario.getCpf());
            this.statement.setString(3, funcionario.getLogin());
            this.statement.setString(4, funcionario.getSenha());
            this.statement.setString(5, funcionario.getFuncao());   
            this.statement.setInt(6, id_endereco);
            this.result = this.statement.executeQuery();
            if (result.next()) {
                id = result.getInt(1);
            }
            this.statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
		return id;
	}

	@Override
	public Funcionario buscarPorId(int id) {
		Funcionario funcionario = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Funcionario.NOME_TABELA, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
                funcionario = new Funcionario();
                funcionario.setId(result.getInt(1));
                funcionario.setNome(result.getString(SQLUtil.Funcionario.COL_NOME));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return funcionario;
	}

	@Override
	public List<Funcionario> getAll() {
		List<Funcionario> funcionarios = new ArrayList<>();
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectAll(SQLUtil.Funcionario.NOME_TABELA));
            this.result = this.statement.executeQuery();
            Funcionario funcionario;
            while (result.next()) {
                funcionario = new Funcionario();
                funcionario.setId(result.getInt(1));
                funcionario.setNome(result.getString(SQLUtil.Funcionario.COL_NOME));
                funcionarios.add(funcionario);
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return funcionarios;
	}

	@Override
	public void editar(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}	

}
