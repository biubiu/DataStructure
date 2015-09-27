package com.dataStructure.basic;

/**
 * User: Shawn cao
 * Date: 14-5-7
 * Time: PM3:32
 */
public class LinkedStack<T> implements Stack<T>{



    private Node<T> first;
    private int N;

    public  boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void push(T t){
        Node oldFirst = first;
        first = new Node();
        first.item = t;
        first.next = oldFirst;
        N++;
    }

    public T pop(){
        if(isEmpty()) return null;
        T t = first.item;
        first = first.next;
        N--;
        return t;
    }

}
