package Controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.tiposAcesso;
import View.ItemMenu;
import View.TelaMenu;

public class MenuController {
	private TelaMenu menuView;
	private tiposAcesso tipoAcesso;
	
	public MenuController(TelaMenu menuView, tiposAcesso tipoAcesso) {
		this.menuView = menuView;
		this.tipoAcesso = tipoAcesso;
		
		this.menuView.addMenuListener(new MenuListener());
		
		setTipoMenu();
	}

	private void setTipoMenu() {
		ItemMenu[] opcoes = menuView.getOpcoes();
		
		switch (tipoAcesso) {
			case ALUNO:
		        opcoes[1].setBotaoOpcaoText("Minhas Perguntas");
		        opcoes[1].setBotaoOpcaoName("MINHAS_PERG");
		        break;
			case PROFESSOR:
		        opcoes[1].setBotaoOpcaoText("Responder Perguntas");
		        opcoes[1].setBotaoOpcaoName("RESP_PERG");
//		        menuView.hideItem();
		        break;
		}
		
		menuView.setOpcoes(opcoes);
	}
	
	class MenuListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evt) {
			Component component = (Component) evt.getSource();
			switch (component.getName()) {

			case "CRIAR_PERG":
				break;

			case "MINHAS_PERG":
				break;

			case "RESP_PERG":
				break;

			case "PESQ_PERG":
				break;
				
			case "RANKING":
				break;

			case "SAIR":
				System.exit(0);
			}
		}
	}
}
