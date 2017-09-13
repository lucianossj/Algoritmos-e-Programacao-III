package aula05;

import lj.DataReader;

public class Main {
	
	public static void main(String args[]){
		
		DataReader dr = new DataReader();
		
		/*boolean control = true;
		
		while(control == true){
			
			int n = dr.getInt("\nDigite um número: ");
			
			double result = Recursive.fatorial(n);
			
			dr.print("O fatorial de " + n + " é: " + result + "!!!");
		
			int op = dr.getInt("\n\nDeseja digitar outro número? Sim-1 Não-2 : ");
			 
			if(op == 2){
				
				control = false;
				
			}
			
		}*/
		
		/*boolean control = true;
		
		while(control == true){
			
			int n = dr.getInt("\nDigite um número: ");
			
			double result = Fibonacci.fibonacci(n);
			double resultFibo = Fibonacci.fibo(n);
			
			dr.print("O fibonacci de " + n + " é: " + result + "!!!");
			dr.print("\nO fibo de " + n + " é: " + resultFibo + "!!!");
		
			int op = dr.getInt("\n\nDeseja digitar outro número? Sim-1 Não-2 : ");
			 
			if(op == 2){
				
				control = false;
				
			}
			
		}*/
		
		boolean control = true;
		
		while(control == true){
			
			int n = dr.getInt("\nDigite um número: ");
			
			double result = Fibonacci.fibonacci(n);
			//double resultFibo = Fibonacci.fibo(n);
			
			dr.print("O fibonacci de " + n + " é: " + result + "!!!");
			//dr.print("\nO fibo de " + n + " é: " + resultFibo + "!!!");
		
			int op = dr.getInt("\n\nDeseja digitar outro número? Sim-1 Não-2 : ");
			 
			if(op == 2){
				
				control = false;
				
			}
			
		}
		
		System.exit(0);
		
	}
	
	public static void fatorial(){}
	
}
