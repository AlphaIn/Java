import java.util.Arrays;
public class Array2D {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][2];
		System.out.println(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int[][] arr1 = new int[5][];
		System.out.println(arr1[0]);
		arr1[0] = new int[3];
		arr1[0][0] = 10;
		
		int[][] arr2 = {{2,6}, {4,1,4,7,9}, {5}, {2,0,9}};
		System.out.println(arr2[1][3]);
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		for(int[] as : arr2) {
			System.out.println(Arrays.toString(as));
		}
		
		for(int[] as : arr2) {
			for(int i = 0; i < as.length; i++) {
				System.out.println(as[i]);
			}
		}
		
		for(int[] as : arr2) {
			for(int j : as) {
				System.out.println(j);
			}
		}
	}
}