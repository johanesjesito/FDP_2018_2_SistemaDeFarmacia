/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fundamento.principal;

import br.com.fundamento.controle.Controller;
import br.com.fundamento.enuns.TipoContato;
import br.com.fundamento.enuns.TipoDocumento;
import br.com.fundamento.fachada.Fachada;
import br.com.fundamento.fachada.IFachada;
import br.com.fundamento.modelos.Cidade;
import br.com.fundamento.modelos.Cliente;
import br.com.fundamento.modelos.Endereco;
import br.com.fundamento.modelos.Funcionario;
import br.com.fundamento.modelos.Produto;
import br.com.fundamento.modelos.Rua;
import br.com.fundamento.visao.Login;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prof Heldon
 */
public class Main {

    public static void main(String[] a) {

        IFachada fachada1 = Fachada.getInstance();

//        System.out.println(fachada1);
//
//        Produto p = new Produto();
//        p.setNome("SABÃO");
//
//        fachada1.salvarProduto(p);
//        List<Produto> produtos = fachada1.getAllProdutos();
//        Produto produto = fachada1.buscarProdutoPorId(2);

/*
        Cliente cliente = new Cliente();
        cliente.setCpf("050");
        cliente.setNome("Heldon Jose");
        cliente.setTipo(TipoDocumento.CPF);
        cliente.setDocumento("11111");
        
        Endereco end  = new Endereco();
        end.setCep("58701090");
        end.setBairro("Santo Antonio");
        end.setNumero("Q51L10");
        end.setEstado("PB");
        cliente.setEndereco(end);
        
        Contato contato1 = new Contato();
        contato1.setTipo(TipoContato.EMAIL);
        contato1.setDescricao("heldonjose@gmail.com");
        
        
        Contato contato2 = new Contato();
        contato2.setTipo(TipoContato.TELEFONE);
        contato2.setDescricao("83-9-9627-9632");
        
        List<Contato> contatos = new ArrayList<>();
        contatos.add(contato1);
        contatos.add(contato2);
        
        cliente.setContatos(contatos);
        
        Produto produto = new Produto();
        produto.setNome("AS");
        produto.setCodigo("123456");
        produto.setFabricante("neoquimica");
        produto.setFinalidade("dor de cabeca");
        produto.setPreco((float) 1.2);


        Rua rua = new Rua();
        rua.setNome("favel3");
        rua.setCep("5691208");
        
        Cidade cidade = new Cidade();
        cidade.setNome("Rio de Janeiro");
        cidade.setCep("5678909");
        cidade.setRua(rua);
        
        Endereco endereco = new Endereco();
        endereco.setNumero("1193");
        endereco.setCidade(cidade);
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Johanes");
        funcionario.setCpf("12345678900");
        funcionario.setLogin("Johanes");
        funcionario.setSenha("123456");
        funcionario.setFuncao("gerente");
        funcionario.setEndereco(endereco);

        */ 

        //fachada1.salvarRua(rua);
        //fachada1.salvarFuncionario(funcionario);
        
        Login login = new Login();
        Controller controller = new Controller(login);
                
    }

}
