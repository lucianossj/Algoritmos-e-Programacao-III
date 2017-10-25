public class Main {
	
	public static void main(String args[]){

		Words loadWords = new Words();

		Word[] words = loadWords.loadWords();

		System.out.println(words[0]);

	}

}