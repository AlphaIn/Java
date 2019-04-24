import java.util.Arrays;
public class ArrayApplicationDemo {
	
	public static void main(String[] args) {
		int[] arr = {2,8,9,2,7,3,0,8,3,1,4};
		
		//获取数组的长度
		int len = arr.length;
		System.out.println(len);
		
		for(int i = 0; i<len; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		//冒泡排序
		for (int i = 1; i<arr.length; i++) {
			for (int j = 1; j <= arr.length -i; j++ ) {
				
				if(arr[j - 1] > arr[j]) {
					int temp = arr[j -1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		String str1 = Arrays.toString(arr);
		System.out.println(str1);
		
		int[] arr1 = {2,8,9,2,7,3,0,8,3,1,4};
		
		//选择排序
		for (int i = 1; i < arr1.length; i++) {
			for(int j = i; j < arr1.length; j++) {
				
				if(arr1[i - 1] > arr1[j]) {
					int temp = arr1[i -1];
					arr1[i - 1] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		String str2 = Arrays.toString(arr1);
		System.out.println(str2);
	}
}