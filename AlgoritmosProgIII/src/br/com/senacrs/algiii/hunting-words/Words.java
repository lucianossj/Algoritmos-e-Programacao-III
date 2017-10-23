public class Words {
	
	String[] arrayWordsData;

	public void loadWords(){

		FileReader fr = new FileReader();

		arrayWordsData = fr.getWordsData();

	}

	public Word setWords(){

		Word[] words = new Word();

		int cont = 0;

		for(int i = 0; i < arrayWordsData.lentgh; i++){

			Word word = new Word();

			String[] allData = arrayWordsData[i].split(",");

			word.setContent(allData[0]);
			word.setX(allData[1]);
			word.setY(allData[2]);
			word.setDirection(allData[3]);

			words[cont] = word;

			cont++

		}

		return words;

	}

}