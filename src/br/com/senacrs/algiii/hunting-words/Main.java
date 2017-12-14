
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {

        FileReader fr = new FileReader();

        ArrayList<Word> words = new ArrayList();

        words = fr.getWordsData();

        Grid grid = new Grid(words);

        //grid.addWords();
        //grid.createGrid();
        
        grid.showGrid();
        
    }

}
