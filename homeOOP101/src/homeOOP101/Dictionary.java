package homeOOP101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {
	private Map<String, String> dectionery = new HashMap<>(); 
	private String translated;

	Dictionary() {
		super();
		// TODO Auto-generated constructor stub
	}
	Dictionary(Map<String, String> dectionery) {
		super();
		this.dectionery = dectionery;
	}
	public Map<String, String> library () {
		dectionery.put("HellO", "������");
		dectionery.put("Map", "�����");
		dectionery.put("Name", "���");
		dectionery.put("Study", "�������");
		dectionery.put("Size", "������");
		dectionery.put("Coffee", "����");
		dectionery.put("Cup", "�����");
		dectionery.put("Car", "������");
		dectionery.put("Note", "������");
		return dectionery;
	}

	public void addWord(String Word1, String Word2) {
		dectionery.put(Word1, Word2);
	}

	private String getText(File eng) {
		String text = "";
		try (BufferedReader br = new BufferedReader(new FileReader(eng))) {
			String read;
			while ((read = br.readLine()) != null) {
				text += read + System.lineSeparator();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return text;
	}
	
	
	public void translate(File eng) {
		String engText = this.getText(eng);
		String transText = "";
		String word = "";
		char symb;
		for (int i = 0; i < engText.length(); i++) {
			symb = engText.charAt(i);
			if (Character.isLetter(symb)) {
				word += symb;
			} else if (word.compareTo("") != 0) {
				transText += dectionery.get(word);

				transText += symb;
				word = "";
				System.out.println(transText);
			} else {
				transText += symb;
			}
		}
		translated = transText;
	}
	public void writetransText(File transFile) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(transFile))) {
			bw.write(translated);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	
}
