package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Cadastro;
import model.CadastroHelper;
import view.TelaCadastro;

public class CadastroHandler {

	private TelaCadastro cadView;
	private CadastroHelper cadHelper;

	public CadastroHandler(TelaCadastro view) {
		this.cadView = view;
		this.cadHelper = new CadastroHelper();

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
				cadHelper.setCadastro(novoCadastro);
				
				if (!cadHelper.isValidMail()) {
					cadView.displayMessage("Formato de e-mail inválido!");
					break;
				}

				String errorMsgUserExists = cadHelper.getErrorMsgUserExists();
				if (errorMsgUserExists != null && !errorMsgUserExists.isEmpty()) {
					cadView.displayMessage(errorMsgUserExists);
					break;
				}

				cadHelper.salvaCadastro();

				cadView.displayMessage("Usuário cadastrado com sucesso!");
				cadView.dispose();
				break;
			}
		}
	}
}
