package model;

public enum tiposArquivo {
	CADASTRO("cadastros.xml"), RANKING("ranking.xml");
	
	private String filepath;
	
	private tiposArquivo(String filepath) {
		this.filepath = filepath;
	}

	public String getFilepath() {
		return filepath;
	}
}
