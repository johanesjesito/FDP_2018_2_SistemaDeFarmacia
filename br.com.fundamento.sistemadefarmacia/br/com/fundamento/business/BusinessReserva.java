package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.dao.DaoReserva;
import br.com.fundamento.dao.IDaoReserva;
import br.com.fundamento.modelos.Reserva;

public class BusinessReserva implements IBusinessReserva {

	IDaoReserva daoReserva;
	
	public BusinessReserva() {
		daoReserva = new DaoReserva();
	}

	@Override
	public int salvar(Reserva reserva) {
		return this.daoReserva.salvar(reserva);
	}

	@Override
	public Reserva buscarPorId(int id) {
		return this.daoReserva.buscarPorId(id);
	}

	@Override
	public List<Reserva> getAll() {
		return this.daoReserva.getAll();
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
