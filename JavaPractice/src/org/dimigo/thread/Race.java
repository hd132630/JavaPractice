package org.dimigo.thread;

public class Race {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main thread start");
		
		Thread r1 = new Runner("홍길동");
		Thread r2 = new Runner("홍길순");
		
		r1.setPriority(Thread.MAX_PRIORITY);
		r2.setPriority(Thread.MIN_PRIORITY);		
		
			r1.start();
			r2.start();
		
			System.out.println("main thread end");
	}

}
