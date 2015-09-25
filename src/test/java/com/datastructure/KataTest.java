package com.datastructure;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * User: Shawn cao
 * Date: 14-5-14
 * Time: AM11:20
 */
public class KataTest extends TestCase{

    @Test
    public void testFizzBuzz(){
        for(int i=1 ; i<=100; i++) {
            printFizzBuzz(i);
        }
    }


    private void printFizzBuzz(int i){
        if(i %3 == 0){
            if(i % 5 == 0){
                System.out.println("FizzBuzz");
                return ;
            }
            System.out.println("Fizz");

        }else if (i%5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(i);
        }
    }

    @Test
    public void testReverseString(){
        String str = "abcdefghijklmnopq";
        //String result = reverseWithExtraBuffer(str);
        String result = reverseWithoutExtraBuffer(str);
        System.out.println(result);
        assertTrue(result.equals(new StringBuilder(str).reverse().toString()));
    }

    public String reverseWithExtraBuffer(String str){
        StringBuffer sb = new StringBuffer(str.length());
        for(int i = str.length()-1; i >= 0 ; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public String reverseWithoutExtraBuffer(String str){
        char[] chars = str.toCharArray();
        int low = 0, high = str.length() -1 ;
        while(low <= high){
            swap(chars,low++,high--);
        }
        return new String(chars);
    }

    private void swap(char[] chars,int i, int j){
        char tmp = chars[j];
        chars[j] = chars[i];
        chars[i] = tmp;
    }

    @Test
    public void testPrintMultiplicationTable(){
        int matrixNum = 12;
         for(int i = 1; i <= matrixNum; i++){
             for(int j = 1; j<= matrixNum;j++) {
                 System.out.print(String.format("%4d", j * i));
             }
             System.out.println();
         }
    }

    @Test
    public void testOddPrint(){
        printOdd();
    }

    private void printOdd(){
        int top = 100;
        for(int i=0; i<= 100; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    @Test
    public void testFindLargest(){

        int[] ints = new int[]{2,3,4,5,6,6,7,187362,3,42342,123,34,56,7,8,9,9,7,4,23,4231,123,34,3,543,6,346};
        //StdRandom.shuffle(ints);
        int largest = findLargest(ints);

        assertTrue(187362 == largest );
    }

    private int findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i< arr.length - 1; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    @Test
    public void testFormatRGBToHex(){
       System.out.println(formatRGB(255,0,128));
    }

    private String formatRGB(int r, int g, int b) {
        return String.format ( "%02X%02X%02X", r, g, b );
    }
}
