package model;

import java.io.Serializable;

public class Cadastro implements Serializable {

	private static final long serialVersionUID = -3935035025131731085L;

	private String user;
	private String password;
	private String mail;
	private tiposAcesso tipoAcesso;
	private int pontuacao;

	public Cadastro() {}

	public Cadastro(String user, String password, String mail, boolean isAluno, boolean isProfessor) {
		this.user = user;
		this.password = password;
		this.mail = mail;
		this.tipoAcesso = isAluno ? tiposAcesso.ALUNO : isProfessor ? tiposAcesso.PROFESSOR : null;
		this.pontuacao = 0;
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
