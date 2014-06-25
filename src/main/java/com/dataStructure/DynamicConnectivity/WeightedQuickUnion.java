package com.dataStructure.DynamicConnectivity;

/**
 * User: Shawn cao
 * Date: 14-6-23
 * Time: PM6:29
 */
public class WeightedQuickUnion extends AbstractUnion {

    private int[] sz;
    private int count;

    public WeightedQuickUnion(int N){
        init(N);
        sz = new int[N];
        for(int i=0; i<N; i++){
            sz[i] = 1;
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

        if(sz[pRoot] < sz[qRoot]){
            ids[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        }
        else{
            ids[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
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
