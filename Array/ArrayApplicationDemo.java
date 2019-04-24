import java.util.Arrays;
public class ArrayApplicationDemo {
	
	public static void main(String[] args) {
		int[] arr = {2,8,9,2,7,3,0,8,3,1,4};
		
		//数组的反转
		for (int i = 0, j = arr.length -1; i < j; i++,j--) {
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		
		String str0 = Arrays.toString(arr);
		System.out.println(str0);
		
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
		
		//二分查找
		int[] arr2 = {14,26,37,58,64,68,82,90};
		int num = 58;
		
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		
		while(arr2[mid] != num) {
			
			if(num > arr2[mid]) 
				min = mid + 1;
			else 
				max = mid - 1;
			
			if (min > max) {
				mid = -1;
				break;
			}
			
			mid = (min + max) / 2;
			
		}
		
		System.out.println(mid);
	}
}