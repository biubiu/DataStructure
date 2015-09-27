package com.datastructure;

import com.datastructure.Trees.BinarySearchTree;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * User: Shawn cao
 * Date: 14-5-15
 * Time: PM4:07
 */
public class SearchTest extends TestCase {

    @Test
    public void testBST(){
        BinarySearchTree<Integer,String> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.put(2,"Two");
        binarySearchTree.put(1,"One");
        binarySearchTree.put(5,"Five");
        binarySearchTree.put(3,"Three2");
        binarySearchTree.put(9,"Nine");
        binarySearchTree.put(3,"Three");

        assertTrue(binarySearchTree.size() == 5);
        assertTrue(binarySearchTree.get(3).equals("Three"));
    }


}
