<<<<<<< HEAD:src/main/java/com/dataStructure/Recursion/Factorial.java
package com.dataStructure.recursion;
=======
package com.datastructure.Recursion;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/main/java/com/datastructure/Recursion/Factorial.java

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
