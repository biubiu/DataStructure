package com.datastructure.array;

import java.lang.reflect.Array;

public class GenericOrderedArray<T extends Comparable<T>> {

	private T[] a;
	private int n;

	public GenericOrderedArray(Class<T> clazz, int max) {
		a = (T[]) Array.newInstance(clazz, max);
		n = 0;
	}

	public int size() {
		return n;
	}

	public void insert(T value) {
		a[n] = value;
		n++;
	}

	public void orderInsert(T value) {
		int j;
		for (j = 0; j < n; j++)
			if (a[j] != null && a[j].compareTo(value) > 0)
				break;
		for (int k = n; k > j; k--)
			a[k] = a[k - 1];
		a[j] = value;
		n++;
	}

	public boolean delete(T value) {
		boolean result = false;
		int hit = find(value);
		if (hit == -1)
			return result;
		else {
			for (int i = hit; i < n; i++) {
				a[i] = a[i + 1];
			}
			n--;
		}
		return result;
	}

	public void display() {
		String st = "[";
		for (int i = 0; i < n; i++) {
			st += a[i] + ",";
		}

		System.out.println(st + "]");
	}
	
	//rec binary search
	public int recBinarySearh(T t){
		return recBinarySearch0(t, 0, n);
	}
	
	public int recBinarySearch0(T t, int lowerBound, int upperBound){
	//	System.out.println(lowerBound + " " + upperBound);
		int cur  = (lowerBound + upperBound)/2;
		if(a[cur].equals(t)){
			return cur;
		}
		else if(lowerBound > upperBound){
			return -1;
		}
		else{
			if(a[cur].compareTo(t) > 0){
				return recBinarySearch0(t, 0,lowerBound);
			}
			else{
				return recBinarySearch0(t, lowerBound+1, upperBound);
			}
		}
	}

	// binary search
	public int find(T value) {
		int lowerBound = 0;
		int upperBound = n - 1;
		int curIn;
		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn].equals(value))
				return curIn;
			else if (lowerBound > upperBound) {
				return -1;
			} else {
				if (a[curIn].compareTo(value) < 0)
					lowerBound = curIn + 1;
				else {
					upperBound = curIn - 1;
				}
			}
		}
	}

	public void insertionSort() {
		int in, out;
		T temp;
		for (out = 1; out < n; out++) {
			temp = a[out];			
			for (in = out; in > 0 && a[in - 1].compareTo(temp) >= 0; --in) {
				a[in] = a[in-1];
			}
			a[in] = temp;
		}
	}

	// selecton sort
	public void selectionSort() {
		int in, out, min;
		for (out = 0; out < n - 1; out++) {
			min = out;
			for (in = out; in < n; in++) {
				if (a[in].compareTo(a[min]) < 0)
					min = in;
			}
			swap(min, out);
		}
	}

	// bubble sort
	public void bubbleSort() {
		int in, out;
		for (out = n - 1; out > 1; out--) {
			for (in = 0; in < out; in++) {
				if (a[in].compareTo(a[in + 1]) > 0) {
					swap(in, in + 1);
				}
			}
		}
	}

	public void swap(int t1, int t2) {
		T temp = a[t1];
		a[t1] = a[t2];
		a[t2] = temp;
	}

	public T getMax() {
		if (n == 0)
			return null;
		else {
			return a[n - 1];
		}
	}

	public boolean removeMax() {
		if (n == 0)
			return false;
		else {
			n--;
			return true;
		}
	}

	public static void main(String[] args) {

		int max = 100;
		GenericOrderedArray<Integer> ints = new GenericOrderedArray<>(Integer.class, max);
		ints.insert(100);
		ints.insert(2);
		ints.insert(4);
		ints.insert(1);
		ints.insert(88);
		ints.insert(8);
		ints.insert(6);
		ints.insert(9);
		ints.insert(5);
		ints.display();
		// ints.delete(2);
		// ints.bubbleSort();
		ints.selectionSort();
		//ints.insertionSort();
		ints.display();
		// System.out.println(ints.find(6));
		System.out.println(ints.recBinarySearh(100));
		/*
		 * int max = 4; GenericOrderedArray<Person> persons = new
		 * GenericOrderedArray<>(Person.class, max); persons.insert(new
		 * Person("aa", "bb", 1)); persons.insert(new Person("ab", "bc", 1));
		 * persons.insert(new Person("aa", "bb", 2)); persons.display();
		 */
	}
}
