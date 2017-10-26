
import java.util.Random;

public class Grid {
	
	String grid[][] = new String[25][25];
	
	DataReader dr = new DataReader();
	Random random = new Random();
	
	final String letters = "ABCDEFGHIJKLMNOPQRSTUVWYXZ";
	final int N = letters.length();
	
	String letter;
	
	public void createGrid() {
		
		for(int line = 0; line < 25; line++) {
			
			for(int column = 0; column < 25; column++) {
	
				StringBuilder sb = new StringBuilder(1);
				
				sb.append(letters.charAt(random.nextInt(N)));
								
				letter = sb.toString();
		
				grid[line][column] = letter;
				
			}
			
		}
		
	}
	
	public void showGrid() {
		
		for(int line = 0; line < 25; line++) {
			
			for(int column = 0; column < 25; column++) {
				
				dr.print(" " + grid[line][column] + " ");
				
			}
			
			dr.print("\n");
			
		}
		
	}
	
	public void addWords() {
		
		Words loadWords = new Words();

		Word[] words = loadWords.loadWords();
		
		for(int i = 0; i < words.length; i++){

			int contLetters = words[i].getContent().length();
			
			char[] letters = null;
			String word = words[i].getContent();
			letters = word.toCharArray();

			int x = words[i].getX();
			int y = words[i].getY();

			int j;

			if(words[i].getDirection().equals("vertical")){

				while(contLetters < words[i].getContent().length()){

					j = 0;

					grid[x][y] = Character.toString(letters[j]);

					x++;

				}

			} else if(words[i].getDirection().equals("horizontal")){

				while(contLetters < words[i].getContent().length()){

					j = 0;

					grid[x][y] = Character.toString(letters[j]);

					y++;

				}

			}

		}
		
	}

}