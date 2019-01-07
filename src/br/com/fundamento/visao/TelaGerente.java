package br.com.fundamento.visao;

import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.MaskFormatter;

public class TelaGerente extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton cadastrarButton, confirmarButton;
	private JLabel nomeLabel, loginLabel, senhaLabel, funcaoLabel, cpfLabel;
	private JTextField nomeField, loginField, senhaField, funcaoField, cpfField;
	
	private JButton cadasProButton, addButton;
	private JLabel produtoLabel, codigoLabel, fabricanteLabel, finalidadeLabel, precoLabel;
	private JTextField produtoField, codigoField, fabricanteField, finalidadeField, precoField;
	
	private JButton listaProButton, listaFuncButton, telaVendaButton;	

	public TelaGerente() {
		super("Gerente");
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		cadastrarButton = new JButton("Cad. Func.");
		confirmarButton = new JButton("Confirmar");
		nomeLabel = new JLabel(" Nome:");
		nomeField = new JTextField(10);
		loginLabel = new JLabel("  Login:");
		loginField = new JTextField(10);
		senhaLabel = new JLabel("Senha:");
		senhaField = new JTextField(10);
		funcaoLabel = new JLabel("Função");
		funcaoField = new JTextField(10);
		cpfLabel = new JLabel("     CPF:");
		try {
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cadasProButton = new JButton("Cad. Prod.");
		addButton = new JButton("Add");
		produtoLabel = new JLabel("Produto:");
		produtoField = new JTextField(10);
		codigoLabel = new JLabel("    Codigo:");
		codigoField = new JTextField(10);
		fabricanteLabel = new JLabel("Fabricante:");
		fabricanteField = new JTextField(10);
		finalidadeLabel = new JLabel("   Finalidade:");
		finalidadeField = new JTextField(10);
		precoLabel = new JLabel("  Preço:");
		precoField = new JTextField(10);
		
		listaProButton = new JButton("Produtos");
		listaFuncButton = new JButton("Funcionarios");
		telaVendaButton = new JButton("Venda");
		
		nomeLabel.setBounds(275, 40, 100, 30);
		nomeField.setBounds(325, 40, 100, 30);
		loginLabel.setBounds(275,80, 100, 30);
		loginField.setBounds(325, 80, 100, 30);
		senhaLabel.setBounds(275, 120, 100, 30);
		senhaField.setBounds(325, 120, 100, 30);
		funcaoLabel.setBounds(275, 160, 100, 30);
		funcaoField.setBounds(325, 160, 100, 30);
		cpfLabel.setBounds(275, 200, 100, 30);
		cpfField.setBounds(325, 200, 100, 30);
		confirmarButton.setBounds(300, 260, 100, 30);
		
		produtoLabel.setBounds(270, 20, 100, 30);
		produtoField.setBounds(325, 20, 100, 30);
		codigoLabel.setBounds(250,60, 100, 30);
		codigoField.setBounds(325, 60, 100, 30);
		fabricanteLabel.setBounds(250,100, 100, 30);
		fabricanteField.setBounds(325,100, 100, 30);
		finalidadeLabel.setBounds(250,140, 100, 30);
		finalidadeField.setBounds(325,140, 100, 30);
		precoLabel.setBounds(275, 180, 100, 30);
		precoField.setBounds(325, 180, 100, 30);
		addButton.setBounds(300, 220, 100, 30);
				
		setSize(500, 350);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		add(cadastrarButton).setBounds(40, 40, 100, 30);
		add(nomeLabel).setVisible(false);
		add(nomeField).setVisible(false);
		add(loginLabel).setVisible(false);
		add(loginField).setVisible(false);
		add(senhaLabel).setVisible(false);
		add(senhaField).setVisible(false);
		add(funcaoLabel).setVisible(false);
		add(funcaoField).setVisible(false);
		add(cpfLabel).setVisible(false);
		add(cpfField).setVisible(false);
		add(confirmarButton).setVisible(false);
		
		add(cadasProButton).setBounds(40, 80, 100, 30);
		add(produtoLabel).setVisible(false);
		add(produtoField).setVisible(false);
		add(codigoLabel).setVisible(false);
		add(codigoField).setVisible(false);
		add(fabricanteLabel).setVisible(false);
		add(fabricanteField).setVisible(false);
		add(finalidadeLabel).setVisible(false);
		add(finalidadeField).setVisible(false);
		add(precoLabel).setVisible(false);
		add(precoField).setVisible(false);
		add(addButton).setVisible(false);
		
		add(listaProButton).setBounds(40, 120, 100, 30);
		add(listaFuncButton).setBounds(40, 160, 100, 30);
		add(telaVendaButton).setBounds(40, 200, 100, 30);
		
		setVisible(true);
		
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getConfirmarButton() {
		return confirmarButton;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public JLabel getFuncaoLabel() {
		return funcaoLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JTextField getFuncaoField() {
		return funcaoField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getCadasProButton() {
		return cadasProButton;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public JLabel getProdutoLabel() {
		return produtoLabel;
	}

	public JLabel getPrecoLabel() {
		return precoLabel;
	}

	public JTextField getProdutoField() {
		return produtoField;
	}

	public JTextField getPrecoField() {
		return precoField;
	}

	public JButton getListaProButton() {
		return listaProButton;
	}

	public JButton getListaFuncButton() {
		return listaFuncButton;
	}

	public JButton getTelaVendaButton() {
		return telaVendaButton;
	}

	public JLabel getCodigoLabel() {
		return codigoLabel;
	}

	public JLabel getFabricanteLabel() {
		return fabricanteLabel;
	}

	public JLabel getFinalidadeLabel() {
		return finalidadeLabel;
	}

	public JTextField getCodigoField() {
		return codigoField;
	}

	public JTextField getFabricanteField() {
		return fabricanteField;
	}

	public JTextField getFinalidadeField() {
		return finalidadeField;
	}

}
