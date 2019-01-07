package br.com.fundamento.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.fundamento.fachada.Fachada;
import br.com.fundamento.fachada.IFachada;
import br.com.fundamento.modelos.Cidade;
import br.com.fundamento.modelos.Cliente;
import br.com.fundamento.modelos.Endereco;
import br.com.fundamento.modelos.Estoque;
import br.com.fundamento.modelos.Funcionario;
import br.com.fundamento.modelos.Produto;
import br.com.fundamento.modelos.Rua;
import br.com.fundamento.sql.SQLConections;
import br.com.fundamento.visao.Mensagem;
import br.com.fundamento.visao.Mensagem1;
import br.com.fundamento.visao.Tela;

public class Controller {

	Tela tela;

	public Controller(Tela tela) {
		this.tela = tela;

		controllerTela();

		controllerFuncionario();

		controllerProduto();

		controllerCliente();

		controllerLogin();
		
		controllerListaFuncionario();

	}

	public void controllerTela() {
		
		tela.getMenu().setVisible(false);
		tela.getMenu_1().setVisible(false);
		tela.getMenu_2().setVisible(false);
		tela.getMenu_3().setVisible(false);

		tela.getMenuItem_6().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				tela.getMenu().setVisible(false);
				tela.getMenu_1().setVisible(false);
				tela.getMenu_2().setVisible(false);
				tela.getMenu_3().setVisible(false);

				tela.getLblLogin().setVisible(true);
				tela.getLblSenha().setVisible(true);
				tela.getTxtSenha().setVisible(true);
				tela.getTextField().setVisible(true);
				tela.getBtnEntrar().setVisible(true);

				tela.getContentPane().setLayout(tela.getLoginTela());

				tela.getLblCep().setVisible(false);
				tela.getLblCep_1().setVisible(false);
				tela.getLblCidade().setVisible(false);
				tela.getLblCpf().setVisible(false);
				tela.getLblDinheiro().setVisible(false);
				tela.getLblEmpresa().setVisible(false);
				tela.getLblEndereo().setVisible(false);
				tela.getLblFuncionario().setVisible(false);
				tela.getLblLista().setVisible(false);
				tela.getLblLogin_1().setVisible(false);
				tela.getLblMedicamento().setVisible(false);
				tela.getLblNome().setVisible(false);
				tela.getLblPreco().setVisible(false);
				tela.getLblPreco_1().setVisible(false);
				tela.getLblProduto().setVisible(false);
				tela.getLblQuantidade().setVisible(false);
				tela.getLblQuantidade_1().setVisible(false);
				tela.getLblRua().setVisible(false);
				tela.getLblSenha_1().setVisible(false);
				tela.getLblFinalidade().setVisible(false);
				tela.getLblVenda().setVisible(false);
				tela.getLblPesquisa().setVisible(false);
				tela.getLblPesquisa_1().setVisible(false);
				tela.getLblNome_1().setVisible(false);
				tela.getLblCpf_1().setVisible(false);
				tela.getLblCidade_1().setVisible(false);
				tela.getLblRua_1().setVisible(false);
				tela.getLblCep_2().setVisible(false);
				tela.getLblCep_3().setVisible(false);
				tela.getLblCliente().setVisible(false);
				tela.getLblNumero().setVisible(false);
				tela.getLblFuno().setVisible(false);
				tela.getLblCodigo().setVisible(false);
				tela.getLblNumero_1().setVisible(false);
				tela.getLblCliente_1().setVisible(false);

				tela.getTextField_0().setVisible(false);
				tela.getTextField_1().setVisible(false);
				tela.getTextField_2().setVisible(false);
				tela.getTextField_3().setVisible(false);
				tela.getTextField_4().setVisible(false);
				tela.getTextField_5().setVisible(false);
				tela.getTextField_6().setVisible(false);
				tela.getTextField_7().setVisible(false);
				// 	tela.getTextField_8().setVisible(false);
				// tela.getTextField_9().setVisible(false);
				tela.getTextField_10().setVisible(false);
				tela.getTextField_11().setVisible(false);
				tela.getTextField_12().setVisible(false);
				tela.getTextField_13().setVisible(false);
				tela.getTextField_14().setVisible(false);
				// tela.getTextField_15().setVisible(false);
				// tela.getTextField_16().setVisible(false);
				tela.getTextField_17().setVisible(false);
				tela.getTextField_18().setVisible(false);
				tela.getTextField_19().setVisible(false);
				tela.getTextField_20().setVisible(false);
				tela.getTextField_21().setVisible(false);
				tela.getTextField_22().setVisible(false);
				tela.getTextField_23().setVisible(false);
				tela.getTextField_24().setVisible(false);
				tela.getTextField_25().setVisible(false);
				tela.getTextField_26().setVisible(false);

				tela.getComboBox().setVisible(false);				
				tela.getComboBox_1().setVisible(false);
				tela.getComboBox_2().setVisible(false);
				tela.getComboBox_3().setVisible(false);

				tela.getSpinner().setVisible(false);

				tela.getTable().setVisible(false);
				tela.getTable_0().setVisible(false);
				tela.getTable_1().setVisible(false);

				tela.getBtnAdicionar().setVisible(false);
				tela.getBtnCadastrar().setVisible(false);
				tela.getBtnCadastrar_1().setVisible(false);
				tela.getBtnComprar().setVisible(false);
				tela.getBtnPesquisar().setVisible(false);
				tela.getBtnPesquisar_1().setVisible(false);
				tela.getBtnCadastrar_3().setVisible(false);

			}
		});

		tela.getMenuItem_8().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				tela.getLblLogin().setVisible(false);
				tela.getLblSenha().setVisible(false);
				tela.getTxtSenha().setVisible(false);
				tela.getTextField().setVisible(false);
				tela.getBtnEntrar().setVisible(false);

				tela.getContentPane().setLayout(tela.getVendaTela());

				tela.getLblCep().setVisible(false);
				tela.getLblCep_1().setVisible(false);
				tela.getLblCidade().setVisible(false);
				tela.getLblCpf().setVisible(false);
				tela.getLblDinheiro().setVisible(true);
				tela.getLblEmpresa().setVisible(false);
				tela.getLblEndereo().setVisible(false);
				tela.getLblFuncionario().setVisible(false);
				tela.getLblLista().setVisible(true);
				tela.getLblLogin_1().setVisible(false);
				tela.getLblMedicamento().setVisible(false);
				tela.getLblNome().setVisible(false);
				tela.getLblPreco().setVisible(true);
				tela.getLblPreco_1().setVisible(false);
				tela.getLblProduto().setVisible(true);
				tela.getLblQuantidade().setVisible(true);
				tela.getLblQuantidade_1().setVisible(false);
				tela.getLblRua().setVisible(false);
				tela.getLblSenha_1().setVisible(false);
				tela.getLblFinalidade().setVisible(false);
				tela.getLblVenda().setVisible(true);
				tela.getLblPesquisa().setVisible(false);
				tela.getLblPesquisa_1().setVisible(false);
				tela.getLblNome_1().setVisible(false);
				tela.getLblCpf_1().setVisible(false);
				tela.getLblCidade_1().setVisible(false);
				tela.getLblRua_1().setVisible(false);
				tela.getLblCep_2().setVisible(false);
				tela.getLblCep_3().setVisible(false);
				tela.getLblCliente().setVisible(false);
				tela.getLblNumero().setVisible(false);
				tela.getLblFuno().setVisible(false);
				tela.getLblCodigo().setVisible(false);
				tela.getLblNumero_1().setVisible(false);
				tela.getLblCliente_1().setVisible(true);

				tela.getTextField_0().setVisible(false);
				tela.getTextField_1().setVisible(false);
				tela.getTextField_2().setVisible(false);
				tela.getTextField_3().setVisible(false);
				tela.getTextField_4().setVisible(false);
				tela.getTextField_5().setVisible(false);
				tela.getTextField_6().setVisible(false);
				tela.getTextField_7().setVisible(false);
				//				tela.getTextField_8().setVisible(true);
				//				tela.getTextField_9().setVisible(true);
				tela.getTextField_10().setVisible(false);
				tela.getTextField_11().setVisible(false);
				tela.getTextField_12().setVisible(false);
				tela.getTextField_13().setVisible(false);
				tela.getTextField_14().setVisible(false);
				// tela.getTextField_15().setVisible(false);
				// tela.getTextField_16().setVisible(false);
				tela.getTextField_17().setVisible(false);
				tela.getTextField_18().setVisible(false);
				tela.getTextField_19().setVisible(false);
				tela.getTextField_20().setVisible(false);
				tela.getTextField_21().setVisible(false);
				tela.getTextField_22().setVisible(false);
				tela.getTextField_23().setVisible(false);
				tela.getTextField_24().setVisible(false);
				tela.getTextField_25().setVisible(false);
				tela.getTextField_26().setVisible(false);

				tela.getComboBox().setVisible(false);				
				tela.getComboBox_1().setVisible(false);
				tela.getComboBox_2().setVisible(true);
				tela.getComboBox_3().setVisible(true);

				tela.getSpinner().setVisible(true);

				tela.getTable().setVisible(true);
				tela.getTable_0().setVisible(false);
				tela.getTable_1().setVisible(false);

				tela.getBtnAdicionar().setVisible(true);
				tela.getBtnCadastrar().setVisible(false);
				tela.getBtnCadastrar_1().setVisible(false);
				tela.getBtnComprar().setVisible(true);
				tela.getBtnPesquisar().setVisible(false);
				tela.getBtnPesquisar_1().setVisible(false);
				tela.getBtnCadastrar_3().setVisible(false);

			}
		});

		tela.getMntmCadastrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tela.getLblLogin().setVisible(false);
				tela.getLblSenha().setVisible(false);
				tela.getTxtSenha().setVisible(false);
				tela.getTextField().setVisible(false);
				tela.getBtnEntrar().setVisible(false);

				tela.getContentPane().setLayout(tela.getProdutoTela());

				tela.getLblCep().setVisible(false);
				tela.getLblCep_1().setVisible(false);
				tela.getLblCidade().setVisible(false);
				tela.getLblCpf().setVisible(false);
				tela.getLblDinheiro().setVisible(false);
				tela.getLblEmpresa().setVisible(true);
				tela.getLblEndereo().setVisible(false);
				tela.getLblFuncionario().setVisible(false);
				tela.getLblLista().setVisible(false);
				tela.getLblLogin_1().setVisible(false);
				tela.getLblMedicamento().setVisible(true);
				tela.getLblNome().setVisible(false);
				tela.getLblPreco().setVisible(false);
				tela.getLblPreco_1().setVisible(true);
				tela.getLblProduto().setVisible(false);
				tela.getLblQuantidade().setVisible(false);
				tela.getLblQuantidade_1().setVisible(true);
				tela.getLblRua().setVisible(false);
				tela.getLblSenha_1().setVisible(false);
				tela.getLblFinalidade().setVisible(true);
				tela.getLblVenda().setVisible(false);
				tela.getLblPesquisa().setVisible(false);
				tela.getLblPesquisa_1().setVisible(false);
				tela.getLblNome_1().setVisible(false);
				tela.getLblCpf_1().setVisible(false);
				tela.getLblCidade_1().setVisible(false);
				tela.getLblRua_1().setVisible(false);
				tela.getLblCep_2().setVisible(false);
				tela.getLblCep_3().setVisible(false);
				tela.getLblCliente().setVisible(false);
				tela.getLblNumero().setVisible(false);
				tela.getLblFuno().setVisible(false);
				tela.getLblCodigo().setVisible(true);
				tela.getLblNumero_1().setVisible(false);
				tela.getLblCliente_1().setVisible(false);

				tela.getTextField_0().setVisible(false);
				tela.getTextField_1().setVisible(false);
				tela.getTextField_2().setVisible(false);
				tela.getTextField_3().setVisible(false);
				tela.getTextField_4().setVisible(false);
				tela.getTextField_5().setVisible(false);
				tela.getTextField_6().setVisible(false);
				tela.getTextField_7().setVisible(false);
				// 				tela.getTextField_8().setVisible(false);
				// tela.getTextField_9().setVisible(false);
				tela.getTextField_10().setVisible(true);
				tela.getTextField_11().setVisible(true);
				tela.getTextField_12().setVisible(true);
				tela.getTextField_13().setVisible(true);
				tela.getTextField_14().setVisible(true);
				// tela.getTextField_15().setVisible(false);
				// tela.getTextField_16().setVisible(false);
				tela.getTextField_17().setVisible(false);
				tela.getTextField_18().setVisible(false);
				tela.getTextField_19().setVisible(false);
				tela.getTextField_20().setVisible(false);
				tela.getTextField_21().setVisible(false);
				tela.getTextField_22().setVisible(false);
				tela.getTextField_23().setVisible(false);
				tela.getTextField_24().setVisible(false);
				tela.getTextField_25().setVisible(true);
				tela.getTextField_26().setVisible(false);

				tela.getComboBox().setVisible(false);				
				tela.getComboBox_1().setVisible(false);
				tela.getComboBox_2().setVisible(false);
				tela.getComboBox_3().setVisible(false);

				tela.getSpinner().setVisible(false);

				tela.getTable().setVisible(false);
				tela.getTable_0().setVisible(false);
				tela.getTable_1().setVisible(false);

				tela.getBtnAdicionar().setVisible(false);
				tela.getBtnCadastrar().setVisible(false);
				tela.getBtnCadastrar_1().setVisible(true);
				tela.getBtnComprar().setVisible(false);
				tela.getBtnPesquisar().setVisible(false);
				tela.getBtnPesquisar_1().setVisible(false);
				tela.getBtnCadastrar_3().setVisible(false);

			}
		});

		tela.getMntmCadastrar_1().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tela.getLblLogin().setVisible(false);
				tela.getLblSenha().setVisible(false);
				tela.getTxtSenha().setVisible(false);
				tela.getTextField().setVisible(false);
				tela.getBtnEntrar().setVisible(false);

				tela.getContentPane().setLayout(tela.getFuncionarioCadastro());

				tela.getLblCep().setVisible(true);
				tela.getLblCep_1().setVisible(true);
				tela.getLblCidade().setVisible(true);
				tela.getLblCpf().setVisible(true);
				tela.getLblDinheiro().setVisible(false);
				tela.getLblEmpresa().setVisible(false);
				tela.getLblEndereo().setVisible(true);
				tela.getLblFuncionario().setVisible(true);
				tela.getLblLista().setVisible(false);
				tela.getLblLogin_1().setVisible(true);
				tela.getLblMedicamento().setVisible(false);
				tela.getLblNome().setVisible(true);
				tela.getLblPreco().setVisible(false);
				tela.getLblPreco_1().setVisible(false);
				tela.getLblProduto().setVisible(false);
				tela.getLblQuantidade().setVisible(false);
				tela.getLblQuantidade_1().setVisible(false);
				tela.getLblRua().setVisible(true);
				tela.getLblSenha_1().setVisible(true);
				tela.getLblFinalidade().setVisible(false);
				tela.getLblVenda().setVisible(false);
				tela.getLblPesquisa().setVisible(false);
				tela.getLblPesquisa_1().setVisible(false);
				tela.getLblNome_1().setVisible(false);
				tela.getLblCpf_1().setVisible(false);
				tela.getLblCidade_1().setVisible(false);
				tela.getLblRua_1().setVisible(false);
				tela.getLblCep_2().setVisible(false);
				tela.getLblCep_3().setVisible(false);
				tela.getLblCliente().setVisible(false);
				tela.getLblNumero().setVisible(true);
				tela.getLblFuno().setVisible(true);
				tela.getLblCodigo().setVisible(false);
				tela.getLblNumero_1().setVisible(false);
				tela.getLblCliente_1().setVisible(false);

				tela.getTextField_0().setVisible(true);
				tela.getTextField_1().setVisible(true);
				tela.getTextField_2().setVisible(true);
				tela.getTextField_3().setVisible(true);
				tela.getTextField_4().setVisible(true);
				tela.getTextField_5().setVisible(true);
				tela.getTextField_6().setVisible(true);
				tela.getTextField_7().setVisible(true);
				// 				tela.getTextField_8().setVisible(false);
				// tela.getTextField_9().setVisible(false);
				tela.getTextField_10().setVisible(false);
				tela.getTextField_11().setVisible(false);
				tela.getTextField_12().setVisible(false);
				tela.getTextField_13().setVisible(false);
				tela.getTextField_14().setVisible(false);
				// tela.getTextField_15().setVisible(false);
				// tela.getTextField_16().setVisible(false);
				tela.getTextField_17().setVisible(false);
				tela.getTextField_18().setVisible(false);
				tela.getTextField_19().setVisible(false);
				tela.getTextField_20().setVisible(false);
				tela.getTextField_21().setVisible(false);
				tela.getTextField_22().setVisible(false);
				tela.getTextField_23().setVisible(true);
				tela.getTextField_24().setVisible(true);
				tela.getTextField_25().setVisible(false);
				tela.getTextField_26().setVisible(false);

				tela.getComboBox().setVisible(false);				
				tela.getComboBox_1().setVisible(false);
				tela.getComboBox_2().setVisible(false);
				tela.getComboBox_3().setVisible(false);

				tela.getSpinner().setVisible(false);

				tela.getTable().setVisible(false);
				tela.getTable_0().setVisible(false);
				tela.getTable_1().setVisible(false);

				tela.getBtnAdicionar().setVisible(false);
				tela.getBtnCadastrar().setVisible(true);
				tela.getBtnCadastrar_1().setVisible(false);
				tela.getBtnComprar().setVisible(false);
				tela.getBtnPesquisar().setVisible(false);
				tela.getBtnPesquisar_1().setVisible(false);
				tela.getBtnCadastrar_3().setVisible(false);

			}
		});

		tela.getMntmLista().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tela.getLblLogin().setVisible(false);
				tela.getLblSenha().setVisible(false);
				tela.getTxtSenha().setVisible(false);
				tela.getTextField().setVisible(false);
				tela.getBtnEntrar().setVisible(false);

				tela.getContentPane().setLayout(tela.getListaProduto());

				tela.getLblCep().setVisible(false);
				tela.getLblCep_1().setVisible(false);
				tela.getLblCidade().setVisible(false);
				tela.getLblCpf().setVisible(false);
				tela.getLblDinheiro().setVisible(false);
				tela.getLblEmpresa().setVisible(false);
				tela.getLblEndereo().setVisible(false);
				tela.getLblFuncionario().setVisible(false);
				tela.getLblLista().setVisible(false);
				tela.getLblLogin_1().setVisible(false);
				tela.getLblMedicamento().setVisible(false);
				tela.getLblNome().setVisible(false);
				tela.getLblPreco().setVisible(false);
				tela.getLblPreco_1().setVisible(false);
				tela.getLblProduto().setVisible(false);
				tela.getLblQuantidade().setVisible(false);
				tela.getLblQuantidade_1().setVisible(false);
				tela.getLblRua().setVisible(false);
				tela.getLblSenha_1().setVisible(false);
				tela.getLblFinalidade().setVisible(false);
				tela.getLblVenda().setVisible(false);
				tela.getLblPesquisa().setVisible(true);
				tela.getLblPesquisa_1().setVisible(false);
				tela.getLblNome_1().setVisible(false);
				tela.getLblCpf_1().setVisible(false);
				tela.getLblCidade_1().setVisible(false);
				tela.getLblRua_1().setVisible(false);
				tela.getLblCep_2().setVisible(false);
				tela.getLblCep_3().setVisible(false);
				tela.getLblCliente().setVisible(false);
				tela.getLblNumero().setVisible(false);
				tela.getLblFuno().setVisible(false);
				tela.getLblCodigo().setVisible(false);
				tela.getLblNumero_1().setVisible(false);
				tela.getLblCliente_1().setVisible(false);

				tela.getTextField_0().setVisible(false);
				tela.getTextField_1().setVisible(false);
				tela.getTextField_2().setVisible(false);
				tela.getTextField_3().setVisible(false);
				tela.getTextField_4().setVisible(false);
				tela.getTextField_5().setVisible(false);
				tela.getTextField_6().setVisible(false);
				tela.getTextField_7().setVisible(false);
				// 				tela.getTextField_8().setVisible(false);
				// tela.getTextField_9().setVisible(false);
				tela.getTextField_10().setVisible(false);
				tela.getTextField_11().setVisible(false);
				tela.getTextField_12().setVisible(false);
				tela.getTextField_13().setVisible(false);
				tela.getTextField_14().setVisible(false);
				// tela.getTextField_15().setVisible(true);
				// tela.getTextField_16().setVisible(false);
				tela.getTextField_17().setVisible(false);
				tela.getTextField_18().setVisible(false);
				tela.getTextField_19().setVisible(false);
				tela.getTextField_20().setVisible(false);
				tela.getTextField_21().setVisible(false);
				tela.getTextField_22().setVisible(false);
				tela.getTextField_23().setVisible(false);
				tela.getTextField_24().setVisible(false);
				tela.getTextField_25().setVisible(false);
				tela.getTextField_26().setVisible(false);

				tela.getComboBox().setVisible(false);				
				tela.getComboBox_1().setVisible(true);
				tela.getComboBox_2().setVisible(false);
				tela.getComboBox_3().setVisible(false);

				tela.getSpinner().setVisible(false);

				tela.getTable().setVisible(false);
				tela.getTable_0().setVisible(true);
				tela.getTable_1().setVisible(false);

				tela.getBtnAdicionar().setVisible(false);
				tela.getBtnCadastrar().setVisible(false);
				tela.getBtnCadastrar_1().setVisible(false);
				tela.getBtnComprar().setVisible(false);
				tela.getBtnPesquisar().setVisible(true);
				tela.getBtnPesquisar_1().setVisible(false);
				tela.getBtnCadastrar_3().setVisible(false);

			}
		});

		tela.getMntmLista_1().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tela.getLblLogin().setVisible(false);
				tela.getLblSenha().setVisible(false);
				tela.getTxtSenha().setVisible(false);
				tela.getTextField().setVisible(false);
				tela.getBtnEntrar().setVisible(false);

				tela.getContentPane().setLayout(tela.getListaFuncionario());

				tela.getLblCep().setVisible(false);
				tela.getLblCep_1().setVisible(false);
				tela.getLblCidade().setVisible(false);
				tela.getLblCpf().setVisible(false);
				tela.getLblDinheiro().setVisible(false);
				tela.getLblEmpresa().setVisible(false);
				tela.getLblEndereo().setVisible(false);
				tela.getLblFuncionario().setVisible(false);
				tela.getLblLista().setVisible(false);
				tela.getLblLogin_1().setVisible(false);
				tela.getLblMedicamento().setVisible(false);
				tela.getLblNome().setVisible(false);
				tela.getLblPreco().setVisible(false);
				tela.getLblPreco_1().setVisible(false);
				tela.getLblProduto().setVisible(false);
				tela.getLblQuantidade().setVisible(false);
				tela.getLblQuantidade_1().setVisible(false);
				tela.getLblRua().setVisible(false);
				tela.getLblSenha_1().setVisible(false);
				tela.getLblFinalidade().setVisible(false);
				tela.getLblVenda().setVisible(false);
				tela.getLblPesquisa().setVisible(false);
				tela.getLblPesquisa_1().setVisible(true);
				tela.getLblNome_1().setVisible(false);
				tela.getLblCpf_1().setVisible(false);
				tela.getLblCidade_1().setVisible(false);
				tela.getLblRua_1().setVisible(false);
				tela.getLblCep_2().setVisible(false);
				tela.getLblCep_3().setVisible(false);
				tela.getLblCliente().setVisible(false);
				tela.getLblNumero().setVisible(false);
				tela.getLblFuno().setVisible(false);
				tela.getLblCodigo().setVisible(false);
				tela.getLblNumero_1().setVisible(false);
				tela.getLblCliente_1().setVisible(false);

				tela.getTextField_0().setVisible(false);
				tela.getTextField_1().setVisible(false);
				tela.getTextField_2().setVisible(false);
				tela.getTextField_3().setVisible(false);
				tela.getTextField_4().setVisible(false);
				tela.getTextField_5().setVisible(false);
				tela.getTextField_6().setVisible(false);
				tela.getTextField_7().setVisible(false);
				// 				tela.getTextField_8().setVisible(false);
				// tela.getTextField_9().setVisible(false);
				tela.getTextField_10().setVisible(false);
				tela.getTextField_11().setVisible(false);
				tela.getTextField_12().setVisible(false);
				tela.getTextField_13().setVisible(false);
				tela.getTextField_14().setVisible(false);
				// tela.getTextField_15().setVisible(false);
				// tela.getTextField_16().setVisible(true);
				tela.getTextField_17().setVisible(false);
				tela.getTextField_18().setVisible(false);
				tela.getTextField_19().setVisible(false);
				tela.getTextField_20().setVisible(false);
				tela.getTextField_21().setVisible(false);
				tela.getTextField_22().setVisible(false);
				tela.getTextField_23().setVisible(false);
				tela.getTextField_24().setVisible(false);
				tela.getTextField_25().setVisible(false);
				tela.getTextField_26().setVisible(false);

				tela.getComboBox().setVisible(true);				
				tela.getComboBox_1().setVisible(false);
				tela.getComboBox_2().setVisible(false);
				tela.getComboBox_3().setVisible(false);

				tela.getSpinner().setVisible(false);

				tela.getTable().setVisible(false);
				tela.getTable_0().setVisible(false);
				tela.getTable_1().setVisible(true);

				tela.getBtnAdicionar().setVisible(false);
				tela.getBtnCadastrar().setVisible(false);
				tela.getBtnCadastrar_1().setVisible(false);
				tela.getBtnComprar().setVisible(false);
				tela.getBtnPesquisar().setVisible(false);
				tela.getBtnPesquisar_1().setVisible(true);
				tela.getBtnCadastrar_3().setVisible(false);

			}
		});

		tela.getMenuItem_7().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tela.getLblLogin().setVisible(false);
				tela.getLblSenha().setVisible(false);
				tela.getTxtSenha().setVisible(false);
				tela.getTextField().setVisible(false);
				tela.getBtnEntrar().setVisible(false);

				tela.getContentPane().setLayout(tela.getClienteTela());

				tela.getLblCep().setVisible(false);
				tela.getLblCep_1().setVisible(false);
				tela.getLblCidade().setVisible(false);
				tela.getLblCpf().setVisible(false);
				tela.getLblDinheiro().setVisible(false);
				tela.getLblEmpresa().setVisible(false);
				tela.getLblEndereo().setVisible(false);
				tela.getLblFuncionario().setVisible(false);
				tela.getLblLista().setVisible(false);
				tela.getLblLogin_1().setVisible(false);
				tela.getLblMedicamento().setVisible(false);
				tela.getLblNome().setVisible(false);
				tela.getLblPreco().setVisible(false);
				tela.getLblPreco_1().setVisible(false);
				tela.getLblProduto().setVisible(false);
				tela.getLblQuantidade().setVisible(false);
				tela.getLblQuantidade_1().setVisible(false);
				tela.getLblRua().setVisible(false);
				tela.getLblSenha_1().setVisible(false);
				tela.getLblFinalidade().setVisible(false);
				tela.getLblVenda().setVisible(false);
				tela.getLblPesquisa().setVisible(false);
				tela.getLblPesquisa_1().setVisible(false);
				tela.getLblNome_1().setVisible(true);
				tela.getLblCpf_1().setVisible(true);
				tela.getLblCidade_1().setVisible(true);
				tela.getLblRua_1().setVisible(true);
				tela.getLblCep_2().setVisible(true);
				tela.getLblCep_3().setVisible(true);
				tela.getLblCliente().setVisible(true);
				tela.getLblNumero().setVisible(false);
				tela.getLblFuno().setVisible(false);
				tela.getLblCodigo().setVisible(false);
				tela.getLblNumero_1().setVisible(true);
				tela.getLblCliente_1().setVisible(false);

				tela.getTextField_0().setVisible(false);
				tela.getTextField_1().setVisible(false);
				tela.getTextField_2().setVisible(false);
				tela.getTextField_3().setVisible(false);
				tela.getTextField_4().setVisible(false);
				tela.getTextField_5().setVisible(false);
				tela.getTextField_6().setVisible(false);
				tela.getTextField_7().setVisible(false);
				// 				tela.getTextField_8().setVisible(false);
				// tela.getTextField_9().setVisible(false);
				tela.getTextField_10().setVisible(false);
				tela.getTextField_11().setVisible(false);
				tela.getTextField_12().setVisible(false);
				tela.getTextField_13().setVisible(false);
				tela.getTextField_14().setVisible(false);
				// tela.getTextField_15().setVisible(false);
				// tela.getTextField_16().setVisible(false);
				tela.getTextField_17().setVisible(true);
				tela.getTextField_18().setVisible(true);
				tela.getTextField_19().setVisible(true);
				tela.getTextField_20().setVisible(true);
				tela.getTextField_21().setVisible(true);
				tela.getTextField_22().setVisible(true);
				tela.getTextField_23().setVisible(false);
				tela.getTextField_24().setVisible(false);
				tela.getTextField_25().setVisible(false);
				tela.getTextField_26().setVisible(true);

				tela.getComboBox().setVisible(false);				
				tela.getComboBox_1().setVisible(false);
				tela.getComboBox_2().setVisible(false);
				tela.getComboBox_3().setVisible(false);

				tela.getSpinner().setVisible(false);

				tela.getTable().setVisible(false);
				tela.getTable_0().setVisible(false);
				tela.getTable_1().setVisible(false);

				tela.getBtnAdicionar().setVisible(false);
				tela.getBtnCadastrar().setVisible(false);
				tela.getBtnCadastrar_1().setVisible(false);
				tela.getBtnComprar().setVisible(false);
				tela.getBtnPesquisar().setVisible(false);
				tela.getBtnPesquisar_1().setVisible(false);
				tela.getBtnCadastrar_3().setVisible(true);
			}
		});
	}

	public void controllerFuncionario() {
		tela.getBtnCadastrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				IFachada fachada1 = Fachada.getInstance();

				Rua rua = new Rua();
				rua.setNome(tela.getTextField_5().getText());
				rua.setCep(tela.getTextField_7().getText());

				Cidade cidade = new Cidade();
				cidade.setNome(tela.getTextField_2().getText());
				cidade.setCep(tela.getTextField_6().getText());
				cidade.setRua(rua);

				Endereco endereco = new Endereco();
				endereco.setNumero(tela.getTextField_24().getText());
				endereco.setCidade(cidade);

				Funcionario funcionario = new Funcionario();
				funcionario.setNome(tela.getTextField_4().getText());
				funcionario.setCpf(tela.getTextField_0().getText());
				funcionario.setLogin(tela.getTextField_3().getText());
				funcionario.setSenha(tela.getTextField_1().getText());
				funcionario.setFuncao(tela.getTextField_23().getText());
				funcionario.setEndereco(endereco);

				fachada1.salvarFuncionario(funcionario);

				Mensagem.exibir("Cadastrado com Sucesso");
			}
		});
	}

	public void controllerProduto() {

		tela.getBtnCadastrar_1().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				IFachada fachada1 = Fachada.getInstance();

				Produto produto = new Produto();
				produto.setNome(tela.getTextField_10().getText());
				produto.setCodigo(tela.getTextField_25().getText());
				produto.setFabricante(tela.getTextField_14().getText());
				produto.setFinalidade(tela.getTextField_12().getText());
				produto.setPreco(Float.parseFloat(tela.getTextField_13().getText()));

				Estoque estoque = new Estoque();
				estoque.setQuantidade(Integer.parseInt(tela.getTextField_11().getText()));
				estoque.setProdutos(produto);

				fachada1.salvarEstoque(estoque);

				Mensagem1.exibir("Cadastrado com Sucesso");
			}
		});

	}

	public void controllerCliente() {

		tela.getBtnCadastrar_3().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				IFachada fachada1 = Fachada.getInstance();

				Rua rua = new Rua();
				rua.setNome(tela.getTextField_20().getText());
				rua.setCep(tela.getTextField_22().getText());

				Cidade cidade = new Cidade();
				cidade.setNome(tela.getTextField_19().getText());
				cidade.setCep(tela.getTextField_21().getText());
				cidade.setRua(rua);

				Endereco endereco = new Endereco();
				endereco.setNumero(tela.getTextField_26().getText());
				endereco.setCidade(cidade);

				Cliente cliente = new Cliente();
				cliente.setNome(tela.getTextField_18().getText());
				cliente.setCpf(tela.getTextField_17().getText());
				cliente.setEndereco(endereco);

				fachada1.salvarCliente(cliente);

				Mensagem.exibir("Cadastrado com Sucesso");
			}
		});

	}

	public void controllerLogin() {
		tela.getBtnEntrar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Connection con = SQLConections.getInstance();

				try {
					PreparedStatement stm = con
							.prepareStatement("SELECT login, senha, funcao FROM funcionario WHERE login = '"
									+ tela.getTextField().getText() + "' and senha = '" + tela.getTxtSenha().getText()
									+ "'");
					try {
						ResultSet rs = stm.executeQuery();

						if (rs.next()) {

							if (rs.getString("login").equals(tela.getTextField().getText())
									&& rs.getString("senha").equals(tela.getTxtSenha().getText())) {
								if (rs.getString("funcao").equalsIgnoreCase("Gerente")) {
									tela.getMenu().setVisible(true);
									tela.getMenu_1().setVisible(true);
									tela.getMenu_2().setVisible(true);
									tela.getMenu_3().setVisible(true);

									tela.getLblLogin().setVisible(false);
									tela.getLblSenha().setVisible(false);
									tela.getTxtSenha().setVisible(false);
									tela.getTextField().setVisible(false);
									tela.getBtnEntrar().setVisible(false);

									tela.getContentPane().setLayout(tela.getVendaTela());

									tela.getLblCep().setVisible(false);
									tela.getLblCep_1().setVisible(false);
									tela.getLblCidade().setVisible(false);
									tela.getLblCpf().setVisible(false);
									tela.getLblDinheiro().setVisible(true);
									tela.getLblEmpresa().setVisible(false);
									tela.getLblEndereo().setVisible(false);
									tela.getLblFuncionario().setVisible(false);
									tela.getLblLista().setVisible(true);
									tela.getLblLogin_1().setVisible(false);
									tela.getLblMedicamento().setVisible(false);
									tela.getLblNome().setVisible(false);
									tela.getLblPreco().setVisible(true);
									tela.getLblPreco_1().setVisible(false);
									tela.getLblProduto().setVisible(true);
									tela.getLblQuantidade().setVisible(true);
									tela.getLblQuantidade_1().setVisible(false);
									tela.getLblRua().setVisible(false);
									tela.getLblSenha_1().setVisible(false);
									tela.getLblFinalidade().setVisible(false);
									tela.getLblVenda().setVisible(true);
									tela.getLblPesquisa().setVisible(false);
									tela.getLblPesquisa_1().setVisible(false);
									tela.getLblNome_1().setVisible(false);
									tela.getLblCpf_1().setVisible(false);
									tela.getLblCidade_1().setVisible(false);
									tela.getLblRua_1().setVisible(false);
									tela.getLblCep_2().setVisible(false);
									tela.getLblCep_3().setVisible(false);
									tela.getLblCliente().setVisible(false);
									tela.getLblNumero().setVisible(false);
									tela.getLblFuno().setVisible(false);
									tela.getLblCodigo().setVisible(false);
									tela.getLblNumero_1().setVisible(false);
									tela.getLblCliente_1().setVisible(true);

									tela.getTextField_0().setVisible(false);
									tela.getTextField_1().setVisible(false);
									tela.getTextField_2().setVisible(false);
									tela.getTextField_3().setVisible(false);
									tela.getTextField_4().setVisible(false);
									tela.getTextField_5().setVisible(false);
									tela.getTextField_6().setVisible(false);
									tela.getTextField_7().setVisible(false);
									// tela.getTextField_8().setVisible(true);
									// tela.getTextField_9().setVisible(true);
									tela.getTextField_10().setVisible(false);
									tela.getTextField_11().setVisible(false);
									tela.getTextField_12().setVisible(false);
									tela.getTextField_13().setVisible(false);
									tela.getTextField_14().setVisible(false);
									// tela.getTextField_15().setVisible(false);
									// tela.getTextField_16().setVisible(false);
									tela.getTextField_17().setVisible(false);
									tela.getTextField_18().setVisible(false);
									tela.getTextField_19().setVisible(false);
									tela.getTextField_20().setVisible(false);
									tela.getTextField_21().setVisible(false);
									tela.getTextField_22().setVisible(false);
									tela.getTextField_23().setVisible(false);
									tela.getTextField_24().setVisible(false);
									tela.getTextField_25().setVisible(false);
									tela.getTextField_26().setVisible(false);

									tela.getComboBox().setVisible(false);
									tela.getComboBox_1().setVisible(false);
									tela.getComboBox_2().setVisible(true);
									tela.getComboBox_3().setVisible(true);

									tela.getSpinner().setVisible(true);

									tela.getTable().setVisible(true);
									tela.getTable_0().setVisible(false);
									tela.getTable_1().setVisible(false);

									tela.getBtnAdicionar().setVisible(true);
									tela.getBtnCadastrar().setVisible(false);
									tela.getBtnCadastrar_1().setVisible(false);
									tela.getBtnComprar().setVisible(true);
									tela.getBtnPesquisar().setVisible(false);
									tela.getBtnPesquisar_1().setVisible(false);
									tela.getBtnCadastrar_3().setVisible(false);
									
								} else if (rs.getString("funcao").equalsIgnoreCase("Funcionario")) {
									tela.getMenu().setVisible(false);
									tela.getMenu_1().setVisible(true);
									tela.getMenu_2().setVisible(true);
									tela.getMenu_3().setVisible(true);
									
									tela.getLblLogin().setVisible(false);
									tela.getLblSenha().setVisible(false);
									tela.getTxtSenha().setVisible(false);
									tela.getTextField().setVisible(false);
									tela.getBtnEntrar().setVisible(false);

									tela.getContentPane().setLayout(tela.getVendaTela());

									tela.getLblCep().setVisible(false);
									tela.getLblCep_1().setVisible(false);
									tela.getLblCidade().setVisible(false);
									tela.getLblCpf().setVisible(false);
									tela.getLblDinheiro().setVisible(true);
									tela.getLblEmpresa().setVisible(false);
									tela.getLblEndereo().setVisible(false);
									tela.getLblFuncionario().setVisible(false);
									tela.getLblLista().setVisible(true);
									tela.getLblLogin_1().setVisible(false);
									tela.getLblMedicamento().setVisible(false);
									tela.getLblNome().setVisible(false);
									tela.getLblPreco().setVisible(true);
									tela.getLblPreco_1().setVisible(false);
									tela.getLblProduto().setVisible(true);
									tela.getLblQuantidade().setVisible(true);
									tela.getLblQuantidade_1().setVisible(false);
									tela.getLblRua().setVisible(false);
									tela.getLblSenha_1().setVisible(false);
									tela.getLblFinalidade().setVisible(false);
									tela.getLblVenda().setVisible(true);
									tela.getLblPesquisa().setVisible(false);
									tela.getLblPesquisa_1().setVisible(false);
									tela.getLblNome_1().setVisible(false);
									tela.getLblCpf_1().setVisible(false);
									tela.getLblCidade_1().setVisible(false);
									tela.getLblRua_1().setVisible(false);
									tela.getLblCep_2().setVisible(false);
									tela.getLblCep_3().setVisible(false);
									tela.getLblCliente().setVisible(false);
									tela.getLblNumero().setVisible(false);
									tela.getLblFuno().setVisible(false);
									tela.getLblCodigo().setVisible(false);
									tela.getLblNumero_1().setVisible(false);
									tela.getLblCliente_1().setVisible(true);

									tela.getTextField_0().setVisible(false);
									tela.getTextField_1().setVisible(false);
									tela.getTextField_2().setVisible(false);
									tela.getTextField_3().setVisible(false);
									tela.getTextField_4().setVisible(false);
									tela.getTextField_5().setVisible(false);
									tela.getTextField_6().setVisible(false);
									tela.getTextField_7().setVisible(false);
									// tela.getTextField_8().setVisible(true);
									// tela.getTextField_9().setVisible(true);
									tela.getTextField_10().setVisible(false);
									tela.getTextField_11().setVisible(false);
									tela.getTextField_12().setVisible(false);
									tela.getTextField_13().setVisible(false);
									tela.getTextField_14().setVisible(false);
									// tela.getTextField_15().setVisible(false);
									// tela.getTextField_16().setVisible(false);
									tela.getTextField_17().setVisible(false);
									tela.getTextField_18().setVisible(false);
									tela.getTextField_19().setVisible(false);
									tela.getTextField_20().setVisible(false);
									tela.getTextField_21().setVisible(false);
									tela.getTextField_22().setVisible(false);
									tela.getTextField_23().setVisible(false);
									tela.getTextField_24().setVisible(false);
									tela.getTextField_25().setVisible(false);
									tela.getTextField_26().setVisible(false);

									tela.getComboBox().setVisible(false);
									tela.getComboBox_1().setVisible(false);
									tela.getComboBox_2().setVisible(true);
									tela.getComboBox_3().setVisible(true);

									tela.getSpinner().setVisible(true);

									tela.getTable().setVisible(true);
									tela.getTable_0().setVisible(false);
									tela.getTable_1().setVisible(false);

									tela.getBtnAdicionar().setVisible(true);
									tela.getBtnCadastrar().setVisible(false);
									tela.getBtnCadastrar_1().setVisible(false);
									tela.getBtnComprar().setVisible(true);
									tela.getBtnPesquisar().setVisible(false);
									tela.getBtnPesquisar_1().setVisible(false);
									tela.getBtnCadastrar_3().setVisible(false);
									
								} else {
									Mensagem.exibir("Outra Fun��o");
								}
							}
						} else {
							Mensagem.exibir("n�o existe");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						Mensagem.exibir("Erro ao rs");
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					Mensagem.exibir("Erro ao statement");
				}

			}

		});
	}

	public void controllerListaFuncionario() {
		
		tela.getMntmLista_1().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Connection con = SQLConections.getInstance();
				
				final DefaultTableModel modelo = new DefaultTableModel(new Object[][] {{"ID", "Nome","CPF", "Fun��o"}}, new String[] {"ID", "Nome", "CPF", "Fun��o"});
				try {
					PreparedStatement stm = con
							.prepareStatement(" SELECT id, nome, cpf, funcao FROM funcionario ");
					try {
						ResultSet rs = stm.executeQuery();

						 while(rs.next()){
					            int id = rs.getInt("id");
					            String nome = rs.getString("nome");
					            String cpf = rs.getString("cpf");
					            String funcao = rs.getString("funcao");
					            modelo.addRow(new Object[]{Integer.toString(id), nome, cpf, funcao});			    		
					    		tela.getTable_1().setModel(modelo);			    		
					        }
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						Mensagem.exibir("Erro ao rs");
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					Mensagem.exibir("Erro ao statement");
				}
			}
		});
		
	}
}
