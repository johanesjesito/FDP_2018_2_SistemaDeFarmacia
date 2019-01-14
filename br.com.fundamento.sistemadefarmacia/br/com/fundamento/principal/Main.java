package br.com.fundamento.principal;

import br.com.fundamento.controle.Controller;
import br.com.fundamento.visao.Tela;

import java.awt.EventQueue;

public class Main {

    public static void main(String[] a) {

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

}
