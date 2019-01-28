package TelaSendoFeita;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;

public class Funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
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
	public Funcionario() {
		setTitle("Funcionario");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Funcionario.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-capslock-button.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Produto");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Cadastrar Produto");
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Lista de Produtos");
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Vender Produto");
		menu.add(menuItem_2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblMedicamento = new JLabel("Medicamento:");
		lblMedicamento.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblFinalidade = new JLabel("Finalidade:");
		lblFinalidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblPreco = new JLabel("Pre\u00E7o:");
		lblPreco.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblEmpresa = new JLabel("Fonecedor:");
		lblEmpresa.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JComboBox comboProduto = new JComboBox();
		comboProduto.setEditable(true);
		GroupLayout editarProduto = new GroupLayout(contentPane);
		editarProduto.setHorizontalGroup(
			editarProduto.createParallelGroup(Alignment.LEADING)
				.addGroup(editarProduto.createSequentialGroup()
					.addGap(240)
					.addComponent(btnEditar)
					.addContainerGap(255, Short.MAX_VALUE))
				.addGroup(editarProduto.createSequentialGroup()
					.addGap(56)
					.addGroup(editarProduto.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblProduto)
						.addComponent(lblFinalidade)
						.addComponent(lblCodigo)
						.addComponent(lblMedicamento)
						.addComponent(lblEmpresa))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(editarProduto.createParallelGroup(Alignment.LEADING)
						.addComponent(comboProduto, 0, 374, Short.MAX_VALUE)
						.addGroup(editarProduto.createSequentialGroup()
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblPreco)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblQuantidade)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
						.addComponent(textField, 374, 374, Short.MAX_VALUE)
						.addComponent(textField_2, 374, 374, Short.MAX_VALUE)
						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
					.addGap(70))
		);
		editarProduto.setVerticalGroup(
			editarProduto.createParallelGroup(Alignment.LEADING)
				.addGroup(editarProduto.createSequentialGroup()
					.addGap(57)
					.addGroup(editarProduto.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProduto)
						.addComponent(comboProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(editarProduto.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMedicamento)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(editarProduto.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodigo)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPreco)
						.addComponent(lblQuantidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(editarProduto.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFinalidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(editarProduto.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmpresa)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addComponent(btnEditar)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		contentPane.setLayout(editarProduto);
	}
}
