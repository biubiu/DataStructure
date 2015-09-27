package com.dataStructure.dynamicConnectivity;

/**
 * User: Shawn cao
 * Date: 14-6-23
 * Time: PM5:02
 */
public class QuickUnionFind extends AbstractUnion{

    public QuickUnionFind(int N){
        super.init(N);
    }

    public boolean connected(int p, int q){
        return ids[p] == ids[q];
    }

    public void union(int p, int q){
        int pVal = ids[p];
        int qVal = ids[q];
        for(int i=0; i<ids.length;i++){
            if(ids[i] == pVal ) ids[i] = qVal;
        }
        printArr(ids);
    }



    public static void main(String[] args){
        QuickUnionFind quickUnionFind = new QuickUnionFind(10);
        String str = "0-4 2-4 6-4 4-3 6-7 2-9";
        for (String string: str.split(" ")){
            int p,q;
            String[] m = string.split("-");
            p = Integer.parseInt(m[0]);
            q = Integer.parseInt(m[1]);
            quickUnionFind.union(p,q);
        }

        System.out.println(quickUnionFind.connected(0,9));
        System.out.println(quickUnionFind.connected(2,9)) ;
        System.out.println(quickUnionFind.connected(3,5))  ;

    }
}
