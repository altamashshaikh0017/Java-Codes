package example;

import java.util.Scanner;

public class ArrayExamples {
	Scanner s= new Scanner(System.in);
  void larges() {
	  int arr[]= new int[5];
	  System.out.println("Enter 5 Numbers");
	  for(int i=0; i<arr.length;i++) {
		  arr[i]=s.nextInt();
	  }
	  int max=arr[0];
	  for(int i=0;i<arr.length;i++) {
		 if(arr[i]>max) {
			 max=arr[i];
		 }
	  }
	  System.out.println("max number is "+max);
  }
  void min(){
	  int arr[]= new int[5];
	  System.out.println("Enter 5 Numbers");
	  for(int i=0; i<arr.length;i++) {
		  arr[i]=s.nextInt();
	  }
	  int min=arr[0];
	  for(int i=0;i<arr.length;i++) {
		 if(arr[i]<min) {
			 min=arr[i];
		 }
	  }
	  System.out.println("minnimum number is "+min);
  }
  public static void main(String[] args) {
	ArrayExamples a= new ArrayExamples();
//	a.larges();
	a.min();
}
}
