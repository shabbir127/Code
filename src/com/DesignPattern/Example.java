package com.DesignPattern;

public class Example {

	public static void main(String[] args) {
		
		  SingletonPattern s1=SingletonPattern.getPattern();
		  SingletonPattern s2=SingletonPattern.getPattern();
		  
		  System.out.println("S1:-" + s1 + " " + " S2:- "+ s2);
		  
		  System.out.println(s1==s2);
		  System.out.println(s1.hashCode()==s2.hashCode());
		}
}
