<<<<<<< HEAD:src/main/java/com/dataStructure/DynamicConnectivity/QuickUnion.java
package com.dataStructure.dynamicConnectivity;
=======
package com.datastructure.DynamicConnectivity;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/main/java/com/datastructure/DynamicConnectivity/QuickUnion.java

/**
 * User: Shawn cao
 * Date: 14-6-23
 * Time: PM5:32
 */
public class QuickUnion extends AbstractUnion {


    public QuickUnion(int N){
        init(N);
    }

    private int root(int i){
        while(i != ids[i]) i = ids[i];
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int pRoot = root(p);
        int qRoot = root(q);
        ids[pRoot] = qRoot;
        printArr(ids);
    }

    public static void main(String[] args){
        QuickUnion quickUnion = new QuickUnion(10);
        //

         quickUnion.union(7,8);
        quickUnion.union( 0,9 );
        quickUnion.union(9,8);
        quickUnion.union( 2,6 );
        quickUnion.union( 3,2);
        quickUnion.union( 1,3 );
        quickUnion.union( 5,3);
        quickUnion.union( 7,1  );
        quickUnion.union(9,4);



    }


}
