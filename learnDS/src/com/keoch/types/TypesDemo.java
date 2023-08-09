package com.keoch.types;

public class TypesDemo {

	static float currency = 67.0f;
	public static void main(String[] args) {
		final int age = 5;
		System.out.println("the currency value is "+currency);
		currency = 75.6f;
		System.out.println(salary());
		System.out.println(salary(25000.00f));
		System.out.println(salary(25000.0f,5));
		
		System.out.println("the currency value is "+currency);
		Student student;
		student = new Student();
		System.out.println(Student.collegeID);
		Student.collegeID = 67;
		System.out.println(Student.collegeID);
		
	}
	
	public static float salary() {
		return 13;
		
	}
	
	public static float salary(float sal) {
		System.out.println("salary is "+sal);
		return 0;
		
	}
	
	public static float salary(float sal, int exp) {
		float totalSalary = sal+exp*1000;
		System.out.println("new salary is "+totalSalary);
		return totalSalary;
		
	}
}
