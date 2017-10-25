public class Words {
	
	String[] arrayWordsData;
	
	public Word[] loadWords(){

		FileReader fr = new FileReader();

		arrayWordsData = fr.getWordsData();

		Word[] words = null;

		int cont = 0;

		for(int i = 0; i < arrayWordsData.length; i++){

			Word word = new Word();

			String[] allData = arrayWordsData[i].split(",");

			word.setContent(allData[0]);
			word.setX(Integer.parseInt(allData[1]));
			word.setY(Integer.parseInt(allData[2]));
			word.setDirection(allData[3]);

			words[cont] = word;

			cont++;

		}

		return words;

	}

}