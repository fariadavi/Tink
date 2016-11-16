package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Cadastro;
import Model.ManipulaCadastros;
import Model.tiposArquivo;
import View.TelaCadastro;

public class CadastroController {

	private TelaCadastro cadView;

	public CadastroController(TelaCadastro view) {
		this.cadView = view;

		this.cadView.addCadastroListener(new CadastroListener());
	}

	class CadastroListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			switch (e.getActionCommand()) {
			case "Cancelar":
				cadView.dispose();
				break;
			case "Limpar":
				cadView.limpaCadastro();
				break;
			case "Enviar":
				if (!cadView.cadastroPreenchido()) {
					cadView.displayMessage("Cadastro incompleto!\nTodos os campos são obrigatórios!");
					break;
				}

				if (!cadView.getPswd().equals(cadView.getConfPswd())) {
					cadView.displayMessage("Os campos de senha não coincidem!");
					break;
				}

				Cadastro novoCadastro = new Cadastro(cadView.getUser(), cadView.getPswd(), cadView.getMail(), cadView.isAluno(), cadView.isProfessor());

				if (!novoCadastro.isValidMail()) {
					cadView.displayMessage("Formato de e-mail inválido!");
					break;
				}

				String errorMessage = novoCadastro.checkForUser();
				if (!errorMessage.isEmpty()) {
					cadView.displayMessage(errorMessage);
					break;
				}

				ManipulaCadastros.adicionaCadastro(novoCadastro, tiposArquivo.CADASTRO);

				cadView.displayMessage("Usuário cadastrado com sucesso!");
				cadView.dispose();
				break;
			}
		}
	}
}
