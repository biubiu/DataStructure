package com.datastructure.sort;

import java.util.*;

public class Sorter {

	private static <T extends Comparable<T>> void swap(List<T> container, int i, int j) {
		T temp = container.get(i);
		container.set(i, container.get(j));
		container.set(j, temp);
	}

	public static <T extends Comparable<T>> void gnomeSort(List<T> container) {
		for (int i = 1; i < container.size();) {
			if (container.get(i - 1).compareTo(container.get(i)) < 0) {
				++i;
			} else {
				swap(container, i - 1, i);
				--i;
				if (i == 0) {
					i = 1;
				}
			}
		}
	}

	public static <T extends Comparable<T>> void selectionSort(List<T> container) {
		int in, out, min;
		int max = container.size();
		for (out = 0; out < max - 1; out++) {
			min = out;
			for (in = out; in < max; in++) {
				if (container.get(in).compareTo(container.get(min)) > 0) {
					min = in;
				}
				swap(container, min, out);
			}
		}
	}

	public static <T extends Comparable<T>> void insertionSort(List<T> container) {
		int in, out;
		T temp;
		int size = container.size();
		for (out = 1; out < size; out++) {
			temp = container.get(out);
			for (in = out; in > 0 && container.get(in - 1).compareTo(temp) > 0; --in) {
				swap(container, in, in - 1);
			}
			container.set(in, temp);
		}
	}

	public static <T extends Comparable<T>> void bubbleSort(List<T> container) {
		int size = container.size();
		int out, in;
		for (out = size - 1; out > 0; out--) {
			for (in = 0; in < out; in++) {
				if (container.get(in).compareTo(container.get(in + 1)) > 0) {
					swap(container, in, in + 1);
				}
			}
		}
	}
}
