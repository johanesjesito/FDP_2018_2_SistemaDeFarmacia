package br.com.fundamento.visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.fundamento.controle.Controller;

import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Toolkit;
import java.text.ParseException;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

public class Tela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextField txtSenha;
	private JTextField textField;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTable table_0;
	private JTable table_1;
//	private JTextField textField_8;
//	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
//	private JTextField textField_15;
//	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;

	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	
	private JSpinner spinner;
	
	JMenu menu;
	JMenu menu_2;
	JMenu menu_1;
	JMenu menu_3;
	
	private JMenuItem menuItem_6;
	private JMenuItem mntmCadastrar;
	private JMenuItem mntmLista;
	private JMenuItem menuItem_7;
	private JMenuItem menuItem_8;
	private JMenuItem mntmCadastrar_1;
	private JMenuItem mntmLista_1;
	
	private GroupLayout funcionarioCadastro;
	private GroupLayout loginTela;
	private GroupLayout vendaTela;
	private GroupLayout produtoTela;
	private GroupLayout listaFuncionario;
	private GroupLayout listaProduto;
	private GroupLayout clienteTela;
	
	private JLabel lblSenha, lblLogin, lblNome, lblSenha_1, lblLogin_1, lblCpf, lblFuncionario, lblEndereo;
	private JLabel lblCidade, lblRua, lblCep, lblCep_1, lblProduto, lblQuantidade, lblPreco, lblLista, lblVenda;
	private JLabel lblDinheiro, lblMedicamento, lblQuantidade_1, lblFinalidade, lblPreco_1, lblEmpresa, lblPesquisa;
	private JLabel lblPesquisa_1, lblNome_1, lblCpf_1, lblCidade_1, lblRua_1, lblCep_2, lblCep_3, lblCliente;
	private JLabel lblFuno, lblNumero, lblCodigo, lblNumero_1, lblCliente_1;
	
	private JButton btnCadastrar;
	private JButton btnEntrar;
	private JButton btnComprar;
	private JButton btnAdicionar;
	private JButton btnCadastrar_1;
	private JButton btnPesquisar;
	private JButton btnPesquisar_1;
	private JButton btnCadastrar_3;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					new Controller(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setBackground(Color.LIGHT_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tela.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-capslock-button.png")));
		setTitle("Sistema De Farmacia");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
				
		menu_2 = new JMenu("Menu");
		menuBar.add(menu_2);
		
		menuItem_6 = new JMenuItem("Sair");
		menu_2.add(menuItem_6);
		
		menu_1 = new JMenu("Produto");
		menuBar.add(menu_1);
		
		mntmCadastrar = new JMenuItem("Cadastrar");
		menu_1.add(mntmCadastrar);
		
		mntmLista = new JMenuItem("Lista");
		menu_1.add(mntmLista);
		
		menu_3 = new JMenu("Cliente");
		menuBar.add(menu_3);
		
		menuItem_7 = new JMenuItem("Cadastrar");
		menu_3.add(menuItem_7);
		
		menuItem_8 = new JMenuItem("Venda");
		menu_3.add(menuItem_8);
		
		menu = new JMenu("Gerente");
		menuBar.add(menu);
		
		mntmCadastrar_1 = new JMenuItem("Cadastrar Funcionario");
		menu.add(mntmCadastrar_1);
		
		mntmLista_1 = new JMenuItem("Lista de Funcionario");
		menu.add(mntmLista_1);
		
		lblSenha = new JLabel("Senha: ");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 12));
		
		txtSenha = new JTextField();
		txtSenha.setFont(new Font("Arial", Font.PLAIN, 12));
		txtSenha.setColumns(10);
		
		lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setColumns(10);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		try {
			textField_0 = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textField_0.setColumns(10);
		
		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblLogin_1 = new JLabel("Login:");
		lblLogin_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblFuncionario = new JLabel("Funcionario");
		lblFuncionario.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblCep_1 = new JLabel("CEP:");
		lblCep_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		
		lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		
		table = new JTable();
		
		btnComprar = new JButton("Comprar");
		
		lblCliente_1 = new JLabel("Cliente:");
		lblCliente_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBox_3 = new JComboBox();
		comboBox_3.setEditable(true);
		
		lblProduto = new JLabel("Produto:");
		lblProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		
//		textField_8 = new JTextField();
//		textField_8.setColumns(10);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		
		lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		
//		textField_9 = new JTextField();
//		textField_9.setColumns(5);
		
		spinner = new JSpinner();
		
		btnAdicionar = new JButton("Adicionar");
		
		lblPreco = new JLabel("Preco:");
		lblPreco.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblLista = new JLabel("Lista:");
		lblLista.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblVenda = new JLabel("Venda");
		lblVenda.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		lblDinheiro = new JLabel("");
						
		lblMedicamento = new JLabel("Medicamento:");
		lblMedicamento.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		lblQuantidade_1 = new JLabel("Quantidade:");
		lblQuantidade_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblFinalidade = new JLabel("Finalidade:");
		lblFinalidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblPreco_1 = new JLabel("Pre\u00E7o:");
		lblPreco_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblEmpresa = new JLabel("Fonecedor:");
		lblEmpresa.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		
		btnCadastrar_1 = new JButton("Cadastrar");
		btnCadastrar_1.setFont(new Font("Tahoma", Font.BOLD, 11));
				
		lblPesquisa = new JLabel("Pesquisa:");
		
//		textField_15 = new JTextField();
//		textField_15.setColumns(10);
		
		btnPesquisar = new JButton("Pesquisar");
		
		table_0 = new JTable();
		
		comboBox = new JComboBox();
		comboBox.setEditable(true);
		
		lblPesquisa_1 = new JLabel("Pesquisa:");
		
//		textField_16 = new JTextField();
//		textField_16.setColumns(10);
		
		btnPesquisar_1 = new JButton("Pesquisar");
		
		table_1 = new JTable();
		
		comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		
		try {
			textField_17 = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textField_17.setColumns(10);
		
		lblNome_1 = new JLabel("Nome:");
		lblNome_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblCpf_1 = new JLabel("CPF:");
		lblCpf_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		
		btnCadastrar_3 = new JButton("Cadastrar");
		btnCadastrar_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblCidade_1 = new JLabel("Cidade:");
		lblCidade_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblRua_1 = new JLabel("Rua:");
		lblRua_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		
		lblCep_2 = new JLabel("CEP:");
		lblCep_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblCep_3 = new JLabel("CEP:");
		lblCep_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		
		lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		lblNumero_1 = new JLabel("Numero:");
		lblNumero_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		clienteTela = new GroupLayout(contentPane);
		clienteTela.setHorizontalGroup(
			clienteTela.createParallelGroup(Alignment.LEADING)
				.addGroup(clienteTela.createSequentialGroup()
					.addGap(37)
					.addGroup(clienteTela.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCep_2)
						.addComponent(lblNome_1)
						.addComponent(lblRua_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(clienteTela.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_22, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
						.addComponent(textField_18, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
						.addComponent(textField_20, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
					.addGap(11)
					.addGroup(clienteTela.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCep_3)
						.addComponent(lblCidade_1)
						.addComponent(lblCpf_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(clienteTela.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_17, 187, 187, 187)
						.addGroup(clienteTela.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField_21, Alignment.TRAILING)
							.addComponent(textField_19, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
					.addGap(89))
				.addGroup(clienteTela.createSequentialGroup()
					.addGap(251)
					.addComponent(lblCliente)
					.addContainerGap(270, Short.MAX_VALUE))
				.addGroup(clienteTela.createSequentialGroup()
					.addGap(236)
					.addComponent(btnCadastrar_3)
					.addContainerGap(259, Short.MAX_VALUE))
				.addGroup(clienteTela.createSequentialGroup()
					.addGap(173)
					.addComponent(lblNumero_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(237, Short.MAX_VALUE))
		);
		clienteTela.setVerticalGroup(
			clienteTela.createParallelGroup(Alignment.LEADING)
				.addGroup(clienteTela.createSequentialGroup()
					.addGap(45)
					.addComponent(lblCliente)
					.addGap(41)
					.addGroup(clienteTela.createParallelGroup(Alignment.LEADING)
						.addGroup(clienteTela.createSequentialGroup()
							.addGroup(clienteTela.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCpf_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(clienteTela.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCidade_1)
								.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(clienteTela.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCep_2)))
						.addGroup(clienteTela.createSequentialGroup()
							.addGroup(clienteTela.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNome_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(clienteTela.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblRua_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(clienteTela.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCep_3))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(clienteTela.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumero_1)
						.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(btnCadastrar_3)
					.addGap(40))
		);
		
		listaProduto = new GroupLayout(contentPane);
		listaProduto.setHorizontalGroup(
			listaProduto.createParallelGroup(Alignment.TRAILING)
				.addGroup(listaProduto.createSequentialGroup()
					.addGroup(listaProduto.createParallelGroup(Alignment.LEADING)
						.addGroup(listaProduto.createSequentialGroup()
							.addGap(79)
							.addComponent(table_0, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE))
						.addGroup(listaProduto.createSequentialGroup()
							.addGap(111)
							.addComponent(lblPesquisa)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(52)
							.addComponent(btnPesquisar)))
					.addContainerGap(73, Short.MAX_VALUE))
		);
		listaProduto.setVerticalGroup(
			listaProduto.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, listaProduto.createSequentialGroup()
					.addGap(43)
					.addGroup(listaProduto.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPesquisa)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table_0, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		
		listaFuncionario = new GroupLayout(contentPane);
		listaFuncionario.setHorizontalGroup(
			listaFuncionario.createParallelGroup(Alignment.TRAILING)
				.addGroup(listaFuncionario.createSequentialGroup()
					.addGroup(listaFuncionario.createParallelGroup(Alignment.LEADING)
						.addGroup(listaFuncionario.createSequentialGroup()
							.addGap(79)
							.addComponent(table_1, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE))
						.addGroup(listaFuncionario.createSequentialGroup()
							.addGap(111)
							.addComponent(lblPesquisa_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(52)
							.addComponent(btnPesquisar_1)))
					.addContainerGap(73, Short.MAX_VALUE))
		);
		listaFuncionario.setVerticalGroup(
			listaFuncionario.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, listaFuncionario.createSequentialGroup()
					.addGap(43)
					.addGroup(listaFuncionario.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPesquisa_1)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisar_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table_1, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		
		produtoTela = new GroupLayout(contentPane);
		produtoTela.setHorizontalGroup(
			produtoTela.createParallelGroup(Alignment.TRAILING)
				.addGroup(produtoTela.createSequentialGroup()
					.addGap(56)
					.addGroup(produtoTela.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblFinalidade)
						.addComponent(lblCodigo)
						.addComponent(lblMedicamento)
						.addComponent(lblEmpresa))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(produtoTela.createParallelGroup(Alignment.LEADING)
						.addGroup(produtoTela.createSequentialGroup()
							.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblPreco_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblQuantidade_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_11, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
						.addComponent(textField_10)
						.addComponent(textField_12)
						.addComponent(textField_14, GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
					.addGap(70))
				.addGroup(Alignment.LEADING, produtoTela.createSequentialGroup()
					.addGap(240)
					.addComponent(btnCadastrar_1)
					.addContainerGap(255, Short.MAX_VALUE))
		);
		produtoTela.setVerticalGroup(
			produtoTela.createParallelGroup(Alignment.LEADING)
				.addGroup(produtoTela.createSequentialGroup()
					.addGap(54)
					.addGroup(produtoTela.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMedicamento)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(produtoTela.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodigo)
						.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPreco_1)
						.addComponent(lblQuantidade_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(produtoTela.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFinalidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(produtoTela.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmpresa)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addComponent(btnCadastrar_1)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		
		vendaTela = new GroupLayout(contentPane);
		vendaTela.setHorizontalGroup(
			vendaTela.createParallelGroup(Alignment.LEADING)
				.addGroup(vendaTela.createSequentialGroup()
					.addContainerGap(87, Short.MAX_VALUE)
					.addGroup(vendaTela.createParallelGroup(Alignment.LEADING)
						.addGroup(vendaTela.createSequentialGroup()
							.addComponent(lblPreco)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblDinheiro)
							.addGap(18)
							.addComponent(btnComprar))
						.addComponent(lblLista)
						.addGroup(vendaTela.createSequentialGroup()
							.addGroup(vendaTela.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCliente_1)
								.addComponent(lblProduto))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(vendaTela.createParallelGroup(Alignment.LEADING, false)
								.addGroup(Alignment.TRAILING, vendaTela.createSequentialGroup()
									.addComponent(comboBox_3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblQuantidade)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnAdicionar))
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)))
						.addGroup(vendaTela.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE)))
					.addGap(84))
				.addGroup(vendaTela.createSequentialGroup()
					.addGap(241)
					.addComponent(lblVenda)
					.addContainerGap(286, Short.MAX_VALUE))
		);
		vendaTela.setVerticalGroup(
			vendaTela.createParallelGroup(Alignment.TRAILING)
				.addGroup(vendaTela.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblVenda)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(vendaTela.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCliente_1)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(vendaTela.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProduto)
						.addComponent(btnAdicionar)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblQuantidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLista)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(vendaTela.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreco)
						.addComponent(lblDinheiro)
						.addComponent(btnComprar))
					.addGap(52))
		);
		
		loginTela = new GroupLayout(contentPane);
		loginTela.setHorizontalGroup(
			loginTela.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, loginTela.createSequentialGroup()
					.addContainerGap(219, Short.MAX_VALUE)
					.addGroup(loginTela.createParallelGroup(Alignment.LEADING)
						.addGroup(loginTela.createSequentialGroup()
							.addGroup(loginTela.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblLogin, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSenha))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(loginTela.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textField, Alignment.LEADING)
								.addComponent(txtSenha, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(loginTela.createSequentialGroup()
							.addGap(43)
							.addComponent(btnEntrar)))
					.addGap(197))
		);
		loginTela.setVerticalGroup(
			loginTela.createParallelGroup(Alignment.TRAILING)
				.addGroup(loginTela.createSequentialGroup()
					.addContainerGap(111, Short.MAX_VALUE)
					.addGroup(loginTela.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLogin, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(loginTela.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSenha))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEntrar)
					.addGap(98))
		);
				
		funcionarioCadastro = new GroupLayout(contentPane);
		funcionarioCadastro.setHorizontalGroup(
			funcionarioCadastro.createParallelGroup(Alignment.LEADING)
				.addGroup(funcionarioCadastro.createSequentialGroup()
					.addContainerGap(130, Short.MAX_VALUE)
					.addComponent(lblFuncionario, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addGap(86)
					.addComponent(lblEndereo)
					.addGap(113))
				.addGroup(funcionarioCadastro.createSequentialGroup()
					.addGap(36)
					.addGroup(funcionarioCadastro.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnCadastrar)
						.addGroup(funcionarioCadastro.createSequentialGroup()
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCpf)
								.addComponent(lblNome)
								.addComponent(lblSenha_1)
								.addComponent(lblLogin_1)
								.addComponent(lblFuno))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_23)
								.addComponent(textField_0)
								.addComponent(textField_1, 197, 197, Short.MAX_VALUE)
								.addComponent(textField_3)
								.addComponent(textField_4))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCep)
								.addComponent(lblCidade)
								.addComponent(lblRua)
								.addComponent(lblCep_1)
								.addComponent(lblNumero))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(funcionarioCadastro.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_24)
						.addComponent(textField_7)
						.addComponent(textField_5)
						.addComponent(textField_6, Alignment.TRAILING)
						.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		funcionarioCadastro.setVerticalGroup(
			funcionarioCadastro.createParallelGroup(Alignment.LEADING)
				.addGroup(funcionarioCadastro.createSequentialGroup()
					.addGap(19)
					.addGroup(funcionarioCadastro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFuncionario, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEndereo))
					.addGap(18)
					.addGroup(funcionarioCadastro.createParallelGroup(Alignment.LEADING)
						.addGroup(funcionarioCadastro.createSequentialGroup()
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLogin_1)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSenha_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNome)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCpf)
								.addComponent(textField_0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFuno)
								.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(funcionarioCadastro.createSequentialGroup()
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCidade)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCep))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRua)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCep_1)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(funcionarioCadastro.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNumero))))
					.addGap(33)
					.addComponent(btnCadastrar)
					.addGap(44))
		);
		
		contentPane.setLayout(loginTela);

	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTxtSenha() {
		return txtSenha;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_0() {
		return textField_0;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public JTextField getTextField_7() {
		return textField_7;
	}

	public JTable getTable() {
		return table;
	}

//	public JTextField getTextField_8() {
//		return textField_8;
//	}
//
//	public JTextField getTextField_9() {
//		return textField_9;
//	}

	public JTextField getTextField_10() {
		return textField_10;
	}

	public JTextField getTextField_11() {
		return textField_11;
	}

	public JTextField getTextField_12() {
		return textField_12;
	}

	public JTextField getTextField_13() {
		return textField_13;
	}

	public JTextField getTextField_14() {
		return textField_14;
	}

	public JMenuItem getMenuItem_6() {
		return menuItem_6;
	}

	public JMenuItem getMntmCadastrar() {
		return mntmCadastrar;
	}

	public JMenuItem getMntmLista() {
		return mntmLista;
	}

	public JMenuItem getMenuItem_7() {
		return menuItem_7;
	}

	public JMenuItem getMenuItem_8() {
		return menuItem_8;
	}

	public JMenuItem getMntmCadastrar_1() {
		return mntmCadastrar_1;
	}

	public JMenuItem getMntmLista_1() {
		return mntmLista_1;
	}

	public GroupLayout getFuncionarioCadastro() {
		return funcionarioCadastro;
	}

	public GroupLayout getLoginTela() {
		return loginTela;
	}

	public GroupLayout getVendaTela() {
		return vendaTela;
	}

	public GroupLayout getProdutoTela() {
		return produtoTela;
	}

	public JLabel getLblSenha() {
		return lblSenha;
	}

	public JLabel getLblLogin() {
		return lblLogin;
	}

	public JButton getBtnEntrar() {
		return btnEntrar;
	}

	public JMenu getMenu() {
		return menu;
	}

	public JMenu getMenu_2() {
		return menu_2;
	}

	public JMenu getMenu_1() {
		return menu_1;
	}

	public JMenu getMenu_3() {
		return menu_3;
	}

	public JLabel getLblNome() {
		return lblNome;
	}

	public JLabel getLblSenha_1() {
		return lblSenha_1;
	}

	public JLabel getLblLogin_1() {
		return lblLogin_1;
	}

	public JLabel getLblCpf() {
		return lblCpf;
	}

	public JLabel getLblFuncionario() {
		return lblFuncionario;
	}

	public JLabel getLblEndereo() {
		return lblEndereo;
	}

	public JLabel getLblCidade() {
		return lblCidade;
	}

	public JLabel getLblRua() {
		return lblRua;
	}

	public JLabel getLblCep() {
		return lblCep;
	}

	public JLabel getLblCep_1() {
		return lblCep_1;
	}

	public JLabel getLblProduto() {
		return lblProduto;
	}

	public JLabel getLblQuantidade() {
		return lblQuantidade;
	}

	public JLabel getLblPreco() {
		return lblPreco;
	}

	public JLabel getLblLista() {
		return lblLista;
	}

	public JLabel getLblVenda() {
		return lblVenda;
	}

	public JLabel getLblDinheiro() {
		return lblDinheiro;
	}

	public JLabel getLblMedicamento() {
		return lblMedicamento;
	}

	public JLabel getLblQuantidade_1() {
		return lblQuantidade_1;
	}

	public JLabel getLblFinalidade() {
		return lblFinalidade;
	}

	public JLabel getLblPreco_1() {
		return lblPreco_1;
	}

	public JLabel getLblEmpresa() {
		return lblEmpresa;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public JButton getBtnComprar() {
		return btnComprar;
	}

	public JButton getBtnAdicionar() {
		return btnAdicionar;
	}

	public JButton getBtnCadastrar_1() {
		return btnCadastrar_1;
	}

	public JTable getTable_0() {
		return table_0;
	}

	public JTable getTable_1() {
		return table_1;
	}

//	public JTextField getTextField_15() {
//		return textField_15;
//	}

//	public JTextField getTextField_16() {
//		return textField_16;
//	}

	public GroupLayout getListaFuncionario() {
		return listaFuncionario;
	}

	public GroupLayout getListaProduto() {
		return listaProduto;
	}

	public JLabel getLblPesquisa() {
		return lblPesquisa;
	}

	public JLabel getLblPesquisa_1() {
		return lblPesquisa_1;
	}

	public JButton getBtnPesquisar() {
		return btnPesquisar;
	}

	public JButton getBtnPesquisar_1() {
		return btnPesquisar_1;
	}

	public JTextField getTextField_17() {
		return textField_17;
	}

	public JTextField getTextField_18() {
		return textField_18;
	}

	public JTextField getTextField_19() {
		return textField_19;
	}

	public JTextField getTextField_20() {
		return textField_20;
	}

	public JTextField getTextField_21() {
		return textField_21;
	}

	public JTextField getTextField_22() {
		return textField_22;
	}

	public GroupLayout getClienteTela() {
		return clienteTela;
	}

	public JLabel getLblNome_1() {
		return lblNome_1;
	}

	public JLabel getLblCpf_1() {
		return lblCpf_1;
	}

	public JLabel getLblCidade_1() {
		return lblCidade_1;
	}

	public JLabel getLblRua_1() {
		return lblRua_1;
	}

	public JLabel getLblCep_2() {
		return lblCep_2;
	}

	public JLabel getLblCep_3() {
		return lblCep_3;
	}

	public JLabel getLblCliente() {
		return lblCliente;
	}

	public JButton getBtnCadastrar_3() {
		return btnCadastrar_3;
	}

	public void setLblDinheiro(JLabel lblDinheiro) {
		this.lblDinheiro = lblDinheiro;
	}

	public JTextField getTextField_23() {
		return textField_23;
	}

	public JTextField getTextField_24() {
		return textField_24;
	}

	public JLabel getLblFuno() {
		return lblFuno;
	}

	public JLabel getLblNumero() {
		return lblNumero;
	}

	public JTextField getTextField_25() {
		return textField_25;
	}

	public JLabel getLblCodigo() {
		return lblCodigo;
	}

	public JTextField getTextField_26() {
		return textField_26;
	}

	public JLabel getLblNumero_1() {
		return lblNumero_1;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public JComboBox getComboBox_1() {
		return comboBox_1;
	}

	public JComboBox getComboBox_2() {
		return comboBox_2;
	}

	public JComboBox getComboBox_3() {
		return comboBox_3;
	}

	public JSpinner getSpinner() {
		return spinner;
	}

	public JLabel getLblCliente_1() {
		return lblCliente_1;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public void setTable_0(JTable table_0) {
		this.table_0 = table_0;
	}

	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
	}
	
	
	
}
