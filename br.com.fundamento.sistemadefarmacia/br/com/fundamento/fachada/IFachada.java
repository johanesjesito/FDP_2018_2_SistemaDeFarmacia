package br.com.fundamento.fachada;

import br.com.fundamento.modelos.Cidade;
import br.com.fundamento.modelos.Endereco;
import br.com.fundamento.modelos.Funcionario;
import br.com.fundamento.modelos.Produto;
import br.com.fundamento.modelos.Rua;
import java.util.List;

public interface IFachada {

    public void salvarRua(Rua rua);

    public Rua buscarRuaPorId(int id);

    public List<Rua> getAllRuas();

    public void editarRua(Rua rua);

    public void ativarDesativarRua(int id); 
    
    public void salvarCidade(Cidade cidade);

    public Cidade buscarCidadePorId(int id);

    public List<Cidade> getAllCidades();

    public void editarCidade(Cidade cidade);

    public void ativarDesativarCidade(int id);

    public void salvarEndereco(Endereco endereco);

    public Endereco buscarEnderecoPorId(int id);

    public List<Endereco> getAllEnderecos();

    public void editarEndereco(Endereco endereco);

    public void ativarDesativarEndereco(int id);

    public void salvarFuncionario(Funcionario funcionario);

    public Funcionario buscarFuncionarioPorId(int id);

    public List<Funcionario> getAllFuncionarios();

    public void editarFuncionario(Funcionario funcionario);

    public void ativarDesativarFuncionario(int id);
    
    public void salvarProduto(Produto produto);

    public Produto buscarProdutoPorId(int id);

    public List<Produto> getAllProdutos();

    public void editarProduto(Produto produto);

    public void ativarDesativarProduto(int id);
    
}
