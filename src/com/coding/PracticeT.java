package com.coding;

public class PracticeT  extends Thread{
	
	public void run()
	{
		System.out.println("Task running");
	}
	
	public static void main(String[] args) {
		
		PracticeT P1=new PracticeT();
		Thread R1=new Thread();
		R1.start();//-----> new thread is executing
		R1.run();//-----> main thread is executing
		P1.run();//-----> main thread is executing
		P1.start();//-----> new thread is executing
	}

}

class PracticeR implements Runnable{

	@Override
	public void run() {
		System.out.println("Running the implemneted Runnable interface....");
		
	}
	
	
	
}
