
import java.util.ArrayList;

public class Words {

    ArrayList<Word> arrayWordsData = new ArrayList();

    public ArrayList<Word> loadWords() {

        FileReader fr = new FileReader();

        arrayWordsData = fr.getWordsData();

        //Word[] words = new Word[arrayWordsData.length];
        ArrayList<Word> words = new ArrayList();

        String[] allData = new String[arrayWordsData.size()];
        //ArrayList<String> allData = new ArrayList();
        
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
