package com.DesignPattern;

public class SingletonPattern {

	private static SingletonPattern singletonPattern;
	
	
	private  SingletonPattern() {
    
	}
	
	public static SingletonPattern getPattern()
	{
		if (singletonPattern == null) {
			
			singletonPattern=new SingletonPattern();
		}
		
		return singletonPattern;
	}
	
	
}


