package com.veeraj.arithematic;

public class Arithematic {
	public static void main(String[] args) {
		Logical l1 = new Logical(); //create l1 logical object
		l1.andOperator(21);
		float updatedSalary =l1.updatesalary(30000f, 6.0f);
		System.out.println("Updated salary is"+updatedSalary);
		Arithematic a1 = new Arithematic();
		int result = a1.additionOperation(5, 18);
		System.out.println("Addition of Two Numbers is" + result);
		
		result = a1.substractionOperation(5, 18);
		System.out.println("Substraction of Two Numbers is" + result);

		result = a1.multiplicationOperation(5, 18);
		System.out.println("Multiplication of two numbers is " + result);

		result = a1.divisonOperation(5,18);
		System.out.println("Divison of two numbers is" + result);
	}

	int additionOperation(int num1, int num2) {
		return num1 + num2;

	}

	int substractionOperation(int num1, int num2) {
		int num3 = num1 - num2;
		return num3;
	}

	int multiplicationOperation(int num1, int num2) {
		int num3 = num1 * num2;
		return num3;

	}

	int divisonOperation(int num1, int num2) {
		int num3 = num1 / num2;
		return num3;
	}
}
