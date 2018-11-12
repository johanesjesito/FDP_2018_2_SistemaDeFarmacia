package controller1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import model1.BaseDados;
import model1.Funcionario;
import model1.Produto;
import view1.Login;
import view1.Mensagem;
import view1.TelaGerente;
import view1.TelaListaFunc;
import view1.TelaProduto;
import view1.TelaVenda;

public class Controller {

	Login login;
	BaseDados baseDados;
	TelaProduto telaProduto;

	public Controller(Login login, BaseDados baseDados) {
		this.login = login;
		this.baseDados = baseDados;

		controlLogin();

	}

	public void controlLogin() {
		login.getEntrarButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (baseDados.confirmarGerente(login.getLoginField().getText(),
						login.getSenhaField().getText()) == true) {

					login.setVisible(false);

					controlGerente();

				} else if (baseDados.confirmarFuncionario(login.getLoginField().getText(),
						login.getSenhaField().getText()) == true) {

					controlVenda();

				} else
					Mensagem.exibir("Usuario Não Existe");
			}
		});

		login.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				if (Mensagem.confirmacao("Deseja sair?", "Sair") == JOptionPane.YES_OPTION) {
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
				telaGerente.getTelefoneLabel().setVisible(true);
				telaGerente.getTelefoneField().setVisible(true);
				telaGerente.getCpfLabel().setVisible(true);
				telaGerente.getCpfField().setVisible(true);
				telaGerente.getConfirmarButton().setVisible(true);

				telaGerente.getProdutoLabel().setVisible(false);
				telaGerente.getProdutoField().setVisible(false);
				telaGerente.getQuantidadeLabel().setVisible(false);
				telaGerente.getQuantidadeField().setVisible(false);
				telaGerente.getPrecoLabel().setVisible(false);
				telaGerente.getPrecoField().setVisible(false);
				telaGerente.getAddButton().setVisible(false);

			}
		});

		telaGerente.getConfirmarButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (baseDados.validarFuncionario(telaGerente.getLoginField().getText()) == true) {
					BaseDados.getFuncionarios()
							.add(new Funcionario(telaGerente.getNomeField().getText(),
									telaGerente.getLoginField().getText(), telaGerente.getSenhaField().getText(),
									telaGerente.getTelefoneField().getText(), telaGerente.getCpfField().getText()));
					Mensagem.exibir("Cadastrado com Sucesso!");
				} else {
					Mensagem.exibir("Funcionario já existe");
				}
			}
		});

		telaGerente.getCadasProButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				telaGerente.getProdutoLabel().setVisible(true);
				telaGerente.getProdutoField().setVisible(true);
				telaGerente.getQuantidadeLabel().setVisible(true);
				telaGerente.getQuantidadeField().setVisible(true);
				telaGerente.getPrecoLabel().setVisible(true);
				telaGerente.getPrecoField().setVisible(true);
				telaGerente.getAddButton().setVisible(true);

				telaGerente.getNomeLabel().setVisible(false);
				telaGerente.getNomeField().setVisible(false);
				telaGerente.getLoginLabel().setVisible(false);
				telaGerente.getLoginField().setVisible(false);
				telaGerente.getSenhaLabel().setVisible(false);
				telaGerente.getSenhaField().setVisible(false);
				telaGerente.getTelefoneLabel().setVisible(false);
				telaGerente.getTelefoneField().setVisible(false);
				telaGerente.getCpfLabel().setVisible(false);
				telaGerente.getCpfField().setVisible(false);
				telaGerente.getConfirmarButton().setVisible(false);

			}
		});

		telaGerente.getAddButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (baseDados.validarProduto(telaGerente.getProdutoField().getText()) == true) {
					BaseDados.getProdutos()
							.add(new Produto(telaGerente.getProdutoField().getText(),
									Integer.parseInt(telaGerente.getQuantidadeField().getText()),
									Double.parseDouble(telaGerente.getPrecoField().getText())));
					Mensagem.exibir("Add com Sucesso!");
				} else
					Mensagem.exibir("Produto já existe");
			}

		});

		telaGerente.getListaProButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				telaProduto = new TelaProduto();
				for (int i = 0; i < BaseDados.getProdutos().size(); i++)
					telaProduto.getProdutosArea()
							.append("Produto: " + BaseDados.getProdutos().get(i).getProduto() + ", Quantidade: "
									+ BaseDados.getProdutos().get(i).getQuantidade() + ", Preço: "
									+ BaseDados.getProdutos().get(i).getPreco() + "\n");

				/*
				 * for (Produto produto : BaseDados.getProdutos()) {
				 * telaGerente.getProdutosArea().append("Produto: " + produto.getProduto() +
				 * " Quantidade: " + produto.getQuantidade() + "Preço: " + produto.getPreco() +
				 * "\n"); }
				 */

			}
		});

		telaGerente.getListaFuncButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				TelaListaFunc telaFuncionarios = new TelaListaFunc();
				for (int i = 0; i < BaseDados.getFuncionarios().size(); i++)
					telaFuncionarios.getFuncionariosArea()
							.append("Nome: " + BaseDados.getFuncionarios().get(i).getNome() + "\n\nLogin: "
									+ BaseDados.getFuncionarios().get(i).getLogin() + ", Senha: "
									+ BaseDados.getFuncionarios().get(i).getSenha() + ", Telefone: "
									+ BaseDados.getFuncionarios().get(i).getTelefone() + ", CPF: "
									+ BaseDados.getFuncionarios().get(i).getCpf() + "\n"
									+ "______________________________________________"
									+ "______________________________________________" + "\n\n");

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
				// TODO Auto-generated method stub
				telaProduto = new TelaProduto();
				for (int i = 0; i < BaseDados.getProdutos().size(); i++)
					telaProduto.getProdutosArea()
							.append("Produto: " + BaseDados.getProdutos().get(i).getProduto() + ", Quantidade: "
									+ BaseDados.getProdutos().get(i).getQuantidade() + ", Preço: "
									+ BaseDados.getProdutos().get(i).getPreco() + "\n");
			}
		});
		
		telaVenda.getExibirButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

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

			}
		});

	}

}
