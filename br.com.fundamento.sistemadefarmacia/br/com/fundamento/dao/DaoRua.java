package br.com.fundamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.fundamento.modelos.Rua;
import br.com.fundamento.sql.SQLConections;
import br.com.fundamento.sql.SQLUtil;

public class DaoRua implements IDaoRua {
	
    private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;

	@Override
	public int salvar(Rua rua) {

        int id = 0;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Rua.INSERT);
            this.statement.setString(1, rua.getNome());
            this.statement.setString(2, rua.getCep());
            this.result = this.statement.executeQuery();
            if (result.next()) {
                id = result.getInt(1);
            }
            this.statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoRua.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
	}

	@Override
	public Rua buscarPorId(int id) {
		Rua rua = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Rua.NOME_TABELA, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
                rua = new Rua();
                rua.setId(result.getInt(1));
                rua.setNome(result.getString(SQLUtil.Rua.COL_NOME));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoRua.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rua;
	}

	@Override
	public List<Rua> getAll() {
		List<Rua> ruas = new ArrayList<>();
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectAll(SQLUtil.Rua.NOME_TABELA));
            this.result = this.statement.executeQuery();
            Rua rua;
            while (result.next()) {
                rua = new Rua();
                rua.setId(result.getInt(1));
                rua.setNome(result.getString(SQLUtil.Rua.COL_NOME));
                ruas.add(rua);
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoRua.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ruas;
	}

	@Override
	public void editar(Rua rua) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
