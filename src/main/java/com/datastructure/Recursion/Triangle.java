<<<<<<< HEAD:src/main/java/com/dataStructure/Recursion/Triangle.java
package com.dataStructure.recursion;
=======
package com.datastructure.Recursion;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/main/java/com/datastructure/Recursion/Triangle.java

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
