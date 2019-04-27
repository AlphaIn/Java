public class SumOverload {
	
	public static void main(String[] args){
		System.out.println(add(3, 6.1));
	}
	
	public static int add(int i, int j){
		return i + j;
	}
	
	public static double add(double i, double j){
		return i + j;
	}
	
	public static double add(int i, double j){
		return i + j;
	}
	
	public static double add(double i, int j){
		return i + j;
	}
}