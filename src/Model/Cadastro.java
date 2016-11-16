package Model;

import java.io.Serializable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cadastro implements Serializable {

	private static final long serialVersionUID = -3935035025131731085L;

	private String user;
	private String password;
	private String mail;
	private tiposAcesso tipoAcesso;
	private int pontuacao;

	private transient Matcher matcher;
	private transient Pattern pattern;

	private transient static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public Cadastro() {}

	public Cadastro(String user, String password, String mail, boolean isAluno, boolean isProfessor) {
		this.user = user;
		this.password = password;
		this.mail = mail;
		this.tipoAcesso = isAluno ? tiposAcesso.ALUNO : isProfessor ? tiposAcesso.PROFESSOR : null;
		this.pontuacao = 0;
	}

	public String checkForUser() {
		List<Cadastro> leCadastros = ManipulaCadastros.leCadastros(tiposArquivo.CADASTRO);
		String errorMessage = "";

		for (Cadastro cadastro : leCadastros) {
			if (cadastro.getUser().equals(getUser()))
				errorMessage += "Nome de usuário já cadastrado!";

			if (cadastro.getMail().equals(getMail()))
				errorMessage += "\nE-mail já cadastrado!";

			if (!errorMessage.isEmpty())
				break;
		}

		return errorMessage;
	}

	public boolean isValidMail() {
		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(mail);
		return matcher.matches();
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public tiposAcesso getTipoAcesso() {
		return tipoAcesso;
	}

	public void setTipoAcesso(tiposAcesso tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
}
