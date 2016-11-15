package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Cadastro;
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
			if (e.getActionCommand().equals("Cancelar"))
				cadView.dispose();
			else if (e.getActionCommand().equals("Limpar"))
				cadView.limpaCadastro();
			else if (e.getActionCommand().equals("Enviar"))
				if (cadView.cadastroCompleto()) {
					if (cadView.getPswd().equals(cadView.getConfPswd()))
						new Cadastro(cadView.getUser(), cadView.getPswd(), cadView.getMail(), cadView.getTipoAcesso());
					else
						cadView.displayMessage("Os campos de senha não coincidem!");
				} else {
					cadView.displayMessage("Cadastro incompleto!\nTodos os campos são obrigatórios!");
				}
					
		}

	}
}
