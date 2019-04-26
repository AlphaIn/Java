public class MethodFactor {
	
	public static void main(String[] args){
		
		for(int a = 1; a <= 5000; a++){
			int b = sumAllFac(a);
			int n = sumAllFac(b);
			if(b < a && n == a){
				System.out.println(a + "," + b);
			}
		}
	}
	
	public static int sumAllFac(int n){
		
		int sum = 0;
		for(int i= 1; i <= n / 2; i++){
			if(n % i == 0){
				sum += i;
			}
		}
		return sum;
	}
}