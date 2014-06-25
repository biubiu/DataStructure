package com.dataStructure.Recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(recFactorial(6));
	}

	public static int recFactorial(int n) {
		if (n == 1)
			return 1;
		else {
			System.out.println("n " + n);
			return n * recFactorial(n - 1);
		}
	}
}
