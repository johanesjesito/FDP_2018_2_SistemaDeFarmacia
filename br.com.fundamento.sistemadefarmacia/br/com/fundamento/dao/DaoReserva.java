package br.com.fundamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.fundamento.modelos.Reserva;
import br.com.fundamento.sql.SQLConections;
import br.com.fundamento.sql.SQLUtil;

public class DaoReserva implements IDaoReserva {
	
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	DaoCliente daoCliente = new DaoCliente();
	DaoProduto daoProduto = new DaoProduto();
			
	@Override
	public int salvar(Reserva reserva) {
		int id = 0;
		try {
			int id_produto = this.daoProduto.salvar(reserva.getProduto());
			int id_cliente = this.daoCliente.salvar(reserva.getCliente());
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Reserva.INSERT);
            this.statement.setInt(1, reserva.getQuantidade());
            this.statement.setInt(2, id_produto);
            this.statement.setInt(3, id_cliente);
            this.result = this.statement.executeQuery();
            
            if (result.next()) {
                id = result.getInt(1);
            }
            this.statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
		return id;	
	}

	@Override
	public Reserva buscarPorId(int id) {
		Reserva reserva = null;
		try {
			this.conexao = SQLConections.getInstance();
			this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Reserva.NOME_TABELA, id));
			this.result = this.statement.executeQuery();

			if (result.next()) {
				reserva = new Reserva();
				reserva.setId(result.getInt(1));
				reserva.setQuantidade(result.getInt(SQLUtil.Reserva.COL_QUANTIDADE));
			}
			this.conexao.close();

		} catch (SQLException ex) {
			Logger.getLogger(DaoReserva.class.getName()).log(Level.SEVERE, null, ex);
		}
		return reserva;
	}

	@Override
	public List<Reserva> getAll() {
		List<Reserva> reservas = new ArrayList<>();
		try {
			this.conexao = SQLConections.getInstance();
			this.statement = this.conexao.prepareStatement(SQLUtil.selectAll(SQLUtil.Reserva.NOME_TABELA));
			this.result = this.statement.executeQuery();
			Reserva reserva;
			while (result.next()) {
				reserva = new Reserva();
				reserva.setId(result.getInt(1));
				reserva.setQuantidade(result.getInt(SQLUtil.Reserva.COL_QUANTIDADE));
				reservas.add(reserva);
			}
			this.conexao.close();

		} catch (SQLException ex) {
			Logger.getLogger(DaoReserva.class.getName()).log(Level.SEVERE, null, ex);
		}
		return reservas;
	}
	
	@Override
	public void editar(Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet.");		
	}
	
	@Override
	public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}


}
