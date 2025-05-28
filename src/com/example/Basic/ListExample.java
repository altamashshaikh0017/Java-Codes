package com.example.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ListExample {
//public static void main(String[] args) {
//	List<Integer> list = Arrays.asList(46, 65, 98, 12 , 32);
//	Collections.sort(list, Collections.reverseOrder());
//	System.out.println(list);
//	
//	
//	
//	int a = 5;
//	int b = 9;
//	a = a+b; // 14
//	b = a-b; // 14-9 = 5
//	a = a-b; //14-5 = 9
////	a = a^b; //5^9
////	b = a^b; // (5^9)^9 = 5
////	a = a^b; //(5^9)^5 = 9
//	System.out.println("Swapped Value of a : "+a);
//	System.out.println("Swapped Value of b : "+b);
//}
	
	public void union(int [] x , int [] y) {
		TreeSet<Integer> set = new TreeSet<>();
		for(int i : x) {
			set.add(i);
		}
		for(int i : y) {
			set.add(i);
		}
//		int [] unionArray = new int[set.size()];
			Integer [] unionArray = set.toArray(new Integer[0]);
//		int index = 0;
//		Iterator<Integer> it = set.iterator();
//		while(it.hasNext()) {
//			unionArray[index++] = it.next();
//		}
		System.out.println(Arrays.toString(unionArray));
	}
	
	public static void main(String[] args) {
		ListExample example = new ListExample();
		int arr1 [] = {5, 2, 9, 6, 3, 12};
		int arr2 [] = {7, 4, 9, 2, 15, 5};
		example.union(arr1, arr2);
	}
	
}
