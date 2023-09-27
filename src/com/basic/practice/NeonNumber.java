package com.basic.practice;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
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
