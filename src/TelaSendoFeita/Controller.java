package TelaSendoFeita;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import br.com.fundamento.fachada.Fachada;
import br.com.fundamento.fachada.IFachada;
import br.com.fundamento.modelos.Cidade;
import br.com.fundamento.modelos.Endereco;
import br.com.fundamento.modelos.Funcionario;
import br.com.fundamento.modelos.Produto;
import br.com.fundamento.modelos.Rua;
import br.com.fundamento.visao.Login1;
import br.com.fundamento.visao.Mensagem1;
import br.com.fundamento.visao.TelaGerente;
import br.com.fundamento.visao.TelaListaFunc;
import br.com.fundamento.visao.TelaProduto;
import br.com.fundamento.visao.TelaVenda;

public class Controller {

	Login1 login;
	TelaProduto telaProduto;
	TelaListaFunc telaFuncionarios;

	public Controller(Login1 login) {
		this.login = login;

		controlLogin();

	}

	public void controlLogin() {
		
		login.getEntrarButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

					login.setVisible(false);

					controlGerente();
			}
		});

		login.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				if (Mensagem1.confirmacao("Deseja sair?", "Sair") == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}

	public void controlGerente() {
		TelaGerente telaGerente = new TelaGerente();

		telaGerente.getCadastrarButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				telaGerente.getNomeLabel().setVisible(true);
				telaGerente.getNomeField().setVisible(true);
				telaGerente.getLoginLabel().setVisible(true);
				telaGerente.getLoginField().setVisible(true);
				telaGerente.getSenhaLabel().setVisible(true);
				telaGerente.getSenhaField().setVisible(true);
				telaGerente.getFuncaoLabel().setVisible(true);
				telaGerente.getFuncaoField().setVisible(true);
				telaGerente.getCpfLabel().setVisible(true);
				telaGerente.getCpfField().setVisible(true);
				telaGerente.getConfirmarButton().setVisible(true);

				telaGerente.getProdutoLabel().setVisible(false);
				telaGerente.getProdutoField().setVisible(false);
				telaGerente.getCodigoLabel().setVisible(false);
				telaGerente.getCodigoField().setVisible(false);
				telaGerente.getFabricanteLabel().setVisible(false);
				telaGerente.getFabricanteField().setVisible(false);
				telaGerente.getFinalidadeLabel().setVisible(false);
				telaGerente.getFinalidadeField().setVisible(false);
				telaGerente.getPrecoLabel().setVisible(false);
				telaGerente.getPrecoField().setVisible(false);
				telaGerente.getAddButton().setVisible(false);

			}
		});

		telaGerente.getConfirmarButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
		        IFachada fachada1 = Fachada.getInstance();
				
				Rua rua = new Rua();
		        rua.setNome("Santa Barbara");
		        rua.setCep("2222222");
		        
		        Cidade cidade = new Cidade();
		        cidade.setNome("Serra Talhada");
		        cidade.setCep("1111111");
		        cidade.setRua(rua);
		        
		        Endereco endereco = new Endereco();
		        endereco.setNumero("1111");
		        endereco.setCidade(cidade);
		        
		        Funcionario funcionario = new Funcionario();
		        funcionario.setNome(telaGerente.getNomeField().getText());
		        funcionario.setCpf(telaGerente.getCpfField().getText());
		        funcionario.setLogin(telaGerente.getLoginField().getText());
		        funcionario.setSenha(telaGerente.getSenhaField().getText());
		        funcionario.setFuncao(telaGerente.getFuncaoField().getText());
		        funcionario.setEndereco(endereco);
		        
		        fachada1.salvarFuncionario(funcionario);
		        
		        Mensagem1.exibir("Cadastrado com Sucesso");
			}
		});

		telaGerente.getCadasProButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				telaGerente.getProdutoLabel().setVisible(true);
				telaGerente.getProdutoField().setVisible(true);
				telaGerente.getCodigoLabel().setVisible(true);
				telaGerente.getCodigoField().setVisible(true);
				telaGerente.getFabricanteLabel().setVisible(true);
				telaGerente.getFabricanteField().setVisible(true);
				telaGerente.getFinalidadeLabel().setVisible(true);
				telaGerente.getFinalidadeField().setVisible(true);
				telaGerente.getPrecoLabel().setVisible(true);
				telaGerente.getPrecoField().setVisible(true);
				telaGerente.getAddButton().setVisible(true);

				telaGerente.getNomeLabel().setVisible(false);
				telaGerente.getNomeField().setVisible(false);
				telaGerente.getLoginLabel().setVisible(false);
				telaGerente.getLoginField().setVisible(false);
				telaGerente.getSenhaLabel().setVisible(false);
				telaGerente.getSenhaField().setVisible(false);
				telaGerente.getFuncaoLabel().setVisible(false);
				telaGerente.getFuncaoField().setVisible(false);
				telaGerente.getCpfLabel().setVisible(false);
				telaGerente.getCpfField().setVisible(false);
				telaGerente.getConfirmarButton().setVisible(false);

			}
		});

		telaGerente.getAddButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
		        IFachada fachada1 = Fachada.getInstance();
		        
		        Produto produto = new Produto();
		        produto.setNome(telaGerente.getProdutoField().getText());
		        produto.setCodigo(telaGerente.getCodigoField().getText());
		        produto.setFabricante(telaGerente.getFabricanteField().getText());
		        produto.setFinalidade(telaGerente.getFinalidadeField().getText());
		        produto.setPreco(Float.parseFloat(telaGerente.getPrecoField().getText()));
		        
		        fachada1.salvarProduto(produto);
		        
		        Mensagem1.exibir("Cadastrado com Sucesso");
			}

		});

		telaGerente.getListaProButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {				
		        IFachada fachada1 = Fachada.getInstance();
				telaProduto = new TelaProduto();
				telaProduto.getProdutosArea().append(fachada1.getAllProdutos().toString());
			}
		});

		telaGerente.getListaFuncButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
		        IFachada fachada1 = Fachada.getInstance();
				telaFuncionarios = new TelaListaFunc();
				telaFuncionarios.getFuncionariosArea().append(fachada1.getAllFuncionarios().toString());
			}
		});

		telaGerente.getTelaVendaButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				controlVenda();

			}
		});

		telaGerente.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				login.setVisible(true);
			}

		});

	}

	public void controlVenda() {

		TelaVenda telaVenda = new TelaVenda();
		
		telaVenda.getListaDeProdutosButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
		        IFachada fachada1 = Fachada.getInstance();
				telaProduto = new TelaProduto();
				telaProduto.getProdutosArea().append(fachada1.getAllProdutos().toString());
			}
		});
		
		telaVenda.getExibirButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
/*
				if (baseDados.validarProduto(telaVenda.getProdutoField().getText()) == false) {
					if (baseDados
							.validarQuantidade(Integer.parseInt(telaVenda.getQuantidadeField().getText())) == false) {
						telaVenda.getExibirProdutoLabel().setText(telaVenda.getProdutoField().getText());
						telaVenda.getExibirQuantidadeLabel().setText(telaVenda.getQuantidadeField().getText());
						for (int i = 0; i < BaseDados.getProdutos().size(); i++) {
							double preco = (int) (Integer.parseInt(telaVenda.getQuantidadeField().getText())
									* BaseDados.getProdutos().get(i).getPreco());
							telaVenda.getExibirPrecolabel().setText(Double.toString(preco));
						}
					} else
						Mensagem.exibir("Quantidade não armazenada");

				} else
					Mensagem.exibir("Produto não existe");
*/
			}
		});

	}

}
