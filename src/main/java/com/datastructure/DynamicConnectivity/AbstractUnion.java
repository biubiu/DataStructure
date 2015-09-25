package com.datastructure.DynamicConnectivity;

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
