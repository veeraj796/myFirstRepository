package com.veeraj.average;

public class AverageofNumbers {

	public static void main(String args[]) {
		int i, total;
		int a[] = { 0, 6, 9, 2, 7 };
		int n = 5;
		total = 0;

		for (i = 0; i < n; i++) {
			total += a[i];
		}
		System.out.println("Average ::" + (float) total  / n);
	}
}
