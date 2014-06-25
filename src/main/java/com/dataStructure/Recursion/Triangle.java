package com.dataStructure.Recursion;

public class Triangle {

	public static void main(String[] args) {
		System.out.println(recTriangle(5));
	}
	
	public static int triangle(int n) {
		int total = 0;
		while (n > 0) {
			total += n;
			n--;
		}
		return total;
	}
	
	public static int recTriangle(int n){	
		if( n== 1)
			return 1;
		else{
			System.out.println("n: " + n);
			return n + recTriangle(n-1);			
		}
	}
}
