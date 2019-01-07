package br.com.fundamento.fachada;

import br.com.fundamento.business.BusinessCidade;
import br.com.fundamento.business.BusinessCliente;
import br.com.fundamento.business.BusinessEndereco;
import br.com.fundamento.business.BusinessEnderecoFarmacia;
import br.com.fundamento.business.BusinessEstoque;
import br.com.fundamento.business.BusinessFarmacia;
import br.com.fundamento.business.BusinessFuncionario;
import br.com.fundamento.business.BusinessProduto;
import br.com.fundamento.business.BusinessReserva;
import br.com.fundamento.business.BusinessRua;
import br.com.fundamento.business.BusinessVenda;
import br.com.fundamento.business.IBusinessCidade;
import br.com.fundamento.business.IBusinessCliente;
import br.com.fundamento.business.IBusinessEndereco;
import br.com.fundamento.business.IBusinessEnderecoFarmacia;
import br.com.fundamento.business.IBusinessEstoque;
import br.com.fundamento.business.IBusinessFarmacia;
import br.com.fundamento.business.IBusinessFuncionario;
import br.com.fundamento.business.IBusinessProduto;
import br.com.fundamento.business.IBusinessReserva;
import br.com.fundamento.business.IBusinessRua;
import br.com.fundamento.business.IBusinessVenda;
import br.com.fundamento.modelos.Cidade;
import br.com.fundamento.modelos.Cliente;
import br.com.fundamento.modelos.Endereco;
import br.com.fundamento.modelos.EnderecoFarmacia;
import br.com.fundamento.modelos.Estoque;
import br.com.fundamento.modelos.Farmacia;
import br.com.fundamento.modelos.Funcionario;
import br.com.fundamento.modelos.Produto;
import br.com.fundamento.modelos.Reserva;
import br.com.fundamento.modelos.Rua;
import br.com.fundamento.modelos.Venda;

import java.util.List;

public class Fachada implements IFachada {
    
    private static Fachada instance;
    private IBusinessRua businessRua;
    private IBusinessCidade businessCidade;
    private IBusinessEndereco businessEndereco;
    private IBusinessFuncionario businessFuncionario;
    private IBusinessProduto businessProduto;
    private IBusinessCliente businessCliente;
    private IBusinessEnderecoFarmacia businessEnderecoFarmacia;
    private IBusinessEstoque businessEstoque;
    private IBusinessFarmacia businessFarmacia;
    private IBusinessReserva businessReserva;
    private IBusinessVenda businessVenda;
    
    public static Fachada getInstance() {
        if (instance == null) {
            instance = new Fachada();
        }
        return instance;
    }
    
	private Fachada() {
		this.businessRua = new BusinessRua();
		this.businessCidade = new BusinessCidade();
		this.businessEndereco = new BusinessEndereco();
		this.businessFuncionario = new BusinessFuncionario();
		this.businessProduto = new BusinessProduto();
		this.businessEnderecoFarmacia = new BusinessEnderecoFarmacia();
		this.businessEstoque = new BusinessEstoque();
		this.businessFarmacia = new BusinessFarmacia();
		this.businessCliente = new BusinessCliente();
		this.businessReserva = new BusinessReserva();
		this.businessVenda = new BusinessVenda();
	}
    
    @Override
    public void salvarProduto(Produto produto) {
        this.businessProduto.salvar(produto);
    }
    
    @Override
    public Produto buscarProdutoPorId(int id) {
        return this.businessProduto.buscarPorId(id);
        
    }
    
    @Override
    public List<Produto> getAllProdutos() {
        return this.businessProduto.getAll();
    }
    
    @Override
    public void editarProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void ativarDesativarProduto(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	@Override
	public void salvarRua(Rua rua) {
        this.businessRua.salvar(rua);
	}

	@Override
	public Rua buscarRuaPorId(int id) {
		return this.businessRua.buscarPorId(id);
	}

	@Override
	public List<Rua> getAllRuas() {
        return this.businessRua.getAll();
	}

	@Override
	public void editarRua(Rua rua) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	@Override
	public void ativarDesativarRua(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void salvarCidade(Cidade cidade) {
        this.businessCidade.salvar(cidade);
	}

	@Override
	public Cidade buscarCidadePorId(int id) {
		return this.businessCidade.buscarPorId(id);
	}

	@Override
	public List<Cidade> getAllCidades() {
        return this.businessCidade.getAll();
	}

	@Override
	public void editarCidade(Cidade cidade) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	@Override
	public void ativarDesativarCidade(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void salvarEndereco(Endereco endereco) {
        this.businessEndereco.salvar(endereco);
	}

	@Override
	public Endereco buscarEnderecoPorId(int id) {
		return this.businessEndereco.buscarPorId(id);
	}

	@Override
	public List<Endereco> getAllEnderecos() {
        return this.businessEndereco.getAll();
	}

	@Override
	public void editarEndereco(Endereco endereco) {
        throw new UnsupportedOperationException("Not supported yet.");	
	}

	@Override
	public void ativarDesativarEndereco(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void salvarFuncionario(Funcionario funcionario) {
        this.businessFuncionario.salvar(funcionario);
	}

	@Override
	public Funcionario buscarFuncionarioPorId(int id) {
		return this.businessFuncionario.buscarPorId(id);
	}

	@Override
	public List<Funcionario> getAllFuncionarios() {
        return this.businessFuncionario.getAll();
	}

	@Override
	public void editarFuncionario(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet.");	
	}

	@Override
	public void ativarDesativarFuncionario(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void salvarCliente(Cliente cliente) {
		this.businessCliente.salvar(cliente);
	}

	@Override
	public Cliente buscarClientePorId(int id) {
		return this.businessCliente.buscarPorId(id);
	}

	@Override
	public List<Cliente> getAllClientes() {
		return this.businessCliente.getAll();
	}

	@Override
	public void editarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void ativarDesativarCliente(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void salvarEnderecoFarmacia(EnderecoFarmacia enderecoFarmacia) {
		this.businessEnderecoFarmacia.salvar(enderecoFarmacia);
	}

	@Override
	public EnderecoFarmacia buscarEnderecoFarmaciaPorId(int id) {
		return this.businessEnderecoFarmacia.buscarPorId(id);
	}

	@Override
	public List<EnderecoFarmacia> getAllEnderecoFarmacias() {
		return this.businessEnderecoFarmacia.getAll();
	}

	@Override
	public void editarEnderecoFarmacia(EnderecoFarmacia enderecoFarmacia) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void ativarDesativarEnderecoFarmacia(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void salvarFarmacia(Farmacia farmacia) {
		this.businessFarmacia.salvar(farmacia);
	}

	@Override
	public Farmacia buscarFarmaciaPorId(int id) {
		return this.businessFarmacia.buscarPorId(id);
	}

	@Override
	public List<Farmacia> getAllFarmacias() {
		return this.businessFarmacia.getAll();
	}

	@Override
	public void editarFarmacia(Farmacia farmacia) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void ativarDesativarFarmacia(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void salvarEstoque(Estoque estoque) {
		this.businessEstoque.salvar(estoque);
	}

	@Override
	public Estoque buscarEstoquePorId(int id) {
		return this.businessEstoque.buscarPorId(id);
	}

	@Override
	public List<Estoque> getAllEstoques() {
		return this.businessEstoque.getAll();
	}

	@Override
	public void editarEstoque(Estoque estoque) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void ativarDesativarEstoque(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void salvarReserva(Reserva reserva) {
		this.businessReserva.salvar(reserva);
	}

	@Override
	public Reserva buscarReservaPorId(int id) {
		return this.businessReserva.buscarPorId(id);
	}

	@Override
	public List<Reserva> getAllReservas() {
		return this.businessReserva.getAll();
	}

	@Override
	public void editarReserva(Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void ativarDesativarReserva(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void salvarVenda(Venda venda) {
		this.businessVenda.salvar(venda);
	}

	@Override
	public Venda buscarVendaPorId(int id) {
		return this.businessVenda.buscarPorId(id);
	}

	@Override
	public List<Venda> getAllVendas() {
		return this.businessVenda.getAll();
	}

	@Override
	public void editarVenda(Venda venda) {
        throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void ativarDesativarVenda(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
	}
    
}
