import java.util.Scanner;

public class ArrayTria {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
	int[][] arr = new int[n][];
	
	for(int i = 0; i < n; i++){
		arr[i] = new int[i + 1];
		
		for(int j = 0; j <= i; j++){
			
			if(j == 0 || j == i){
				arr[i][j] = 1; 
			} else {
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1]; 
			}
			System.out.print(arr[i][j] + "\t");
		}
		System.out.println();
	}
  }
}