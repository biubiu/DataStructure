package com.datastructure;

<<<<<<< HEAD:src/test/java/com/dataStructure/test/BasicTest.java
import com.dataStructure.basic.BinarySearch;
import com.dataStructure.basic.LinkedQueue;
import com.dataStructure.basic.LinkedStack;
import com.dataStructure.basic.Queue;

import com.dataStructure.helper.StdRandom;
import com.dataStructure.helper.Stopwatch;
import com.dataStructure.helper.StreamUtil;
=======
import com.datastructure.Basic.BinarySearch;
import com.datastructure.Basic.LinkedQueue;
import com.datastructure.Basic.LinkedStack;
import com.datastructure.Basic.Queue;

import com.datastructure.Helper.StdRandom;
import com.datastructure.Helper.Stopwatch;
import com.datastructure.Helper.StreamUtil;
>>>>>>> c79664621f893d3f94e2feb4b1e893e8df413d7f:src/test/java/com/datastructure/BasicTest.java

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import junit.framework.TestCase;
import org.github.jamm.MemoryMeter;
import org.junit.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Set;

/**
 * User: Shawn cao
 * Date: 14-5-6
 * Time: PM5:19
 */
public class BasicTest extends TestCase {

    private static MemoryMeter memoryMeter = new MemoryMeter();

    @Test
    public void testReadAllInts(){
        InputStream in = getClass().getResourceAsStream("/tinyW.txt");
        Integer[] numbers = StreamUtil.readAllInts(in);
        assertTrue(numbers.length > 0);
    }


    @Test
    public void testBinarySearch(){
        Integer[] numbers = StreamUtil.readAllInts(getClass().getResourceAsStream("/tinyW.txt"));
        Arrays.sort(numbers);
        int first = BinarySearch.recursiveRank(48,numbers);
        int second = BinarySearch.recursiveRank(19,numbers);
        //int first = BinarySearch.rank(48,numbers);
        //int second = BinarySearch.rank(19,numbers);
        assertTrue(first > -1);
        assertTrue(second == -1);
    }

    @Test
    public void testChar(){
        System.out.println('b') ;
        System.out.println('b' + 'c') ;
        System.out.println((char) ('a' + 4)) ;
    }

    @Test
    public void testLinkedStack(){
        LinkedStack<Integer> stack = new LinkedStack<>();

        for(Integer e:new Integer[]{1,2,3,4,5,6,7,8,9,10}) stack.push(e);
        assertTrue(stack.size() == 10);
        assertTrue(stack.pop()==10);
        assertTrue(stack.pop()==9);
    }

    @Test
    public void testLinkedQueue(){
        Queue<Integer> queue = new LinkedQueue<>();
        for(Integer e:new Integer[]{1,2,3,4,5,6,7,8,9,10}) queue.enqueue(e);
        assertTrue(queue.size() == 10);
        assertTrue(queue.dequeue() == 1);
        assertTrue(queue.dequeue() == 2);
    }

    @Test
    public void testUnionOperation(){
        int N = 10000;
        Set<Double> set1 = Sets.newHashSetWithExpectedSize(N);
        for(int i=0; i<N;i++){
            set1.add(StdRandom.uniform());
        }

        Set<Double> set2 = Sets.newHashSetWithExpectedSize(N);
        for(int i=0; i<N;i++){
            set2.add(StdRandom.uniform());
        }
        Stopwatch stopwatch1 = new Stopwatch();
        Sets.SetView<Double> results = Sets.union(set1, set2);
        System.out.printf("total time %s count: %d",stopwatch1.elapsedTime(),results.size() );
        Stopwatch stopwatch2 = new Stopwatch();
        Lists.newLinkedList(results);
        System.out.printf("total time %s",stopwatch2.elapsedTime() );


    }
    @Test
    public void testThreeSum(){
        Stopwatch stopwatch = new Stopwatch();
        int count = threeSumFast(StreamUtil.readAllInts(getClass().getResourceAsStream("/2Kints.txt")));

        System.out.printf("total time %s count: %d ",stopwatch.elapsedTime(), count);
    }

     @Test
     public void testLambda(){
        Arrays.asList(1,2,3,4,5).forEach(e -> {
           System.out.println(e+1);
        });
     }


    @Test
    public void testArraySize(){
        int N = 1000000 ;
        //double[] arr = new double[N];
         double[] arr = new double[N];
        for(int i = 0; i < N ; i ++){

            arr[i] = StdRandom.uniform();

        }
        byte b = 'a';
        char c = '\u4e00';
        System.out.println("double arr occupied total of memory " + memoryMeter.measureDeep(arr)/1024/1024 +"mb"+ " | " + memoryMeter.measure(arr)/1024/1024+"mb");
        System.out.println(memoryMeter.measureDeep(new Double(23))+ " | " + memoryMeter.measure(new Double(23)));
        System.out.println(memoryMeter.measureDeep(b)+ " | " + memoryMeter.measure(b));
        System.out.println(memoryMeter.measureDeep(c)+ " | " + memoryMeter.measure(c));
    }


    @Test
    public void testSwapWithoutThirdVariable(){
        String a="a",b="b";
        a = returnFirst(b,b = a);
        System.out.println(a + " | " + b);
        assertTrue(a.equals("b"));
        assertTrue(b.equals("a"));
    }

    private String returnFirst(String x, String y){
        return x;
    }

    private int threeSum(Integer[] arr){
        int len = arr.length;

        int count = 0;
        for(int i = 0; i < len; i++){
            for(int j = i+1;j < len; j++){
                for(int k = j+1;k < len; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private int threeSumFast(Integer[] arr){
        Arrays.sort(arr);
        int len = arr.length;
        int count = 0;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len;j++) {
                if (BinarySearch.rank(-arr[i], arr) > i)
                    count++;
            }
        }
        return count ;
    }



}

