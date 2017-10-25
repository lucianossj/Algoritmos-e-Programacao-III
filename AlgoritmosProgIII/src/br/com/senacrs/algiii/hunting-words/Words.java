public class Words {
	
	String[] arrayWordsData;
	
	public Word[] loadWords(){

		FileReader fr = new FileReader();

		arrayWordsData = fr.getWordsData();

		Word[] words = new Word[arrayWordsData.length];

		String[] allData = new String[arrayWordsData.length];

		for(int i = 0; i < arrayWordsData.length; i++){

			Word word = new Word();

			allData = arrayWordsData[i].split(",");

			word.setContent(allData[0]);
			word.setX(Integer.parseInt(allData[1]));
			word.setY(Integer.parseInt(allData[2]));
			word.setDirection(allData[3]);

			words[i] = word;

		}

		return words;

	}

}