package model;

public class RankingHelper {

	private XmlDAO dao;
	
	public RankingHelper() {
		this.dao = new RankingXmlDAOImpl();
	}
}
