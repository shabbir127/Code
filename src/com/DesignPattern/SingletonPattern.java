package com.DesignPattern;

import java.io.Serializable;

public class SingletonPattern implements Serializable{

	private static SingletonPattern singletonPattern;
	
	
	
	private  SingletonPattern() {
    
//		if (singletonPattern !=null) {
//			throw new RuntimeException("You are trying to break singleton");
//		}
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
//	 private Object readResolve() {
//	        return singletonPattern;
//	    }
	
}

