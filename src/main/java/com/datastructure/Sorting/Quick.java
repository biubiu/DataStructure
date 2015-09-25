package com.datastructure.Sorting;

/**
 * User: Shawn cao
 * Date: 14-5-8
 * Time: PM6:07
 */
public class Quick extends AbstractSorter {

    private final int THRESH_HOLD = 15;

    @Override
    public void sort(Comparable[] arr) {
        sort(arr, 0, arr.length-1);

    }

    private void sort(Comparable[] arr , int low, int high){
        if(high <= low) return ;

        /**
         * Improvement:
         *
         */
//        if(high <= low + THRESH_HOLD ){
//            new Insertion().sort(arr);
//            return ;
//        }

        int j = partition(arr, low , high);
        sort(arr, low, j-1 );
        sort(arr, j+1, high);
    }

    private int partition(Comparable[] arr, int low, int high){
         int i = low, j = high+1;
        Comparable pivot = arr[low];
        while(true){
            while(less(arr[++i],pivot)){
                  if(i == high) break;
            }
            while(less(pivot,arr[--j])){
                if(j == low) break;
            }
            if(i >= j) break;
            exchange(arr, i , j);
        }
        exchange(arr, low, j);
        return j;
    }
}
