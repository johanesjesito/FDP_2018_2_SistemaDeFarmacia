package view1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TelaProduto extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextArea produtosArea;
	private JScrollPane listaProduto;
	
	public TelaProduto() {
		super("Lista de Produtos");
		
		produtosArea = new JTextArea();
		
		produtosArea.setLineWrap(true);
		produtosArea.setEditable(false);
		listaProduto = new JScrollPane(produtosArea);
		listaProduto.setBounds(20, 20, 460, 240);
		
		setSize(500, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		add(listaProduto);
		
		setVisible(true);
	}

	public JTextArea getProdutosArea() {
		return produtosArea;
	}

	public JScrollPane getListaProduto() {
		return listaProduto;
	}

}
