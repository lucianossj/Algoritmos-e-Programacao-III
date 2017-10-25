
import java.nio.file.*;

public class FileReader {
	
	public String[] getWordsData(){

		Path path = Paths.get("Words.txt");

		try {

			byte[] text = Files.readAllBytes(path);
			String words = new String(text);

			String[] wordsArray = words.split(";");

			return wordsArray;

		} catch(Exception error) {

			System.out.print("Error on the file reading!!!");

			return null;

		}

	}

}