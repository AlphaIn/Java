import Java.Reflect;

public class ClassReflect {
	
	public static void main(String[] args) {
		System.out.println("输入完整类名：");
		String s = new Scanner(System.in).nextLine();
		/*
		 * "java.lang.String"
		 * "java.util.ArrayList"
		 * "java.util.Date"
		 */
		 Class<?> c = Class.forName(s);
		 //获得类名、包名
		 System.out.println(c.getName());
		 System.out.println(c.getPackage().getName());
		 System.out.println(c.getSimpleName());
		 
		 //获得变量
		 Field[] fields = c.getDeclaredFields();
		 for(Field f : fields) {
			 System.out.println(f.getName());
		 }
		 System.out.println("-------------");
		 
		 //获得构造方法
		 Constructor<?> constructors = c.getConstructors();
		 for (Constructor<?> t : constructors) {
			 System.out.println(c.getSimpleName()+"("+t.getParameterTypes()+")");
		 }
		 System.out.println("-------------");
		 
		 //获得方法
		 Method[] methods = c.getDeclaredMethods();
		 for (Method t : methods) {
			 System.out.println(t.getName()+"("+t.getParameterTypes()+")");
		 }
	}
}
