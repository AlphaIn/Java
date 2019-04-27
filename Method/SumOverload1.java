public class SumOverload1 {
	
	public static void main(String[] args){
		System.out.println(add(3, 4));
	}
	
	public static double add(int i, double j){
		return i + j;
	}
	
	public static double add(double i, double j){
		return i + j;
	}
}