package com.DesignPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Example implements Serializable {

	public static void main(String[] args) throws Exception {
		
		  SingletonPattern s1=SingletonPattern.getPattern();
		  SingletonPattern s2=SingletonPattern.getPattern();
		  
		  System.out.println("S1:-" + s1 + " " + " S2:- "+ s2);
		  
		  System.out.println(s1==s2);
		  System.out.println(s1.hashCode());
		  
		  
		 /* Constructor<SingletonPattern> constructor=SingletonPattern.class.getDeclaredConstructor();
		  constructor.setAccessible(true);
		  SingletonPattern singletonPattern=constructor.newInstance();
		  
		  System.out.println(singletonPattern.hashCode()); */
		  
		  // serilize 
		   ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("xyz.ob"));
		   oos.writeObject(s2);
		   
		   System.out.println("Serilize done");
		   
		   ObjectInputStream ois=new ObjectInputStream(new FileInputStream("xyz.ob"));
		   SingletonPattern des2=(SingletonPattern) ois.readObject();
		   
		   System.out.println(des2.hashCode());
		   System.out.println(s2.hashCode());
		}
}
