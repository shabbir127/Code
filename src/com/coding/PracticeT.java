package com.coding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PracticeT  extends Thread{
	
	public void run()
	{
		System.out.println("Task running");
	}
	int count=0;
	 void incremnet() {
		System.out.println(count++);
	}
	
	public static void main(String[] args) {
		
		PracticeT P1=new PracticeT();
		Thread R1=new Thread(new PracticeR());
		R1.start();//-----> new thread is executing
		R1.run();//-----> main thread is executing
		P1.run();//-----> main thread is executing
		P1.start();//-----> new thread is executing
		
		
	  Thread t1=new Thread(()->P1.incremnet());
	  Thread t2=new Thread(()->P1.incremnet());	
	  Thread t3=new Thread(()->P1.incremnet());
	  Thread t4=new Thread(()->P1.incremnet());
	  Thread t5=new Thread(()->P1.incremnet());
	  Thread t6=new Thread(()->P1.incremnet());
	  Thread t7=new Thread(()->P1.incremnet());
	  Thread t8=new Thread(()->P1.incremnet());
	  Thread t9=new Thread(()->P1.incremnet());
	  Thread t10=new Thread(()->P1.incremnet());
	  Thread t11=new Thread(()->P1.incremnet());
	  t1.start();
	  t2.start();
	  t3.start();
	  t4.start();
	  t5.start();
	  t6.start();
	  t7.start();
	  t8.start();
	  t9.start();
	  t10.start();
	  t11.start();
	  
	  ExecutorService executor = Executors.newFixedThreadPool(3);

	  executor.submit(() -> {
	      System.out.println("Task running: "
	              + Thread.currentThread().getName());
	  });

	  executor.shutdown();	
	}

}

class PracticeR implements Runnable{

	@Override
	public void run() {
		System.out.println("Running the implemneted Runnable interface....");
		
	}
	
	
	
}
