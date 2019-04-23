package Java.Thread;

public class JoinThread {

	public static void main(String[] args) throws Exception {
		/*
		 * 求1000万内的质数数量 
		 */
		System.out.println("\n--单线程--------------");
		f1();
		System.out.println("\n--5个线程--------------");
		f2();
	}
	
	private static void f1() throws Exception {
		long t = System.currentTimeMillis();
		T1 t1 = new T1(1, 10000000);
		t1.start();
		
		//main线程暂停，等待t1结束
		t1.join();
		int r = t1.count;
		
		t = System.currentTimeMillis() - t;
		System.out.println("时间："+t);
		System.out.println("质数数量："+r);
	}
	private static void f2() throws InterruptedException {
		long t = System.currentTimeMillis();
		
		T1[] a = new T1[5];
		for (int i = 0; i< a.length; i++) {
			a[i] = new T1(2000000*i, 2000000*(i+1));
			a[i].start();
		}
		
		for (int i = 0; i<a.length; i++) {
			a[i].join();
		}
		
		int sum = 0;
		for (int i = 0; i<a.length; i++) {
			sum += a[i].count;
		}
		
		t = System.currentTimeMillis() - t;
		System.out.println("时间："+t);
		System.out.println("质数数量："+sum);
	}
	static class T1 extends Thread {
		int from;
		int to;
		int count;
		//alt+shift+s,
		//generate constructor using fields..
		public T1(int from, int to) {
			if (from <3) {
				from = 3;
				count = 1;
			}
			this.from = from;
			this.to = to;
		}
		@Override
		public void run() {
			for (int i = from; i <= to; i++) {
				if (isPrime(i)) {
					count++;
				}
			}
		}
		private boolean isPrime(int i) {
			double max = 1 + Math.sqrt(i);
			for (int j = 2; j < max; j++) {
				if(i%j == 0) {
					return false;
				}
			}
			return true;
		}
		
		
	}

}
