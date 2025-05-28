package com.example.Basic;

public class LastWordLength {
   public int lastWordLength(String s) {
	   s = s.trim();
	   int lastSpaceIndex = s.lastIndexOf(' ');
	  return s.length()-lastSpaceIndex - 1;
   }
	public static void main(String[] args) {
		LastWordLength lastWordLength = new LastWordLength();
		System.out.println(lastWordLength.lastWordLength("Hello SpringBoot"));
		System.out.println(lastWordLength.lastWordLength("fly me to the moon"));
         System.out.println(lastWordLength.lastWordLength("luffy is still the joyboy"));
	}
    
}
