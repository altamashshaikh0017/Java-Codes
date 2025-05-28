package com.example.Basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
//	public void isAnagram(String s, String t) {
//		s = s.toLowerCase();
//		t = t.toLowerCase();
//		if(s.length() != t.length()) {
//			System.out.println(s+" and "+t+" need to be of same length to be an Anagram");
//		}
//		char [] str1 = s.toCharArray();
//		Arrays.sort(str1);
//		char [] str2 = t.toCharArray();
//		Arrays.sort(str2);
//		System.out.println(Arrays.equals(str1, str2));
//	}
//	
//	public static void main(String[] args) {
//		Anagrams anagrams = new Anagrams();
//		anagrams.isAnagram("Anagram", "Nagaram");
//		anagrams.isAnagram("Care", "Races");
//	}
	
	
	private boolean isAnagram(String s, String t) {
		s = s.toLowerCase();
		t = t.toLowerCase();
		if(s.length() != t.length()) return false;
		
		Map<Character, Integer> charCount = new HashMap<>();
		for(char c : s.toCharArray()) {
		   charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		for(char c : t.toCharArray()) {
			if(!charCount.containsKey(c)) {
				return false;
			}
			charCount.put(c, charCount.get(c) - 1);
			if(charCount.get(c) == 0) {
				charCount.remove(c);
			}
		}
		return charCount.isEmpty();
	}
	
	public static void main(String[] args) {
		Anagrams anagrams = new Anagrams();
		String s1 = "Silent";
		String s2 = "Listen";
		
		String t1 = "Killer";
		String t2 = "Miller";
		System.out.println(anagrams.isAnagram(s1, s2));
		System.out.println("<----------------->");
		System.out.println(anagrams.isAnagram(t1, t2));
	}
	

//	public boolean isAnagram(String s, String t) {
//		s = s.toLowerCase();
//		t = t.toLowerCase();
//		if(s.length() != t.length()) return false;
//		
//		Map<Character, Integer> charCount = new HashMap<>();
//		for(char c : s.toCharArray()) {
//			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//		}
//		for(char c : t.toCharArray()) {
//			if(!charCount.containsKey(c)) {
//				return false;
//			}
//			charCount.put(c, charCount.get(c) - 1);
//			if(charCount.get(c) == 0) {
//				charCount.remove(c);
//			}
//		}
//		return charCount.isEmpty();
//	}
//	public static void main(String[] args) {
//		Anagrams anagrams = new Anagrams();
//		String s1 = "Silent";
//		String t1 = "Listen";
//		System.out.println(anagrams.isAnagram(s1, t1));
//		
//		String s2 = "Race";
//		String t2 = "Case";
//		System.out.println(anagrams.isAnagram(s2, t2));
//	}
}
