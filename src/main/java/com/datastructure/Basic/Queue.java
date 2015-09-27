<<<<<<< HEAD:src/main/java/com/dataStructure/Basic/Queue.java
package com.dataStructure.basic;
=======
package com.datastructure.Basic;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/main/java/com/datastructure/Basic/Queue.java

/**
 * User: Shawn cao
 * Date: 14-5-7
 * Time: PM3:44
 */
public interface Queue<T> extends DataStore{

    public void enqueue(T item);

    public T dequeue();

}
