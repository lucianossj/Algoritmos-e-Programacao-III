
import java.nio.file.*;
import Word;

public class FileReader {
	
	public Word[] fileReader(){

		Path path = Paths.get("Words.txt");

		try {

			byte[] text = Files.readAllBytes(path);
			String words = new String(text);

			Word[] wordsArray = words.split(";");

		} catch(Exception error) {


		}

		/*Path path = Paths.get("Teste.txt");

		try {

			byte[] text = Files.readAllBytes(path);
			String reading = new String(text);

			System.out.print(reading);

		} catch(Exception error) {


		}*/

	}

}