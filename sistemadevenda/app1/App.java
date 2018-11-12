package app1;

import controller1.Controller;
import model1.BaseDados;
import view1.Login;

public class App {

	public static void main(String[] args) {
		Login login = new Login();
		BaseDados baseDados = new BaseDados();
		new Controller(login, baseDados);

	}

}
