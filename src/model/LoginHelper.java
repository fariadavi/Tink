package model;

public class LoginHelper {
	
	private Login loginInfo;
	private XmlDAO dao;
	
	public LoginHelper() {
		this.dao = new CadastroXmlDAOImpl();
	}
	
	public Cadastro checkForUser() {
		return dao.getCadastro(loginInfo.getUser());
	}
	
	public boolean validLogin() {
		Cadastro userFound = checkForUser();
		return userFound != null && userFound.getPassword().equals(loginInfo.getPassword()) && userFound.getTipoAcesso().equals(loginInfo.getTipoAcesso());
	}
	
	public Login getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(Login loginInfo) {
		this.loginInfo = loginInfo;
	}
}
