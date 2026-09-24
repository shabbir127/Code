package com.coding;



public class FunctioanlInterfaceProblem {

	public static void main(String[] args) {
		
		example fIP= () -> {
			System.out.println("This is Testing");
		};
		fIP.Func();
		
		fIP.DisplayMode();
		example.show();
		
		example1 fIP1= (a,b) -> {
			System.out.println(a+b);
		};
		fIP1.Func(12,12354);
		
		fIP1.DisplayMode("shabbir");
		example.show();
	}
}

@FunctionalInterface
interface example{
	
	void Func();
	
	default void DisplayMode()
	{
		System.out.println("This is Default method");
	}
	
	static void show()
	{
		System.out.println("This is static method");
	}
}

@FunctionalInterface
interface example1{
	
	void Func(int a, int b);
	
	default void DisplayMode(String s)
	{
		System.out.println(s);
	}
	
	static void show()
	{
		System.out.println("This is static method");
	}
}




