package com.coding;

public class PracticeT  extends Thread{
	
	public void run()
	{
		System.out.println("Task running");
	}
	
	public static void main(String[] args) {
		
		PracticeT P1=new PracticeT();
		
		P1.run();
		P1.start();
	}

}
