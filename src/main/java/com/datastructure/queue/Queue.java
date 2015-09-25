package com.datastructure.queue;

import java.lang.reflect.Array;

public class Queue<T> {
	private int front;
	private int rear;
	private T[] arr;
	private int size;	

	public Queue(Class clazz, int size) {
		arr = (T[]) Array.newInstance(clazz, size);
		this.size = size + 1;
		front = 0;
		rear = -1;		
	}

	public void insert(T t) {
		if (rear == size - 1) {
			rear = -1;
		}
		arr[++rear] = t;		
	}

	public T remove() {
		T temp = arr[front++];
		if (front == size) {
			front = 0;
		}		
		return temp;
	}

	public T peekFront() {
		return arr[front];
	}

	public boolean isEmpty() {
		return (rear+1 == front || (front + size - 1 == rear));
	}

	public boolean isFull() {
		return rear+2 == front || (front + size -2) == rear;
	}

	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println(" ... ");
	}

	public static void main(String[] args) {		
		Queue<Integer> queue = new Queue<>(Integer.class, 5);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		for (int i = 0; i < 5; i++) {
			System.out.println(queue.remove());
		}
	}
}
