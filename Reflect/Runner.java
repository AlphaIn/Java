package java.Reflect;

import java.util.ArrayList;

public class Runner {
	static ArrayList<String> list = new ArrayList<>();
	//类加载过程执行静态块，类加载完执行main
	static {
		try {
			//BufferedReader--FileReader
			BufferedReader in = new BufferedReader(new FileReader("d:/config.txt"));
			String line;
			while((line = in.readLine()) != null) {
				line = line.replaceAll("\\s+", "");
				if(line.length() == 0) {
					continue;
				}
				list.add(line);
			}
			in.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public static void run() throws Exception {
		for (String s : list) {
			// java.Rflect.A;a
			// [java.Reflect.A,a]
			//       0         1
		    String[] a = s.split(";");
            Class<?> c = Class.forName(a[0]);
            Object obj = c.newInstance();
			Method t = c.getMethod(a[1]);
			t.invoke(obj);
		}
	}
	public static void main(String[] args) throws Exception {
		System.out.println(list);
		Runner.run();
	}
}
