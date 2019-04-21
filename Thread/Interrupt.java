package java.Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Interrupt {

	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		new Thread() {
			@Override
			public void run() {
				System.out.println("按回车");
				new Scanner(System.in).nextLine();
				//在当前线程中，打断t1线程的暂停状态
				//被打断的线程，会出现InterruptedException
				t1.interrupt();
			}
		}.start();

	}
	static class T1 extends Thread {
		public void run() {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			while(true) {
				String s = sdf.format(new Date());
				System.out.println(s);
				try {
					Thread.sleep(1000);//暂停一会
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("停止");
					break;
				}
			}
		}
	}

}
