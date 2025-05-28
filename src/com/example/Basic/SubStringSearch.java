package com.example.Basic;

public class SubStringSearch {

	public int strStr(String haystack, String needle) {
		if(needle.isEmpty()) {
			return 0;
		}
		return haystack.indexOf(needle);
	}
	public static void main(String[] args) {
		SubStringSearch search = new SubStringSearch();
		String haystack1 = "sadbutnotsad";
		String needle1 = "sad";
		System.out.println(search.strStr(haystack1, needle1));
		
		String haystack2 = "leetcode";
		String needle2 = "leeto";
		System.out.println(search.strStr(haystack2, needle2));
	}
}
