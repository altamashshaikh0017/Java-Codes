package com.example.Basic;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Map<String, String> mapped = Map.of(
				"Smith", "Cricket",
				"Neymar", "Football",
				"Fedrer", "Tennis",
				"Jordan", "Basketball");
		List<MapItems> items = 	mapped.entrySet().stream()
				.map(entry -> new MapItems(entry.getKey(), entry.getValue()))
				.collect(Collectors.toList());
		System.out.println(items);
	}
}
//	public void reverse(int [] nums , int prev, int next) {
//		while(prev < next) {
//			int temp = nums[prev];
//			nums[prev] = nums[next];
//			nums[next] = temp;
//			prev++;
//			next--;
//		}
//	}
//
//	public void rotate(int [] nums, int k) {
//		int n = nums.length;
//		k = k%n;
//		reverse(nums, 0, n-1);
//		reverse(nums, k, n-1);
//		reverse(nums, 0, k-1);
//
//	}
//
//	public static void main(String[] args) {
//		Test t = new Test();
//		int nums[] = {10, 20, 30, 40, 50, 60};
//		int k = 3;
//		System.out.println("ORIGINAL ARRAY IS : "+Arrays.toString(nums));
//
//		t.rotate(nums, k);
//		System.out.println("ROTATED ARRAY IS : "+Arrays.toString(nums));
//	}
//}




