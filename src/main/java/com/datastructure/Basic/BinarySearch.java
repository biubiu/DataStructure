<<<<<<< HEAD:src/main/java/com/dataStructure/Basic/BinarySearch.java
package com.dataStructure.basic;
=======
package com.datastructure.Basic;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/main/java/com/datastructure/Basic/BinarySearch.java

import java.util.Arrays;

/**
 * User: Shawn cao
 * Date: 14-5-6
 * Time: PM5:19
 */
public final class BinarySearch {

    public static int rank(int key,Integer[] arr){
        int higherBound = arr.length-1;
        int lowerBound = 0;
        while(lowerBound <= higherBound){
            int middle = lowerBound + (higherBound-lowerBound)/2 ;
            if(key<arr[middle]){
                higherBound = middle-1;

            }else if(key> arr[middle]){
                lowerBound = middle +1;
            }else{
                return middle;
            }
        }

        return - 1;
    }

    public static int recursiveRank(int key , Integer[] arr){
        if(arr.length<=1)  return -1;
        int higherBound = arr.length -1;
        int lowerBound = 0;
        int middle = lowerBound + (higherBound-lowerBound)/2;

        if(key<arr[middle])
            return recursiveRank(key, Arrays.copyOfRange(arr,lowerBound,middle));
        else if (key> arr[middle])
            return recursiveRank(key,Arrays.copyOfRange(arr,middle,higherBound+1));
        else
            return middle;
    }
}
