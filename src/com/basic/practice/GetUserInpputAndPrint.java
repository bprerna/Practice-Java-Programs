package com.basic.practice;

import java.util.Scanner;

public class GetUserInpputAndPrint {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No To Display As An Output:");

		int num = sc.nextInt();

		System.out.println("User Entered Input : " + num);
	}

}
