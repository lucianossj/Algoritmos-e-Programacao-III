package br.com.senacrs.algiii.huntingwords.model;

import java.util.Random;

import br.com.senacrs.lj.DataReader;

public class Grid {

	String grid[][] = new String[25][25];
	
	DataReader dr = new DataReader();
	Random random = new Random();
	
	final String letters = "ABCDEFGHIJKLMNOPQRSTUVWYXZ";
	final int n = letters.length();
	
	String letter;
	
	public void createGrid() {
		
		for(int line = 0; line < 25; line++) {
			
			for(int column = 0; column < 25; column++) {
	
				StringBuilder sb = new StringBuilder(1);
				
				sb.append(letters.charAt(random.nextInt(n)));
								
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
		
		Words words = new Words();
		
		String game[] = new String[5];
		game = words.words1();
		
		//ADICIONAR PALAVRAS AO GRID
		
		/*
		 * Definir se a palavra ficará na vertical ou horizontal
		 * Definir local da palavra
		 * Calcular tamanho da palavra com o local definido (largura ou altura)
		 * acrescentar palavra*/
		
		for(int i = 0; i < game.length; i++) {
			
			//Definindo formato da palavra no grid.
			
			String options[] = new String[2];
			
			options[0] = "Vertical";
			options[1] = "Horizontal";
			
			int n;
			
			n = options.length;
			
			String op = options[random.nextInt(n)];
			
			if(op.equals("Vertical")) {
				
				n = 25;
				
				int line	= random.nextInt(n);
				int column 	= random.nextInt(n);
				
				int numChars = game[i].length();
				
				boolean localIsOk = false;
				
				while(localIsOk == false) {
					
					if(line < numChars) {
						
						random.nextInt(n);
						
					} else {
						
						localIsOk = true;
						
					}
					
				}
				
				int cont = 0;
				
				for(int x = line; x < game[i].length(); x++) {
					
					char l = game[i].charAt(cont);
					String lString = Character.toString(l);
					
					grid[x][column] = lString;
					
					cont++;
					
				}
				
			} else {
				
				dr.print("Teste");
				
			}
			
		}
		
	}
	
}
