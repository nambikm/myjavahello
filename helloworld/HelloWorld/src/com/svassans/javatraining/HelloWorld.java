


package com.svassans.javatraining;

import java.util.Date;




public class HelloWorld {
	static private String[] months = {
		"Jaunuary", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
	};
	public static void  main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hello World! Oh I see..");
		System.out.println("Number of args: " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			
			System.out.println(args[i]);			
		}
		
		for (String month : months) {
			System.out.println(month);			
		}	
		
		loopme(5);
		
		double result = addMultipleDoubles(1,2,3,4,5);
		
		System.out.println("the value is " + result);			
		
		return;		

	}
	public static double addMultipleDoubles(double ... values) {
		double result = 0.0;
		for (double d : values) {
			result+= d;
		}
		return result;
	}
	public static void loopme(int top) {
		for (int i = 0; i < top ; i++)
		{
			System.out.println("loop #" + (i+1));
		}
	}
}