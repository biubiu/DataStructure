package com.dataStructure.basic;

/**
 * User: Shawn cao
 * Date: 14-5-7
 * Time: PM3:44
 */
public interface Queue<T> extends DataStore{

    public void enqueue(T item);

    public T dequeue();

}
