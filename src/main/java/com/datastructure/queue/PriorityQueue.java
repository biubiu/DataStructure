package com.datastructure.queue;

import java.lang.reflect.Array;

public class PriorityQueue<T extends Comparable<T>> {
	private int size;
	private T[] arr;
	private int n;

	public PriorityQueue(Class clazz, int size) {
		this.size = size;
		arr = (T[]) Array.newInstance(clazz, size);
		n = 0;
	}

	public void insert(T item) {
		int j;
		if (n == 0)
			arr[n++] = item;
		else {
			for (j = n - 1; j > 0; j--) {
				if (item.compareTo(arr[j]) > 0) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = item;
			n++;
		}
	}

	public T remove() {
		return arr[--n];
	}

	public T peekMin() {
		return arr[n - 1];
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public boolean isFull() {
		return n == size;
	}
}
