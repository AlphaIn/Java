package java.Producer_Consumer;

import java.util.LinkedList;
import java.util.Random;

public class Producer extends Thread{
	private LinkedList<Character> list;

	public Producer(LinkedList<Character> list) {
		this.list = list;
	}

	@Override
	public void run() {
		while(true) {
			if(Math.random() < 0.5) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			char c = (char) ('a' + new Random().nextInt(26));
			synchronized (list) {
			list.add(c);
			System.out.println("添加<<"+c);
			list.notifyAll();
			}
		}
	}
	
	
	
}
