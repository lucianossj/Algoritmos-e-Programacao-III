package br.com.senacrs.lj;

import java.util.Scanner;

public class DataReader {

	Scanner scan = new Scanner(System.in);
	
	public void print(String message) {
		
		System.out.print(message);
		
	}
	
	public String getString(String message) {
		
		print(message);
		
		String data = scan.next();
		
		return data;
		
	}
	
	public int getInt(String message) {
		
		print(message);
		
		int data = scan.nextInt();
		
		return data;
	}
	
}
