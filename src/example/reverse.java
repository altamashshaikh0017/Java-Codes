package example;

public class reverse {
	void show() {
		int n=1234;
		int rem=0; int rev=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse number is :"+rev);
		System.out.println("==============================");
	}
	void average() {
		double arr[]= { 12,23.32,45.6,56.8};
		double sum=0;
		for(int i=0; i<arr.length; i++) {

			sum= sum+arr[i];
		}
		System.out.println("Total is :"+sum);
		double average = sum/arr.length;

		System.out.println("Average is :"+average);
		System.out.println("=================================");
	}
	void factorial(int n) {
		int fact=1;
		for(int i=1; i<=n; ++i) {
			fact=  fact*i;
		}
		System.out.println("Factorial is :"+fact);
		System.out.println("=================================");

	}

	void armstrong(int n) {
		int x=n;
		int rem,arm=0;
		while(n>0) {
			rem=n%10;
			arm=rem*rem*rem+arm;
			n=n/10;
		}
		if(arm==x) {
			System.out.println(x+" is armstrong");
		}
		else {
			System.out.println(x+" is non armstrong");
		}
	}

	void neon(int n) {
		int x=n;
		int sq=n*n;
		int rem,sum=0;
		while(sq>0) {
			rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(x==sum) {
			System.out.println(x+" is neon number");
		}
		else {
			System.out.println(x+ " is non neon number");
		}

	}
	public static void main(String[] args) {
		reverse a = new reverse();
		a.show(); a.average(); a.factorial(5); 
		a.armstrong(153);	a.armstrong(113);
		System.out.println("=================================");

		a.neon(9); a.neon(95);
		System.out.println("=================================");


	}

}

