package com.datastructure.array;

public class OrderedArray {
	private int[] a;
	private int n;
	
	public OrderedArray(int max){
		a = new int[max];
	}
	
	public int size(){
		return n;
	}
	
	public int find(int searchKey){
		int lowerBound =0;
		int higherBound = n- 1;
		int curIndex;
		
		while(true){
			curIndex = (lowerBound + higherBound)/2;
			if(a[curIndex] == searchKey)
				return curIndex;
			else if(lowerBound > higherBound)
				return n;
			else{
				if(a[curIndex]<searchKey){
					lowerBound = curIndex +1;
				}
				else {
					higherBound = curIndex -1;
				}
			}
		}
	}
	
	public void insert(int value){
		int j;
		for(j=0; j<n; j++){
			if (a[j] > value)
				break;
			for(int k=n;k>j;k--){
				a[k]= a[k-1];
			}
			a[j] = value;
			n++;
		}
	}
	
	public boolean delete(int value){
		int j = find(value);
		if(j == -1)
			return false;
		else {
			for(int k=j;k<n;k++){
				a[k] = a[k+1];
			}
			n--;
			return true;
		}
	}
	
	private void display() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		OrderedArray orderedArray = new OrderedArray(4);
		orderedArray.insert(3);
		orderedArray.insert(1);
	}
}
