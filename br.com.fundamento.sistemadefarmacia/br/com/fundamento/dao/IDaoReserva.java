package br.com.fundamento.dao;

import java.util.List;

import br.com.fundamento.modelos.Reserva;

public interface IDaoReserva {
	
    public int salvar(Reserva reserva);
    public Reserva buscarPorId(int id);
    public List<Reserva> getAll();
    public void editar(Reserva reserva);
    public void ativarDesativar(int id);

}
