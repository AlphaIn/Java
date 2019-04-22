package java.Producer_Consumer;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<Character> list = new LinkedList();
		Producer p = new Producer(list);
		Consumer c = new Consumer(list);
		p.start();
		c.start();
	}

}
