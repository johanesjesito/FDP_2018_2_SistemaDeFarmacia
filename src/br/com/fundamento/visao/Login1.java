package br.com.fundamento.visao;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login1 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField loginField, senhaField;
	private JLabel loginLabel, senhaLabel;
	private JButton entrarButton;

	public Login1() {
		super("Login");
		// TODO Auto-generated constructor stub
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		loginLabel = new JLabel(" Login:");
		loginField = new JTextField(10);
		senhaLabel = new JLabel("Senha:");
		senhaField = new JTextField(10);
		entrarButton = new JButton("Entrar");
		
		setSize(150, 110);
		setLayout(new FlowLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(entrarButton);
		
		setVisible(true);
		
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

}
