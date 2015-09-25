package com.datastructure.Trees;





import java.util.LinkedList;
import java.util.Queue;

/**
 * User: Shawn cao
 * Date: 14-5-15
 * Time: PM3:44
 */
public class BinarySearchTree<Key extends Comparable<Key>, Value>  {

    private Node root;


    public boolean isEmpty(){
        return size() == 0;
    }
    public int size(){
        return size(root);
    }

    public int size(Node node){
        if(node == null) return 0;
        else
            return node.N;
    }


    public void put(Key key, Value val){
        root = put(root,key, val);
    }

    private Node put(Node node , Key key, Value val){
        if(node == null){
            return new Node(key,val,1);
        }
        int compare = key.compareTo(node.key);
        if(compare < 0){
            node.left = put(node.left, key ,val);
        }
        else if(compare > 0){
            node.right = put(node.right, key ,val);
        }else{
            node.val = val;
        }
        node.N = size(node.left) + size(node.right) + 1;
        return node;

    }


    public Value get(Key key){
        return get(root,key);
    }

    private Value get(Node node , Key key){
        if(node == null){
            return null;
        }
        int compare = key.compareTo(node.key);
        if(compare < 0){
            return get(node.left, key);
        }else if(compare > 0){
            return get(node.right, key);
        }
        else
            return node.val;
    }

    public Node min(){
        return min(root);
    }

    private Node min(Node node){
        if(node == null){
            return null;
        }
        else if(node.left == null){
            return node;
        }
        return min(root.left);
    }

    public Node max(){
        return max(root);
    }

    private Node max(Node node){
         if(node == null){
             return null;
         }
        else if(node.right == null){
             return node;
         }
        else {
             return max(node.right);
         }
    }

    public int rank(Key key){
        return rank(key,root);
    }

    private int rank(Key key, Node node){
        if(node == null)
            return 0;
        int compare = key.compareTo(node.key);
        if(compare < 0){
            return rank(key,node.left);
        }
        else if(compare > 0){
            return 1+ size(node.left) + rank(key, node.right);
        }
        else
            return size(node.left);
    }

    public void delete(Key key) {
        delete(root, key);
    }

    private Node delete(Node node , Key key){
        if(node == null)
            return null;
        int compare = key.compareTo(node.key);
        if(compare > 0){
            node.left = delete(node.left,key);
        }else if (compare > 0){
            node.right = delete(node.right,key);
        }
        else{
            if(node.right == null){
                return node.left;
            }
            if(node.left == null){
                return node.right;
            }
            Node t = node;
            node = min(t.right);
            node.right = deleteMin(t.right);
            node.left = t.left;
        }

        node.N = size(node.left) + size(node.right) + 1;
        return node ;
    }

    public void deleteMin(){
        root = deleteMin(root);
    }

    private Node deleteMin(Node node){
        if(node.left == null){
            return node.right;
        }
        node.left = deleteMin(node.left);
        node.N = size(node.left) + size(node.right) + 1;
        return node ;
    }


    public Iterable<Key> keys(){
        return keys(min().key,max().key);
    }

    private Iterable<Key> keys(Key low, Key high){
        Queue<Key> queue = new LinkedList<>();
        return queue;
    }

    private void keys(Node node , Queue<Key> keys, Key low, Key high){
        if(node == null){
            return ;
        }
        int compareLow = low.compareTo(node.key);
        int compareHigh = high.compareTo(node.key);
        if(compareLow < 0){
            keys(node.left, keys, low , high);
        }
        if(compareHigh >= 0 && compareLow <=0 ){
            keys.add(node.key);
        }
        if(compareHigh > 0){
            keys(node.right,keys,low,high);
        }
    }


    private class Node{
        private Key key;
        private Value val;
        private Node left,right;
        private int N;

        public Node(Key key, Value val, int N){
            this.key = key;
            this.val = val;
            this.N = N;
        }


    }
}
