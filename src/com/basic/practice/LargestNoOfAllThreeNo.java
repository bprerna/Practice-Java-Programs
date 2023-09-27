package com.basic.practice;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNoOfAllThreeNo {

	static int biggestOfThree(int x, int y, int z) {

		if (x >= y && x >= z) {
			return x;

		} else if (y >= x && y >= z) {

			return y;

		} else {

			return z;
		}

	}

	public static void main(String[] args) {
		int a, b, c, largest;

		a = 10;
		b = 20;
		c = 30;

		// method 2
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(a);
		num.add(b);
		num.add(c);

		System.out.println(Collections.max(num));

//		largest = biggestOfThree(a, b, c);
//
//		System.out.println("Largest of all :" + largest);
	}

}
