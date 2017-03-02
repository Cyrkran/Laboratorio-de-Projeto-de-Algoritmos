import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {
	
	public long fibonacci(int fib){
		if(fib < 2) return fib;
		else return(fibonacci(fib -1) + fibonacci(fib - 2));
	}
	
	
	public static void main(String[] args){
		Fibonacci fib = new Fibonacci();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			String[] linha = reader.readLine().split(" ");
			while(linha.length != 0){
				int n = Integer.parseInt(linha[0]);
				int m = Integer.parseInt(linha[1]);
				
				double result = (fib.fibonacci(n) % Math.pow(2, m));
				
				System.out.println(result);
				linha = reader.readLine().split(" ");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
