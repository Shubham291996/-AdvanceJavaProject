package com.javabatch.advanced;

import java.util.ArrayList;

public class MyArrayListTest {
	public static void main(String[] args) {
		MyArrayList mylist = new MyArrayList();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		mylist.add(50);
		mylist.add(60);
		System.out.println("total element: " +mylist.size());
		System.out.println("printing the elements");
		System.out.println("hi");
		mylist.iterate();
		
	}

}
