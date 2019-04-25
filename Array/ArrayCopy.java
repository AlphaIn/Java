import java.util.Arrays;
public class ArrayCopy {
	
	public static void main(String[] args) {
		
		int[] arr1 = {5,6,9,11,6,3,8,4,18};
		int[] arr2 = new int[5];
		
		//复制元素
		System.arraycopy(arr1, 3, arr2, 1, 3);
		for(int i : arr2) {
			System.out.println(i);
		}
		System.out.println(arr1);
		arr1 = Arrays.copyOf(arr1, 15);
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1);
		
		System.out.println(arr1);
		arr1 = Arrays.copyOf(arr1, 5);
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1);
	}
}