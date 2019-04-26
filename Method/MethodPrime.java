public class MethodPrime {
	
	public static void main(String[] args){
		
		System.out.println(isPrime(79));
	} 
	
	public static boolean isPrime(int num){
		
		if(num < 2)
			return false;
		
		if(num == 2)
			return true;
		
		if(num % 2 == 0)
			return false;
		
		for(int i = 3; i<= num / 2; i++){
			if(num % i == 0){
				return false;
			}
		}
		
		return true;
	}
}