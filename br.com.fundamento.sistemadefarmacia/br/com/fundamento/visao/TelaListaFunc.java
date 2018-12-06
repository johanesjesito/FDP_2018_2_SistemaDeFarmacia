package br.com.fundamento.visao;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TelaListaFunc extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextArea funcionariosArea;
	private JScrollPane listaFuncionarios;
	
	public TelaListaFunc() {
		super("Lista de funcionarios");
		
		funcionariosArea = new JTextArea();
		
		funcionariosArea.setLineWrap(true);
		funcionariosArea.setEditable(false);
		listaFuncionarios = new JScrollPane(funcionariosArea);
		listaFuncionarios.setBounds(20, 20, 760, 240);
		
		setSize(800, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		add(listaFuncionarios);
		
		setVisible(true);
	}

	public JTextArea getFuncionariosArea() {
		return funcionariosArea;
	}

	public JScrollPane getListaFuncionarios() {
		return listaFuncionarios;
	}

}
