package com.javabatch.advanced;

public class MyArrayList {
	private int [] arr = new int[5];
	private int index = 0;
	public boolean add(int data) {
		if (index == arr.length){ 
			int [] newArr = new int[arr.length * 2];
			for ( int i=0; i <arr.length; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
			arr[index++] = data;
		}else {
			arr[index++]=data;
		}
		return true;
	}
	public int size() {
		return index ;
	}
	public void iterate() {
		for (int i =0; i < index; i++) {
			System.out.println(arr[i]);
		}
	}
}
