import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Friends {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static int[] citizens = null;
	static int[] aux = null;
	
	static int find(int x){
		
		int num = 0;
	    for(int i = 0; i < citizens.length; i++){
	    	num = citizens[i] == x ? num = num + 1 : num;
	    }
	    
	    return num;
	}
	
	public static void main(String[] args){
		Friends friends = new Friends();
		
		try{
			int N = Integer.parseInt(friends.reader.readLine());
			
			while(N > 0){
				
				String[] input = (friends.reader.readLine()).split(" ");
				int n = Integer.parseInt(input[0]), m = Integer.parseInt(input[1]);
				citizens = new int[n+1];
				
				for(int i = 0; i < m; i++){
					String[] input2 = (friends.reader.readLine()).split(" ");
					int A = Integer.parseInt(input2[0]), B = Integer.parseInt(input2[1]);
					
					if(citizens[B] != 0){
						citizens[A] = citizens[B]; 
					}else if(citizens[A] != 0){
						citizens[B] = citizens[A];
					}else{
						citizens[A] = A;
						citizens[B] = A;
					}
				}
				
				int max = 0;
				for(int i = 1; i < citizens.length; i++){
					int elemento = find(citizens[i]);
					max = elemento > max ? elemento : max; 
				}
				System.out.println(max);
				N--;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
