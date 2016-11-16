package Controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Login;
import View.TelaMenu;
import View.TelaCadastro;
import View.TelaLogin;

public class LoginController {

	private TelaLogin loginView;

	public LoginController(TelaLogin view) {
		this.loginView = view;

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
				
				Login login = new Login(loginView.getUser(), loginView.getPassword(), loginView.isAluno(), loginView.isProfessor());
				if(!login.checkForUser()) {
					loginView.displayMessage("Usuário não cadastrado!");
					break;
				}
				
				TelaMenu telaMenu = new TelaMenu();
				new MenuController(telaMenu, login.getTipoAcesso()); 
				telaMenu.setVisible(true);
				telaMenu.setLocationRelativeTo(null);
				loginView.dispose();
				break;

			case "CAD":
				TelaCadastro telaCadastro = new TelaCadastro(loginView, true);
				new CadastroController(telaCadastro);
				telaCadastro.setLocationRelativeTo(loginView);
				telaCadastro.setVisible(true);
				break;

			case "RESET":

			}
		}
	}
}
