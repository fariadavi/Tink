package model;

import java.util.List;

public class RankingXmlDAOImpl extends XmlDAOSupport implements XmlDAO {

	private static final String RANKING_PATH = tiposArquivo.RANKING.getFilepath();
	
	public Cadastro getCadastro(String user) {		
		List<Cadastro> leCadastros = readXML(RANKING_PATH);

		for (Cadastro cadastro : leCadastros)
			if(cadastro.getUser().equals(user) || cadastro.getMail().equals(user))
				return cadastro;
		return null;
	}


	@Override
	public void addEntry(Cadastro novoCadastro) {
		List<Cadastro> cadastros = readXML(RANKING_PATH);
		cadastros.remove(cadastros.size());
		cadastros.add(novoCadastro);
		writeXML(cadastros, RANKING_PATH);
	}
}
