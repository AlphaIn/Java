public class ParaTran {
	public static void main(String[] args){
		int i = 5;
		changeVla(i);
		System.out.println(i);
		
		int[] arr = {2,5,1,8,4};
		changeVla(arr[2]);
		System.out.println(arr[2]);
		
		changeVla(arr);
		System.out.println(arr[2]);
		
		changeRef(arr);
		System.out.println(arr.length);
	}
	
	public static void changeRef(int[] arr){
		int len = arr.length;
		int[] arr2 = new int[len * 2];
		System.arraycopy(arr, 0, arr2, 0, len);
		arr = arr2;
	}
	
	public static void changeVla(int[] arr){
		arr[2]++;
	}
	public static void changeVla(int i){
		i++;
	}
}