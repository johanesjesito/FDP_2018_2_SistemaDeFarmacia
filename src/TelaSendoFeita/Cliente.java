package TelaSendoFeita;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;

public class Cliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCpf;
	private JTextField txtNome_1;
	private JTextField txtCidade;
	private JTextField txtRua;
	private JTextField txtCep;
	private JTextField txtCep_1;
	private JTextField txtNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
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
	public Cliente() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cliente.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-capslock-button.png")));
		setTitle("Gerente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCpf_1 = new JLabel("CPF:");
		lblCpf_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtNome_1 = new JTextField();
		txtNome_1.setColumns(10);
		
		JButton btnEditar_3 = new JButton("Editar");
		btnEditar_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCidade_1 = new JLabel("Cidade:");
		lblCidade_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblRua_1 = new JLabel("Rua:");
		lblRua_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		
		txtRua = new JTextField();
		txtRua.setColumns(10);
		
		txtCep = new JTextField();
		txtCep.setColumns(10);
		
		JLabel lblCep_2 = new JLabel("CEP:");
		lblCep_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCep_3 = new JLabel("CEP:");
		lblCep_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtCep_1 = new JTextField();
		txtCep_1.setColumns(10);
		
		JLabel lblNumero_1 = new JLabel("Numero:");
		lblNumero_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JComboBox comboCliente = new JComboBox();
		comboCliente.setEditable(true);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCep_2)
						.addComponent(lblRua_1)
						.addComponent(lblCliente)
						.addComponent(lblNome_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCep_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
								.addComponent(txtNome_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
								.addComponent(txtRua, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCep_3)
								.addComponent(lblCidade_1)
								.addComponent(lblCpf_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCpf, 187, 187, 187)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(txtCep, Alignment.TRAILING)
									.addComponent(txtCidade, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))))
						.addComponent(comboCliente, 0, 412, Short.MAX_VALUE))
					.addGap(89))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(236)
					.addComponent(btnEditar_3)
					.addContainerGap(259, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(173)
					.addComponent(lblNumero_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(231, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(58)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCliente)
						.addComponent(comboCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCpf_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCidade_1)
								.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCep_2)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNome_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNome_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtRua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblRua_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCep_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCep_3))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumero_1)
						.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(btnEditar_3)
					.addGap(40))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
