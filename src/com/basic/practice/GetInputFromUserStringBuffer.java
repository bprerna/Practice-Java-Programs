package com.basic.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputFromUserStringBuffer {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter A Name :");

		String name = reader.readLine();

		System.out.println("Entered name is :" + name);

	}

}
