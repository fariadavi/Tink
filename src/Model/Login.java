package Model;

import java.util.List;

public class Login {

	private String user;
	private String password;
	private tiposAcesso tipoAcesso;

	public Login(String user, String password, boolean isAluno, boolean isProfessor) {
		this.user = user;
		this.password = password;
		this.tipoAcesso = isAluno ? tiposAcesso.ALUNO : isProfessor ? tiposAcesso.PROFESSOR : null;
	}

	public boolean checkForUser() {
		List<Cadastro> leCadastros = ManipulaCadastros.leCadastros(tiposArquivo.CADASTRO);

		for (Cadastro cadastro : leCadastros)
			if (cadastro.getUser().equals(getUser()) && cadastro.getPassword().equals(getPassword())
					&& cadastro.getTipoAcesso().equals(getTipoAcesso()))
				return true;
		return false;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public tiposAcesso getTipoAcesso() {
		return tipoAcesso;
	}

	public void setTipoAcesso(tiposAcesso tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}

}
