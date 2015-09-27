<<<<<<< HEAD:src/main/java/com/dataStructure/Sorting/Merge.java
package com.dataStructure.sorting;
=======
package com.datastructure.Sorting;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/main/java/com/datastructure/Sorting/Merge.java

/**
 * User: Shawn cao
 * Date: 14-5-12
 * Time: AM10:44
 */
public class Merge extends AbstractSorter {


    @Override
    public void sort(Comparable[] arr) {
        Comparable[] auxArr;
        auxArr = new Comparable[arr.length];
        sort(arr ,auxArr , 0 ,arr.length - 1);
    }


    private void sort(Comparable[] arr, Comparable[] auxArr, int low , int high){
        if(high <= low)
            return ;
        int mid = low + (high - low) /2 ;

        sort(arr,auxArr, low , mid );
        sort(arr , auxArr, mid+1, high);
        merge(arr,auxArr, low , mid , high );
    }

    private void merge(Comparable[] arr,Comparable[] auxArr, int low , int mid , int high){

//        assert isSorted(arr, low, mid);
//        assert isSorted(arr, mid+1, high);

        for(int k = low; k <= high; k++){
            auxArr[k] = arr[k];
        }
        int i = low, j = mid+1;
        for (int k = low; k <= high; k++) {
            //left exhausted
            if(i > mid) {
                arr[k] = auxArr[j++];   // this copying is unnecessary
            }
            //right exhausted
            else if(j > high) {
                arr[k] = auxArr[i++];
            }
            else if(less(auxArr[j], auxArr[i])) {
                arr[k] = auxArr[j++];
            }
            else {
                arr[k] = auxArr[i++];
            }
        }

    }
 }

