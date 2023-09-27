package com.basic.practice;

import java.util.Scanner;

public class CheckNoEvenOrOdd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a no to check whether it is even or odd : ");

		int n = sc.nextInt();

		if (n % 2 == 0) {

			System.out.println("It Is A Even No : " + n);
		} else {

			System.out.println("It Is A Odd No : " + n);
		}
	}

}
