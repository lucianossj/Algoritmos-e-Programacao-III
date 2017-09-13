package aula05;

public class Fibonacci {

	public static double fibonacci(int n){
		
		if(n == 0){
			
			return 0;
			
		} else if(n == 1){
			
			return 1;
			
		} else {
			
			return fibonacci(n-1)+fibonacci(n-2);
			
		}
		
	}
	
	public static double fibo(int n){
		
		double f1 = 1, f2 = 0;
		
		for(int i=0; i < n; i++){
			
			double x = f1 + f2;
			
			f1 = f2;
			f2 = x;
			
		}
		
		return f2;
		
	}
	
}
