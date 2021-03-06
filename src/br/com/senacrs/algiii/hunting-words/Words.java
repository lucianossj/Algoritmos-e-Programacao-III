
import java.util.ArrayList;

public class Words {

    ArrayList<Word> arrayWordsData = new ArrayList<Word>();

    public ArrayList<Word> loadWords() {

        FileReader fr = new FileReader();

        arrayWordsData = fr.getWordsData();

        ArrayList<Word> words = new ArrayList<Word>();

        String[] allData = new String[arrayWordsData.size()];
        
        for (int i = 0; i < arrayWordsData.size(); i++) {

            Word word = new Word();

            allData = arrayWordsData.get(i).getContent().split(",");
            
            word.setContent(allData[0]);
            word.setX(Integer.parseInt(allData[1]));
            word.setY(Integer.parseInt(allData[2]));
            word.setDirection(allData[3]);

            words.add(word);

        }

        return words;

    }

}
