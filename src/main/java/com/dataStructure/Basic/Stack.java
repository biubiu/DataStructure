package com.dataStructure.basic;

/**
 * User: Shawn cao
 * Date: 14-5-7
 * Time: PM3:45
 */
public interface Stack<T> extends DataStore{

    public T pop();
    public void push(T item);
}
