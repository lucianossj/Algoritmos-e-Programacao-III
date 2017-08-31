package br.com.senacrs.algiii.aula4.forcabruta;

import java.util.Random;
import br.com.senacrs.lj.DataReader;

public class TestArray {

	static int testArray[] = new int[3000];
	static DataReader dr = new DataReader();	
	
	public static void main(String args[]){
		
		fillArray();
		searchElement();
		showArray();
		
	}
	
	public static void fillArray(){
		
		Random random = new Random();
		
		for(int i = 0; i < 3000; i++){
			
			testArray[i] = random.nextInt();
			
		}
		
	}
	
	public static void showArray(){
		
		for(int i = 0; i < 3000; i++){
			
			dr.print(i + " - " + testArray[i]+"\n");
			
		}
		
	}
	
	public static void searchElement(){
		
				
		
	}
	
}
