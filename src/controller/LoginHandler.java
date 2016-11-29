package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Login;
import model.LoginHelper;
import view.TelaCadastro;
import view.TelaLogin;
import view.TelaMenu;

public class LoginHandler {

	private TelaLogin loginView;
	private LoginHelper loginHelper;

	public LoginHandler(TelaLogin view) {
		this.loginView = view;
		this.loginHelper = new LoginHelper();

		this.loginView.addLoginListener(new LoginListener());
	}

	class LoginListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evt) {
			Component component = (Component) evt.getSource();
			switch (component.getName()) {

			case "LOGIN":
				if(loginView.getUser().isEmpty() || loginView.getPassword().isEmpty()) {
					loginView.displayMessage("Entre com suas credenciais!");
					break;
				}
				
				if(!loginView.isAluno() && !loginView.isProfessor()) {
					loginView.displayMessage("Selecione um tipo de acesso!");
					break;
				}
				
				Login loginInfo = new Login(loginView.getUser(), loginView.getPassword(), loginView.isAluno(), loginView.isProfessor());
				loginHelper.setLoginInfo(loginInfo);
				
				if(!loginHelper.validLogin()) {
					loginView.displayMessage("Usuário e/ou senha inválidos!");
					break;
				}
				
				TelaMenu telaMenu = new TelaMenu();
				new MenuHandler(telaMenu, loginInfo.getTipoAcesso()); 
				telaMenu.setVisible(true);
				telaMenu.setLocationRelativeTo(null);
				loginView.dispose();
				break;

			case "CAD":
				TelaCadastro telaCadastro = new TelaCadastro(loginView, true);
				new CadastroHandler(telaCadastro);
				telaCadastro.setLocationRelativeTo(loginView);
				telaCadastro.setVisible(true);
				break;

			case "RESET":

			}
		}
	}
}
