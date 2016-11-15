package Model;

public class Cadastro {
	
	private String user;
	private String password;
	private String mail;
	private tiposAcesso tipoAcesso;
	
	public Cadastro (String user, String password, String mail, tiposAcesso tipoAcesso) {
		this.user = user;
		this.password = password;
		this.mail = mail;
		this.tipoAcesso = tipoAcesso;
	}

	public String getUser() {
		return user;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getMail() {
		return mail;
	}
	
	public tiposAcesso tipoAcesso() {
		return tipoAcesso;
	}
}
