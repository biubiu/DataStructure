<<<<<<< HEAD:src/main/java/com/dataStructure/DynamicConnectivity/WeightedQuickUnion.java
package com.dataStructure.dynamicConnectivity;
=======
package com.datastructure.DynamicConnectivity;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/main/java/com/datastructure/DynamicConnectivity/WeightedQuickUnion.java

/**
 * User: Shawn cao
 * Date: 14-6-23
 * Time: PM6:29
 */
public class WeightedQuickUnion extends AbstractUnion {

    private int[] sizeWeight;
    private int count;

    public WeightedQuickUnion(int N){
        init(N);
        sizeWeight = new int[N];
        for(int i=0; i<N; i++){
            sizeWeight[i] = 1;
        }
    }

    private int count(){
        return count;
    }

    private int root(int i){
        while(i != ids[i]) i = ids[i];
        return i;
    }
    
    @Override
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }


    public void union(int p, int q){
        int pRoot = root(p);
        int qRoot = root(q);
        if(qRoot == pRoot) return;

        /**
         * if weight size of p is larger than the weight size of q, then q links to the p forest , vice versa;
         * then argument the size. 
         */
        if(sizeWeight[pRoot] < sizeWeight[qRoot]){
            ids[pRoot] = qRoot;
            sizeWeight[qRoot] += sizeWeight[pRoot];
        }
        else{
            ids[qRoot] = pRoot;
            sizeWeight[pRoot] += sizeWeight[qRoot];
        }
        count --;

        printArr(ids);
    }

    public static void main(String[] args){
        WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(10);
        String str = "5-0 8-9 3-6 7-2 0-7 9-3 6-1 2-6 7-4 ";
        for (String string: str.split(" ")){
            int p,q;
            String[] m = string.split("-");
            p = Integer.parseInt(m[0]);
            q = Integer.parseInt(m[1]);
            weightedQuickUnion.union(p,q);
        }
    }
}
