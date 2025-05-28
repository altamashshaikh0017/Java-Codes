package com.example.Basic;

interface Fun1{
	void show(int a);
}

interface Fun2{
	void isEven(int b);
	default void data(){
		System.out.println("Data Accessed");
	}
}

interface Fun3{
	void Adder(int a, int b);
}
public class LambdaExample2 {
	public static void main(String[] args) {
		Fun1 f = (a)->System.out.println("Value : "+a);
		f.show(10);
		Fun2 f2 = (a)->{System.out.println(a*2);};
		f2.isEven(3);
		f2.data();

		Fun3 f3 = (a, b)->System.out.println("Sum is : "+a+b);
		f3.Adder(4, 6);

	}
}
