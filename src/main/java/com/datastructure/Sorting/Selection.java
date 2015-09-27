<<<<<<< HEAD:src/main/java/com/dataStructure/Sorting/Selection.java
package com.dataStructure.sorting;
=======
package com.datastructure.Sorting;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/main/java/com/datastructure/Sorting/Selection.java

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
            show(arr);
        }
    }
}
