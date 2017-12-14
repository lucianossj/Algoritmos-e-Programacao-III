
import java.util.Random;
import java.util.ArrayList;

public class Grid {

    ArrayList<Word> words = new ArrayList();

    public Grid(ArrayList<Word> words) {

        this.words = words;

    }

    String grid[][] = new String[26][26];

    ArrayList<Position> unavailablePositions = new ArrayList<>();

    DataReader dr = new DataReader();
    Random random = new Random();

    final String letters = "ABCDEFGHIJKLMNOPQRSTUVWYXZ";
    final int N = letters.length();

    public void addWords() {

        for (int i = 0; i < words.size(); i++) {

            char[] lettersChar;

            lettersChar = words.get(i).getContent().toCharArray();
            int x = words.get(i).getX();
            int y = words.get(i).getY();

            int indexLetter = 0;

            if (words.get(i).getDirection().equals("vertical")) {
                
                for (int l = 0; l < words.get(i).getContent().length(); l++) {
                   
                    grid[x][y] = Character.toString(lettersChar[indexLetter]);

                    Position pos = new Position();

                    pos.setX(x);
                    pos.setY(y);

                    unavailablePositions.add(pos);

                    indexLetter++;
                    x++;

                }

            } else if (words.get(i).getDirection().equals("horizontal")) {
                
                for (int l = 0; l < words.get(i).getContent().length(); l++) {
                    
                    grid[x][y] = Character.toString(lettersChar[indexLetter]);

                    Position pos = new Position();

                    pos.setX(x);
                    pos.setY(y);

                    unavailablePositions.add(pos);

                    indexLetter++;
                    y++;
                    
                }
            }
        }

    }

    public void createGrid() {

        for (int line = 0; line < 25; line++) {

            for (int column = 0; column < 25; column++) {

                StringBuilder sb = new StringBuilder(1);

                sb.append(letters.charAt(random.nextInt(N)));

                String letter = sb.toString();

                for (int i = 0; i < unavailablePositions.size(); i++) {

                    if (line != unavailablePositions.get(i).getX() && column != unavailablePositions.get(i).getY()) {

                        grid[line][column] = letter;

                    }

                }

            }

        }

    }

    public void showGrid() {

        addWords();
        createGrid();
        addWords();
        
        for (int line = 0; line < 25; line++) {

            for (int column = 0; column < 25; column++) {

                dr.print(" " + grid[line][column] + " ");

            }

            dr.print("\n");

        }

    }

}
