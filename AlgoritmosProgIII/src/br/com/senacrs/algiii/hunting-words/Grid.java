
import java.util.Random;
import java.util.ArrayList;

public class Grid {
	
	Word[] words;

	public Grid(Word[] words){

		this.words = words;

	}

	String grid[][] = new String[25][25];

	ArrayList<Position> unavailablePositions = new ArrayList<Position>();

	DataReader dr = new DataReader();
	Random random = new Random();
	
	final String letters = "ABCDEFGHIJKLMNOPQRSTUVWYXZ";
	final int N = letters.length();
	
	String letter;

	public void addWords() {

		for(int i = 0; i < words.length; i++){

			char[] letters;
			letters = words[i].getContent().toCharArray();

			int x = words[i].getX();
			int y = words[i].getY();

			int indexLetter = 0;

			if(words[i].getDirection().equals("vertical")){

				for(int l = 0; l < words[i].getContent().length(); l++){

					grid[x][y] = Character.toString(letters[indexLetter]);

					Position pos = new Position();

					pos.setX(x);
					pos.setY(y);

					unavailablePositions.add(pos);

					indexLetter++;
					x++;

				}

			} else if(words[i].getDirection().equals("horizontal")){

				for(int l = 0; l < words[i].getContent().length(); l++){

					grid[x][y] = Character.toString(letters[indexLetter]);

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

		for(int line = 0; line < 25; line++) {
			
			for(int column = 0; column < 25; column++) {
	
				StringBuilder sb = new StringBuilder(1);
				
				sb.append(letters.charAt(random.nextInt(N)));
								
				letter = sb.toString();

				for(int i = 0; i < unavailablePositions.size(); i++){					

					if(line != unavailablePositions.get(i).getX() && column != unavailablePositions.get(i).getY()){

						grid[line][column] = letter;
						
					}

				}

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

}