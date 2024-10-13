package com.ifelseexample;

import java.util.Scanner;

public class TaxAmt {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter cost of bike");
		double amt= s.nextDouble();
		double tax;
		double totalprice = 0;	
		if(amt>100000) {
			 tax= amt*0.15;
			 totalprice=amt+tax;
			System.out.println("Tax  is " +tax);
			System.out.println("Price including tax is "+totalprice);
		}
		if(amt>50000 && amt<=100000) {
			 tax= amt*0.1;
			 totalprice=amt+tax;
			System.out.println("Tax  is " +tax);
			System.out.println("Price including tax is "+totalprice);
		}
		if(amt<=50000) {
			 tax= amt*0.05;
			 totalprice=amt+tax;
			System.out.println("Tax of bike is " +tax);
			System.out.println("Price of bike including tax is "+totalprice);
		}
	}
}
