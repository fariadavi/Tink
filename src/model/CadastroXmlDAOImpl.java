package model;

import java.util.List;

public class CadastroXmlDAOImpl extends XmlDAOSupport implements XmlDAO {

	private static final String CADASTRO_PATH = tiposArquivo.CADASTRO.getFilepath();

	public Cadastro getCadastro(String user) {		
		List<Cadastro> leCadastros = readXML(CADASTRO_PATH);

		for (Cadastro cadastro : leCadastros)
			if(cadastro.getUser().equalsIgnoreCase(user) || cadastro.getMail().equalsIgnoreCase(user))
				return cadastro;
		return null;
	}

	public void addEntry(Cadastro novoCadastro) {
		List<Cadastro> cadastros = readXML(CADASTRO_PATH);
		cadastros.add(novoCadastro);
		writeXML(cadastros, CADASTRO_PATH);
	}
}
