public class MethodDemo {
	
	public static void main(String[] args) {
		
		int sum = sum(3,12);
		System.out.println(sum);
		System.out.println(oddJudge(20));
		printStar(10);
	}
	
	//n~m求和
	public static int sum(int n, int m){
		int ans = 0;
		if(n > m)
			return -1;
		for(int i = n; i <= m; i++){
			ans += i;
		}
		return ans;
	}
	
	//奇偶判断
	public static boolean oddJudge(int num){
		boolean b = num % 2 == 1;
		return b;
	}
	
	//打印输出
	public static void printStar(int n){
		for(int i = 0; i < n; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}