package com.dataStructure.stack;

import java.lang.reflect.Array;

import javax.sound.midi.MidiChannel;

public class StackDemo<T> {

	private int max;
	private T[] stack;
	private int nElements;

	public StackDemo(Class clazz, int max) {
		this.max = max;
		stack = (T[]) Array.newInstance(clazz, max);
		nElements = -1;
	}

	public void push(T t) {		
		stack[++nElements] = t;
	}
	
	public T pop(){
		return stack[nElements--];
	}
	
	public T peek(){
		return stack[nElements];
	}
	
	public boolean isEmpty(){
		return nElements == -1;
	}
	
	public boolean isFull(){
		return nElements == max-1;
	}
	
	public static void main(String[] args) {
	/*	StackDemo<Integer> stackDemo = new StackDemo<>(Integer.class, 5);
		stackDemo.push(10);
		stackDemo.push(11);
		stackDemo.push(9);
		
		System.out.println(stackDemo.pop());
		System.out.println(stackDemo.pop());*/
		
		String input = args[0];	
		int size = input.length();
		StackDemo<Character> charStackDemo = new StackDemo<>(Character.class, size);
		for(int i=0; i<size; i++){
			charStackDemo.push(input.charAt(i));
		}
		String output = "";
		for(int i=0;i<input.length();i++){			
			output += charStackDemo.pop();
		}
		System.out.println(output);
	}
}
