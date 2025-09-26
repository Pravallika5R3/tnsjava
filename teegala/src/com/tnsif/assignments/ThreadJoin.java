package com.tnsif.assignments;



public class ThreadJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadJoinExample t1=new ThreadJoinExample();
		ThreadJoinExample t2=new ThreadJoinExample();
		t1.start();
		try {
			
			System.out.println("urrent thread name" +Thread.currentThread().getName());
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
			
		}
		t2.start();
try {
			
			System.out.println("current hread name" +Thread.currentThread().getName());
			t2.join();
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
 class ThreadJoinExample extends Thread{
	public void run() {
		for(int i=0;i<2;i++) {
			try {
				//Thread.sleep(2000);
				System.out.println("current thread name" +Thread.currentThread().getName());
				
			}catch(Exception e) {
				System.out.println(e);
				
			}
		}
	}
}