
import java.nio.file.*;

public class FileReader {
	
	public Word[] getWordsData(){

		Path path = Paths.get("Words.txt");

		try {

			byte[] text = Files.readAllBytes(path);
			String wordsData = new String(text); 

			String[] wordsDataArray = wordsData.split(";"); 

			Word[] words = new Word[wordsDataArray.length]; 

			String[] allData = new String[wordsDataArray.length];

			for(int i = 0; i < wordsDataArray.length; i++){

				Word word = new Word();

				allData = wordsDataArray[i].split(",");

				word.setContent(allData[0]);
				word.setX(Integer.parseInt(allData[1]));
				word.setY(Integer.parseInt(allData[2]));
				word.setDirection(allData[3]);

				words[i] = word;

			}

			return words;

		} catch(Exception error) {

			System.out.print("Error on the file reading!!!");

			return null;

		}

	}

}