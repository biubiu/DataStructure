<<<<<<< HEAD:src/main/java/com/dataStructure/DynamicConnectivity/AbstractUnion.java
package com.dataStructure.dynamicConnectivity;
=======
package com.datastructure.DynamicConnectivity;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/main/java/com/datastructure/DynamicConnectivity/AbstractUnion.java

/**
 * User: Shawn cao
 * Date: 14-6-23
 * Time: PM5:48
 */
public abstract class AbstractUnion {
    public int[] ids;
    public void init(int N){
        ids = new int[N];
        for(int i=0; i<N; i++){
            ids[i] = i;
        }
    }

    public abstract boolean connected(int a, int b);

    public abstract void union(int a, int b);

    public void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
