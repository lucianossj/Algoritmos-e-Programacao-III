
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {

        FileReader fr = new FileReader();

        ArrayList<Word> words = new ArrayList<Word>();

        words = fr.getWordsData();

        Grid grid = new Grid(words);
        
        grid.showGrid();
        
    }

}
