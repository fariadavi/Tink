package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadastroHelper {
	
	private Cadastro cadastro;
	private XmlDAO dao;
	
	private Matcher matcher;
	private Pattern pattern;

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	public CadastroHelper() {
		this.dao = new CadastroXmlDAOImpl();
	}

	public boolean isValidMail() {
		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(cadastro.getMail());
		return matcher.matches();
	}
	
	public Cadastro checkUserExists() {
		Cadastro existingUser = dao.getCadastro(cadastro.getUser());
		
		if(existingUser == null)
			existingUser = dao.getCadastro(cadastro.getMail());
		
		return existingUser;
	}

	public String getErrorMsgUserExists() {
		Cadastro existingUser = checkUserExists();
		
		if(existingUser == null)
			return null;
		
		String errorMsg = "";
		
		if(cadastro.getUser().equals(existingUser.getUser()))
			errorMsg += "Nome de usuário já cadastrado!";
		
		if(cadastro.getPassword().equals(existingUser.getPassword()))
			errorMsg += "\r\nEndereço de e-mail já cadastrado!";
		
		return errorMsg;
	}
	
	public void salvaCadastro() {
		dao.addEntry(cadastro);
	}
	
	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
}
