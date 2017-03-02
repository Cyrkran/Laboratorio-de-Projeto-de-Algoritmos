import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Fatorial{
	
	static long maxRange = 622720800;
	static long minRange = 10000;
	
	public long fatorial(int fat){
		
		long retorno = 1;
		if(fat <= 2) return retorno;

		for(int i = 2; i <= fat; i++){
			if(retorno > maxRange) return retorno;
			retorno *= i;
		}
		return retorno;
	}
	
	
	public static void main(String[] args){
		Fatorial fat = new Fatorial();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String linha = reader.readLine();
			while(!linha.isEmpty()){
				long result = fat.fatorial(Integer.parseInt(linha));
				if(result > maxRange){
					System.out.println("Overflow");
				}else if(result < minRange){
					System.out.println("Underflow");
				}else{
					System.out.println(result);
				}
				linha = reader.readLine();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
