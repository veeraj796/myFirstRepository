package com.veeraj.arithematic;

	import java.util.Scanner;

	 

	public class ReadFloatingPoint {
	    public static void main(String[] args) {
	        Scanner s1 = new Scanner(System.in);// scannerClassName objectName= new scannerClassConstructor 

	 

	        System.out.print("Enter a floating-point number: ");
	        float number = s1.nextFloat();

	 

	        System.out.println("You entered: " + number);

	 

	        // Remember to close the scanner when it's no longer needed
	        s1.close();
	    }
	}


