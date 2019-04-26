import java.util.Scanner;

public class Even2Odd {

	public static void main(String[] args){
	
	    Scanner s = new Scanner(System.in);
	
	    int n = s.nextInt();
	
	    while(n < 6 || n % 2 == 1){
		    n = s.nextInt();
	    }
	
	    for(int i = 3; i <= n/2; i+=2){
			if(isPrime(i)&&isPrime(n - i)){
				System.out.println(n+ "=" + i + "+" + (n-i));
			}
	    }
	
    }
	public static boolean isPrime(int num){
		
		if(num < 2)
			return false;
		if(num == 2)
			return true;
		for(int i = 3; i <= num/2; i += 2){
			if(num % i == 0)
				return false;
		}
		return true;
	}
}