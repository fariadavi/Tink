package model;

public interface XmlDAO {
	
	public Cadastro getCadastro(String user);

	public void addEntry(Cadastro novoCadastro);
}
