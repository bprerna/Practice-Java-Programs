package com.basic.practice;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		// Neon Number :- When the sum of digit of a square of te number is equal to the number 
		// 9*9=81, 8+1=9 so 9=8+1=9
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a no to check whether it is neon no or not :");

		int num = sc.nextInt();

		int square = num * num;

		int sum = 0;

		while (square > 0) {

			int r = square % 10;

			sum += r;

			square = square / 10;

		}

		if (sum == num) {
			System.out.println("It is neon number :" + num);
		} else {
			System.out.println("It is not neon number :" + num);
		}

	}

}
