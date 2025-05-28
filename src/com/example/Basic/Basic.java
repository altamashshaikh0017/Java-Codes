package com.example.Basic;

import java.util.Random;
import java.util.Scanner;

public class Basic {
	static Scanner sc = new Scanner(System.in);
	
	private void result() {
		System.out.println("Enter Base");
		int base = sc.nextInt();
		System.out.println("Enter Power");
		int power = sc.nextInt();
		
		int result =1;
		for(int i = 1; i<=power;i++) {
			result = result*base;
		}
		System.out.println("Base : "+base+"  " +"Power: "+power);
		System.out.println("Result is "+result);
	}
   
//	   System.out.println(2**3);
	   public static void main(String[] args) {

//           System.out.println("================================");
//           for(int i=0;i<3;i++){
//               String s1=sc.next();
//               int x=sc.nextInt();
//            System.out.printf("%-15s%03d%n", s1, x);
//           }
//           System.out.println("================================");
 
//		   int q = sc.nextInt();
//
//	        for (int i = 0; i < q; i++) {
//	            int a = sc.nextInt();
//	            int b = sc.nextInt();
//	            int n = sc.nextInt();
//
//	            // Initialize the series
//	            int sum = 0;
//	            for (int j = 0; j < n; j++) {
//	                sum += Math.pow(2, j) * b; // Calculate 2^j * b
//	                System.out.print((a + sum) + " "); 
//	            }
//	            System.out.println(); 
//	        }
		   
		   
		   
		   int length = 10; 
	        System.out.println(geek_Password(length)); 
	    } 
	  
	    // This our Password generating method 
	    // We have use static here, so that we not to 
	    // make any object for it 
	    static char[] geek_Password(int len) 
	    { 
	        System.out.println("Generating password using random() : "); 
	        System.out.print("Your new password is : "); 
	  
	        // A strong password has Cap_chars, Lower_chars, 
	        // numeric value and symbols. So we are using all of 
	        // them to generate our password 
	        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	        String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
	        String numbers = "0123456789"; 
	                String symbols = "!@#$%^&*_=+-/.?<>)"; 
	  
	  
	        String values = Capital_chars + Small_chars + 
	                        numbers + symbols; 
	  
	        // Using random method 
	        Random rndm_method = new Random(); 
	  
	        char[] password = new char[len]; 
	  
	        for (int i = 0; i < len; i++) 
	        { 
	            // Use of charAt() method : to get character value 
	            // Use of nextInt() as it is scanning the value as int 
	            password[i] = 
	              values.charAt(rndm_method.nextInt(values.length())); 
	  
	        } 
	        return password; 
	    
	    }
	        
	Basic basic = new Basic();
//	basic.result();
	   }


