<<<<<<< HEAD:src/main/java/com/dataStructure/Recursion/Anagram.java
package com.dataStructure.recursion;
=======
package com.datastructure.Recursion;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/main/java/com/datastructure/Recursion/Anagram.java

public class Anagram {
	
	static int size;
	int count = 0;
	char[] inputs;
	
	public void getInput(String input){
		size = input.length();
		inputs = new char[size];
		for(int i= 0 ; i < size; i++){
			inputs[i] = input.charAt(i);			
		}
	}
	
	public void doAnagram(int splitSize){
		if(splitSize == 1)
			return;
		for(int i = 0 ; i < splitSize; i++){
			doAnagram(splitSize - 1);
			if(splitSize == 2){
				for(int j = 0; j < size; j++){
					System.out.print(inputs[j]);
					//System.out.println();
				}
				System.out.println( "" + count++);
				rotate(splitSize);
			}				
		}
	}
	
	public void rotate(int splitSize){
		int j;
		int position = size - splitSize;
		char temp  = inputs[position];
		for(j = position + 1; j<size; j++){
			inputs[j - 1] = inputs[j];
		}
		inputs[j-1] = temp;
	}
	
	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		anagram.getInput(args[0]);
		anagram.doAnagram(size);
		
	}
}
