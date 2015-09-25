package com.datastructure.Sorting;

/**
 * User: Shawn cao
 * Date: 14-5-9
 * Time: PM2:39
 */
public class Shell extends AbstractSorter {
    @Override
    public void sort(Comparable[] arr) {
        int N  = arr.length;
        int h = 1 ;

        while( h < N /3) h = h*3 + 1; // 1 , 4, 13  ...
        while ( h > 0 ){
            for(int i = h; i < N ; i++){
//                System.out.println(" i " + i + " ---");
                for(int k = i; k >= h && less(arr[k] , arr[k - h]); k -= h){
//                    System.out.println("exchange for: " + (k-h)+" : " + arr[k-h] + " | " + k + " : "+ arr[k]);
                    exchange(arr , k , k - h);
                }
//                System.out.println("######");
            }
//            System.out.println("====================");
            h = h/3 ;
        }
    }
}
