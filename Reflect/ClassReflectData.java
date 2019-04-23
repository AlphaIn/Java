package Java.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassReflectData {
	public static void main (String[] args) throws Exception {
		Student s = new Student();
		//Class.forName("类型")
		//类名.class
		//实例.getClass()
		Class<Student> c = Student.class;
		
		//age变量
		Field field = c.getDeclaredField("age");
		field.setAccessible(true);
		field.set(s,19);//为指定的实例，设置变量的值
		System.out.println(s.getAge());
		int age = (int)field.get(s);//从指定的实例，访问变量的值
		System.out.println(age);
		
		// setGender(),getGender()
		Method setg = c.getMethod("setGender",String.class);
		Method getg = c.getMethod("getGender");
		
		setg.invoke(s, "男");
		String g = (String)getg.invoke(s);
		System.out.println(g);
	}
}
