package br.com.fundamento.fachada;

import br.com.fundamento.business.BusinessCidade;
import br.com.fundamento.business.BusinessEndereco;
import br.com.fundamento.business.BusinessFuncionario;
import br.com.fundamento.business.BusinessProduto;
import br.com.fundamento.business.BusinessRua;
import br.com.fundamento.business.IBusinessCidade;
import br.com.fundamento.business.IBusinessEndereco;
import br.com.fundamento.business.IBusinessFuncionario;
import br.com.fundamento.business.IBusinessProduto;
import br.com.fundamento.business.IBusinessRua;
import br.com.fundamento.modelos.Cidade;
import br.com.fundamento.modelos.Endereco;
import br.com.fundamento.modelos.Funcionario;
import br.com.fundamento.modelos.Produto;
import br.com.fundamento.modelos.Rua;

import java.util.List;

public class Fachada implements IFachada {
    
    private static Fachada instance;
    private IBusinessRua businessRua;
    private IBusinessCidade businessCidade;
    private IBusinessEndereco businessEndereco;
    private IBusinessFuncionario businessFuncionario;
    private IBusinessProduto businessProduto;
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void ativarDesativarProduto(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
