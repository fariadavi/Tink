package Model;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ManipulaCadastros {

	public static List<Cadastro> leCadastros(tiposArquivo tipo) {
		return leCadastros(tipo.getFilepath());
	}

	public static void adicionaCadastro(Cadastro novoCadastro, tiposArquivo tipo) {
		List<Cadastro> cadastros = leCadastros(tipo.getFilepath());
		cadastros.add(novoCadastro);
		escreveCadastros(cadastros, tipo.getFilepath());
	}

	private static List<Cadastro> leCadastros(String filepath) {
		List<Cadastro> cadastros = null;
		XMLDecoder decoder = null;

		File file = new File(filepath);
		if (file.isFile()) {
			try {
				try {
					decoder = new XMLDecoder(new FileInputStream(filepath));

					cadastros = (List<Cadastro>) decoder.readObject();
				} finally {
					if (decoder != null)
						decoder.close();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			cadastros = new ArrayList<Cadastro>();
//			cadastros = new Cadastro[0];
		}
		
		return cadastros;
//		return new ArrayList<Cadastro>(Arrays.asList(cadastros));
	}

	private static void escreveCadastros(List<Cadastro> cadastros, String filepath) {
		XMLEncoder encoder = null;
		try {
			try {
				encoder = new XMLEncoder(new FileOutputStream(filepath));
				encoder.writeObject(cadastros);
			} finally {
				if (encoder != null)
					encoder.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
