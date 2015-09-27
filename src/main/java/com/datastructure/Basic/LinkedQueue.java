<<<<<<< HEAD:src/main/java/com/dataStructure/Basic/LinkedQueue.java
package com.dataStructure.basic;
=======
package com.datastructure.Basic;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/main/java/com/datastructure/Basic/LinkedQueue.java

/**
 * User: Shawn cao
 * Date: 14-5-7
 * Time: PM3:40
 */
public class LinkedQueue<T> implements Queue<T> {

    private Node<T> first;
    private Node<T> last;
    private int N;


    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return first==null;
    }

    @Override
    public void enqueue(T item) {
        Node oldLast = last ;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty())
            first = last ;
        else
            oldLast.next = last;
        N++;
    }

    @Override
    public T dequeue() {
        if(isEmpty()) return null;
        T t = first.item;
        first = first.next;
        N--;
        return t;
    }
}
