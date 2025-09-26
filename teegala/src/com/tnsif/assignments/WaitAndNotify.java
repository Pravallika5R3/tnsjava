package com.tnsif.assignments;

public class WaitAndNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m1=new Message();
		Thread t1= new Thread(()->{
		for(int i=0;i<3;i++){
			m1.printmessage("Hello from thread 1");
		}

	});
		Thread t2= new Thread(()->{
			for(int i=0;i<3;i++){
				m1.printmessage("Hello from thread 2");
			}

		});
		t1.start();
		t2.start();
	}


}
class Message{
	public synchronized void printmessage(String msg) {
		try {
			
			System.out.println(msg);
			notify();
			wait();
			
			}catch(Exception e){
				System.out.println(e);

			}
	}
	
}
