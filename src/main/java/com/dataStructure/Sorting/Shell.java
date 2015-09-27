package com.dataStructure.sorting;

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
            super.show(arr);
            h = h/3 ;
        }
    }

    public static void main(String[] args){

        new Shell().sort(new Integer[]{88, 26, 36, 67, 86, 82, 17, 78, 85, 60 });
    }
}
