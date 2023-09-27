package com;

public class Swapping {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = 0;
		// method 1
//		temp = a;
//		a = b;
//		b = temp;
		
		// method 2
//		a = a + b;
//		b = a - b;
//		a = a - b;
		
		// method 3
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
		// method 4
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		
		System.out.println("a:- " + a);
		System.out.println("b:- " + b);
	}

}
