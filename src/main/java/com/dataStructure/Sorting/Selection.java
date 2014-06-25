package com.dataStructure.Sorting;

/**
 * User: Shawn cao
 * Date: 14-5-8
 * Time: PM6:25
 */
public class Selection extends AbstractSorter {

    @Override
    public void sort(Comparable[] arr) {
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if(less(arr[j],arr[min])) min=j;
            }
            exchange(arr ,i,min);
        }
    }
}
