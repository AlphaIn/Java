package Java.Producer_Consumer;

import java.util.LinkedList;

public class Consumer extends Thread{
	private LinkedList<Character> list;

	public Consumer(LinkedList<Character> list) {
		this.list = list;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (list) {
				if(list.size() == 0) {
					//消费者线程在集合对象上等待
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
					}
				}
			Character c = list.removeFirst();
			System.out.println("移除>>>>>>>>>>>>>"+c);
			}
		}
	}
	
}
