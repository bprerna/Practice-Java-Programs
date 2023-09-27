package com.basic.practice;

import java.util.Scanner;

public class VovelOrConsonant {

	static void vowelOrNot(char y) {

		if ((y == 'a') || (y == 'e') || (y == 'i') || (y == 'o') || (y == 'u')) {
			System.out.println("it is vowel:" + y);
		} else {
			System.out.println("It is consonent :" + y);
		}

	}

	public static void main(String[] args) {
		vowelOrNot('a');
		vowelOrNot('b');
	}

}
