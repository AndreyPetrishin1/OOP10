package homeOOP101;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		File file = new File("English.in.txt");
		Dictionary dictionary = new Dictionary(new Dictionary().library());

		dictionary.addWord("Key", "Клавиша");
		dictionary.addWord("Mamory", "Память");
		dictionary.addWord("Current", "Тукущий");
		dictionary.translate(file);
		dictionary.writetransText(new File("Ukrainian.out.txt"));
	
	}

}
