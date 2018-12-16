package br.com.fundamento.fachada;

import br.com.fundamento.modelos.Cidade;
import br.com.fundamento.modelos.Endereco;
import br.com.fundamento.modelos.Funcionario;
import br.com.fundamento.modelos.Produto;
import br.com.fundamento.modelos.Venda;
import br.com.fundamento.modelos.Reserva;
import br.com.fundamento.modelos.Estoque;
import br.com.fundamento.modelos.Farmacia;
import br.com.fundamento.modelos.EnderecoFarmacia;
import br.com.fundamento.modelos.Cliente;
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
    
    public void salvarCliente(Cliente cliente);

    public Cliente buscarClientePorId(int id);

    public List<Cliente> getAllClientes();

    public void editarCliente(Cliente cliente);

    public void ativarDesativarCliente(int id);
    
    public void salvarEnderecoFarmacia(EnderecoFarmacia enderecoFarmacia);

    public EnderecoFarmacia buscarEnderecoFarmaciaPorId(int id);

    public List<EnderecoFarmacia> getAllEnderecoFarmacias();

    public void editarEnderecoFarmacia(EnderecoFarmacia enderecoFarmacia);

    public void ativarDesativarEnderecoFarmacia(int id);
    
    public void salvarFarmacia(Farmacia farmacia);

    public Farmacia buscarFarmaciaPorId(int id);

    public List<Farmacia> getAllFarmacias();

    public void editarFarmacia(Farmacia farmacia);

    public void ativarDesativarFarmacia(int id);
    
    public void salvarEstoque(Estoque estoque);

    public Estoque buscarEstoquePorId(int id);

    public List<Estoque> getAllEstoques();

    public void editarEstoque(Estoque estoque);

    public void ativarDesativarEstoque(int id);
    
    public void salvarReserva(Reserva reserva);

    public Reserva buscarReservaPorId(int id);

    public List<Reserva> getAllReservas();

    public void editarReserva(Reserva reserva);

    public void ativarDesativarReserva(int id);
    
    public void salvarVenda(Venda venda);

    public Venda buscarVendaPorId(int id);

    public List<Venda> getAllVendas();

    public void editarVenda(Venda venda);

    public void ativarDesativarVenda(int id);
    
    public void salvarProduto(Produto produto);

    public Produto buscarProdutoPorId(int id);

    public List<Produto> getAllProdutos();

    public void editarProduto(Produto produto);

    public void ativarDesativarProduto(int id);
    
}
