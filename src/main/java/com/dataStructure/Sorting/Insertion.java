package com.dataStructure.sorting;

/**
 * User: Shawn cao
 * Date: 14-5-9
 * Time: AM10:56
 */
public class Insertion extends AbstractSorter {
    @Override
    public void sort(Comparable[] arr) {
        int len = arr.length;
        for(int i = 1; i < len ; i++){
            for( int j = i; j > 0 && less(arr[j],arr[j-1] ); j--){
                exchange(arr , j-1 , j);
                show(arr);
            }

        }
    }

    public static void main(String[] args){

        new Insertion().sort(new Integer[]{15,33,34, 45, 77, 72, 80, 94, 29, 26});
    }
}
