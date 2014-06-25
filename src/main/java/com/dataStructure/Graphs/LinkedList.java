package com.dataStructure.Graphs;

public class LinkedList<E> {
	private Node<E> first;
	private Node<E> last;
	private int size;

	private void LinkedFirst() {
	}

	public void add(E e) {
		Node<E> l = last;
		Node<E> newNode = new Node<E>(l, e, null);
		last = newNode;
	}

	public boolean remove(E e) {
		Node<E> current = first;
		Node<E> pre = first;
		if (pre == null)
			while (current.next != e) {
				if (current == null)
					return false;
				else {
					pre = current;
					current = current.next;
				}
			}
		size--;
		return true;
	}

	public E get(E e) {
		Node<E> current = first;
		while (current.next != e) {
			current = current.next;
		}
		return current.item;
	}

	public void addFirst(E e) {
		Node<E> f = first;
		Node<E> node = new Node<>(null, e, first);
		first = node;
		if (f == null)
			last = node;
		else
			f.pre = node;
	}

	static class Node<E> {
		E item;
		Node pre;
		Node next;

		public Node(Node pre, E item, Node next) {
			this.pre = pre;
			this.item = item;
			this.next = next;
		}
	}
}
