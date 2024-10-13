package com.ifelseexample;

import java.util.Scanner;

public class ElectricityBill {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter units used");
	double unit= s.nextDouble();
	double amt;
	if(unit<=50) {
		 amt= 0.5*unit;
		 double a=amt+unit;
	     double sr=a+(a*0.2);
     	System.out.println("bill is Rs "+a);
		System.out.println("bill with surcharge is "+sr);
	}
	if(unit>50 && unit<=100) {
		 amt= 0.75*unit;
		 double a=amt+unit;
	     double sr=a+(a*0.2);
    	System.out.println("bill is Rs "+a);
		System.out.println("bill with surcharge is "+sr);
	}
	if(unit>100 && unit<=200) {
		 amt= 1.0*unit;
		 double a=amt+unit;
	     double sr=a+(a*0.2);
    	System.out.println("bill is Rs "+a);
		System.out.println("bill with surcharge is "+sr);
	}
	if(unit>200) {
		 amt= 1.25*unit;
		 double a=amt+unit;
	     double sr=a+(a*0.2);
   	System.out.println("bill is Rs "+a);
		System.out.println("bill with surcharge is "+sr);
	}
}
}
