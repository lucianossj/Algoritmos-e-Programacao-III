public class Main {
		
	public static void main(String args[]){

		FileReader fr = new FileReader();

		Word[] words = null;

		words = fr.getWordsData();

		Grid grid = new Grid(words);

		grid.addWords();
		grid.createGrid();
		grid.showGrid();

	}

}