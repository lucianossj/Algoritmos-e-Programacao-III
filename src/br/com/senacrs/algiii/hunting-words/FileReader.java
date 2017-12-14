
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

public class FileReader {

    public ArrayList<Word> getWordsData() {

        Path path = Paths.get(System.getProperty("user.dir")+"\\src\\br\\com\\senacrs\\algiii\\hunting-words\\Words.txt");

        try {

            byte[] text = Files.readAllBytes(path);
            
            String wordsData = new String(text);
            
            String[] wordsDataArray = wordsData.split(";");

            ArrayList<Word> words = new ArrayList();
            
            String[] allData;

            for (int i = 0; i < wordsDataArray.length; i++) {

                Word word = new Word();

                allData = wordsDataArray[i].split(",");
                
                word.setContent(allData[0]);
                word.setX(Integer.parseInt(allData[1]));
                word.setY(Integer.parseInt(allData[2]));
                word.setDirection(allData[3]);

                words.add(word);

            }
            
            return words;

        } catch (IOException | NumberFormatException error) {

            System.out.print(error);

            return null;

        }

    }

}
