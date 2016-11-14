package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.LoginModel;
import View.Login;
import View.Menu;

public class LoginController {

	private LoginModel loginModel;
	private Login loginView;
	
	public LoginController(Login view, LoginModel model) {
		this.loginModel = model;
		this.loginView = view;
		
		this.loginView.addLoginListener(new LoginListener()); 
	}
	
	class LoginListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String user, pass = "";
			
			user = loginView.getUser();
			pass = loginView.getPassword();
			
			if(user.equals(loginModel.getUser()) && pass.equals(loginModel.getPsswd())) {
				new Menu().setVisible(true);
				loginView.dispose();
			} else {
				loginView.displayErrorMessage("Usuário e/ou senha Incorreta!");
			}
		}
	}
}
