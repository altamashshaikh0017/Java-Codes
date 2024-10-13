package example;


import java.util.Scanner;                    //method overriding 
class Aa{             
	void sho() {
		System.out.println("altamah shaikh ");
	}
	
}
public class example1 extends Aa {
int a=20;
    void show() {
	   System.out.println("enter a nuumber");
	   
	   System.out.println(a+"ravikiran");
   }
   public static void main(String[] args) {
	example1 a=new example1();
	a.show(); a.show();
}
}
