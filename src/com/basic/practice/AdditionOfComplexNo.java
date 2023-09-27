package com.basic.practice;

public class AdditionOfComplexNo {

	int real, image;

	public AdditionOfComplexNo(int r, int i) {

		this.real = r;
		this.image = i;

	}

	public void showC() {

		System.out.println(this.real + " + i" + this.image);
	}

	public static AdditionOfComplexNo add(AdditionOfComplexNo n1, AdditionOfComplexNo n2) {

		AdditionOfComplexNo res = new AdditionOfComplexNo(0, 0);

		res.real = n1.real + n2.real;

		res.image = n1.image + n2.image;

		return res;

	}

	public static void main(String[] args) {

		AdditionOfComplexNo c1 = new AdditionOfComplexNo(4, 5);

		AdditionOfComplexNo c2 = new AdditionOfComplexNo(10, 5);

		System.out.println("First complex number is :");
		c1.showC();

		System.out.println("Second complex number is : ");
		c2.showC();

		AdditionOfComplexNo res = add(c1, c2);

		System.out.println("Addition is : ");

		res.showC();

	}

}
