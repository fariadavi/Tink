package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Model.Cadastro;
import Model.LoginModel;
import View.Login;
import View.Menu;
import View.TelaCadastro;

public class LoginController {

	private LoginModel loginModel;
	private Login loginView;
	
	public LoginController(Login view, LoginModel model) {
		this.loginModel = model;
		this.loginView = view;
		
		this.loginView.addLoginListener(new LoginListener());
		this.loginView.addCadastroListener(new CadastroListener()); 
	}
	
	class LoginListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evt) {
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
	
	class CadastroListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			TelaCadastro telaCadastro = new TelaCadastro(loginView, true);
			new CadastroController(telaCadastro);
			telaCadastro.setVisible(true);
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {}

		@Override
		public void mouseExited(MouseEvent arg0) {}

		@Override
		public void mousePressed(MouseEvent arg0) {}

		@Override
		public void mouseReleased(MouseEvent arg0) {}
	}
}
