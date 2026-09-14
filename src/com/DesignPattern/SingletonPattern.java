package com.DesignPattern;

public class SingletonPattern {

	private static SingletonPattern singletonPattern;
	
	
	private  SingletonPattern() {
    
	}
	
	public static SingletonPattern getPattern()
	{
		if (singletonPattern == null) {
			
			synchronized (SingletonPattern.class) {
				singletonPattern=new SingletonPattern();
			}
			
		}
		 
		return singletonPattern;
	}	
}

