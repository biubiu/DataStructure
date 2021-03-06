package com.datastructure;

<<<<<<< HEAD:src/test/java/com/dataStructure/test/SortTest.java
import com.dataStructure.helper.SortCompare;
import com.dataStructure.helper.StdOut;
import com.dataStructure.sorting.*;
=======
import com.datastructure.Helper.SortCompare;
import com.datastructure.Helper.StdOut;
import com.datastructure.Sorting.*;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/test/java/com/datastructure/SortTest.java
import junit.framework.TestCase;
import org.junit.Test;

/**
 * User: Shawn cao
 * Date: 14-5-9
 * Time: PM1:42
 */
public class SortTest extends TestCase {



    @Test
    public void testSelectionSort(){
        AbstractSorter sorter = new Selection();
        //String[] arr = new String[]{"b","z","n","i","h","o","p","g","x","c","l","s","r","a"};
        String[] arr = new String[]{"m","b","c","d","e","f","g","h","k","y"};
        sorter.sort(arr);
        sorter.show(arr);
        System.out.println("Compare " + sorter.compareCount + " swap:" + sorter.exchangeCount);
    }

    @Test
    public void testInsertionSort(){
        AbstractSorter sorter = new Insertion();
        //String[] arr = new String[]{"b","z","n","i","h","o","p","g","x","c","l","s","r","a"};
        String[] arr = new String[]{"m","b","c","d","e","f","g","h","k","y"};
        sorter.sort(arr);
        sorter.show(arr);
        System.out.println("Compare " + sorter.compareCount + " swap:" + sorter.exchangeCount);

    }

    @Test
    public void testCompareSort(){
        int N = 10000;
        int T=100;
        double t1 = SortCompare.timeRandomInput(new Selection(),N,T);
        double t2 = SortCompare.timeRandomInput(new Insertion(),N,T);
        double t3 = SortCompare.timeRandomInput(new Shell(),N,T);
        double t4 = SortCompare.timeRandomInput(new Merge(),N,T);
        double t5 = SortCompare.timeRandomInput(new Quick(),N,T);
        StdOut.printf("For %d random Doubles \n ", N);
//        StdOut.printf("selection  is %.1f ; insertion is %.1f ; shell is %.1f ; ratio is %.001f ", t1, t2,t3, t1/t2);
        StdOut.printf("selection  is %.1f ; insertion is %.1f ;shell is %.1f ; merge is %.1f ; quick is %.1f  ", t1,t2,t3,t4,t5);
    }

    @Test
    public void testShellSort(){
//        Integer[] arr = new Integer[]{10,9,8,7,6,5,4,3,2,1};
//        AbstractSorter<Integer> sorter = new Shell<>();
//        sorter.sort(arr);
//        sorter.show(arr);

        AbstractSorter sorter = new Shell();
        //String[] arr = new String[]{"b","z","n","i","h","o","p","g","x","c","l","s","r","a"};
        String[] arr = new String[]{"m","b","c","d","e","f","g","h","k","y"};
        sorter.sort(arr);
        sorter.show(arr);
        System.out.println("Compare " + sorter.compareCount + " swap:" + sorter.exchangeCount);
    }


    @Test
    public void testQuickSort(){

        AbstractSorter sorter = new Quick();
        //String[] arr = new String[]{"b","z","n","i","h","o","p","g","x","c","l","s","r","a"};
        String[] arr = new String[]{"m","b","c","d","e","f","g","h","k","y"};
        sorter.sort(arr);
        sorter.show(arr);
        sorter.isSorted(arr);
        System.out.println("Compare " + sorter.compareCount + " swap:" + sorter.exchangeCount + " is sort " +  sorter.isSorted(arr));
    }


 }

