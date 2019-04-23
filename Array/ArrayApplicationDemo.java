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
	}
}