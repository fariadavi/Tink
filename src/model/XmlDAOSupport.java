package model;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class XmlDAOSupport {
	
	@SuppressWarnings("unchecked")
	protected List<Cadastro> readXML(String filepath) {
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
		}
		
		return cadastros;
	}

	protected void writeXML(List<Cadastro> cadastros, String filepath) {
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
