package br.com.fundamento.dao;

import br.com.fundamento.modelos.Cliente;
import br.com.fundamento.sql.SQLConections;
import br.com.fundamento.sql.SQLUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoCliente implements IDaoCliente {

    private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
    DaoEndereco daoEndereco = new DaoEndereco();

    @Override
    public int salvar(Cliente cliente) {
    	int id = 0;
		try {
			int id_endereco = this.daoEndereco.salvar(cliente.getEndereco());
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Cliente.INSERT);
            this.statement.setString(1, cliente.getNome());
            this.statement.setString(2, cliente.getCpf());
            this.statement.setInt(3, id_endereco);
            this.result = this.statement.executeQuery();
            
            if (result.next()) {
                id = result.getInt(1);
            }
            this.statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
		return id;
    }

	@Override
	public Cliente buscarPorId(int id) {
		Cliente cliente = null;
		try {
			this.conexao = SQLConections.getInstance();
			this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Cliente.NOME_TABELA, id));
			this.result = this.statement.executeQuery();

			if (result.next()) {
				cliente = new Cliente();
				cliente.setId(result.getInt(1));
				cliente.setNome(result.getString(SQLUtil.Cliente.COL_NOME));
			}
			this.conexao.close();

		} catch (SQLException ex) {
			Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
		}
		return cliente;
	}

	@Override
	public List<Cliente> getAll() {
		List<Cliente> clientes = new ArrayList<>();
		try {
			this.conexao = SQLConections.getInstance();
			this.statement = this.conexao.prepareStatement(SQLUtil.selectAll(SQLUtil.Cliente.NOME_TABELA));
			this.result = this.statement.executeQuery();
			Cliente cliente;
			while (result.next()) {
				cliente = new Cliente();
				cliente.setId(result.getInt(1));
				cliente.setNome(result.getString(SQLUtil.Cliente.COL_NOME));
				clientes.add(cliente);
			}
			this.conexao.close();

		} catch (SQLException ex) {
			Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
		}
		return clientes;
	}

    @Override
    public void editar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
