package view1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaVenda extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel produtoLabel, quantidadeLabel, exibirProdutoLabel, exibirQuantidadeLabel, exibirPrecolabel, exibirProduto2Label, exibirQuantidade2Label, exibirPreco2label;
	private JTextField produtoField, quantidadeField;
	private JButton exibirButton, venderButton, listaDeProdutosButton;
	
	public TelaVenda() {
		// TODO Auto-generated constructor stub
		super("Venda");

		produtoLabel = new JLabel("Produto: ");
		produtoField = new JTextField(10);
		quantidadeLabel = new JLabel("Quantidade:");
		quantidadeField = new JTextField(8);
		exibirQuantidade2Label = new JLabel("Quantidade:");
		exibirProduto2Label = new JLabel("Produto:");
		exibirPreco2label = new JLabel("       Preço:     ");
		exibirQuantidadeLabel = new JLabel("               ");
		exibirProdutoLabel = new JLabel("               ");
		exibirPrecolabel = new JLabel("               ");
		exibirButton = new JButton("       Exibir       ");
		venderButton = new JButton("Vender");
		listaDeProdutosButton = new JButton("Lista de Produtos");

		setSize(150, 225);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		add(listaDeProdutosButton);
		add(produtoLabel);
		add(produtoField);
		add(quantidadeLabel);
		add(quantidadeField);
		add(exibirButton);
		add(exibirProduto2Label);
		add(exibirProdutoLabel);
		add(exibirQuantidade2Label);
		add(exibirQuantidadeLabel);
		add(exibirPreco2label);
		add(exibirPrecolabel);
		add(venderButton);

		setVisible(true);

	}

	public JLabel getExibirProdutoLabel() {
		return exibirProdutoLabel;
	}

	public JLabel getExibirQuantidadeLabel() {
		return exibirQuantidadeLabel;
	}

	public JLabel getExibirPrecolabel() {
		return exibirPrecolabel;
	}

	public JTextField getProdutoField() {
		return produtoField;
	}

	public JTextField getQuantidadeField() {
		return quantidadeField;
	}

	public JButton getExibirButton() {
		return exibirButton;
	}

	public JButton getVenderButton() {
		return venderButton;
	}

	public JButton getListaDeProdutosButton() {
		return listaDeProdutosButton;
	}

}
