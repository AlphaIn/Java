package Java.Reflect;

public class ClassReflectObj {
	public static void main (String[] args) throws Exception {
		System.out.println("输入类名：");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);
		
		//通过“类对象”的反射操作来新建实例
		Object o1 = null;
		Object o2 = null;
		
		//新建实例时，执行无参构造
		try {
			o1 = c.newInstance();
			System.out.println(o1);
		} catch (Exception e ) {
			System.out.println("没有无参构造方法");
		}
		
		//新建实例时，执行有参(int)构造
		
		try {
			Constructor<?> t = c.getConstructor(int.class);
			o2 = t.newInstance(10);
			System.out.println(o2);
		} catch (Exception e) {
			System.out.println("没有int参数的构造方法");
		}
	}
}
