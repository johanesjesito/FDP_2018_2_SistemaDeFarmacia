package br.com.fundamento.business;

import java.util.List;

import br.com.fundamento.modelos.Rua;

public interface IBusinessRua {
	
    public int salvar(Rua rua);
    public Rua buscarPorId(int id);
    public List<Rua> getAll();
    public void editar(Rua rua);
    public void ativarDesativar(int id);


}
