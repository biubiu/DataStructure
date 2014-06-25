package com.dataStructure.Sorting;

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
            }
        }
    }
}
