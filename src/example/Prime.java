
package example;

import java.util.Scanner;

public class Prime {
		Scanner s=new Scanner(System.in);
		public void prime() {
			
		System.out.println("Enter Number");
		int num= s.nextInt();
		int i=0;
		for( i=2; i<=num;i++) {
			if(i% num==0) {
				break;
			}
		}
		if(i==num) {
			System.out.println(num+" is prime");
		}
		else {
			System.out.println(num+" is non prime");

		}
		}
		
		public void primelist() {
			int sum=0;
			for(int i=2; i<=20;i++) {
				int j=0;
				for(j=2; j<i;j++) {
					if(i%j==0) {
						break;
					}
				}
				if(i==j) {			
				 sum= sum+i;
				System.out.print(i+" ");
				}
			}
			System.out.println();
			System.out.println("Sum is  "+sum);
		}
		public static void main(String[] args) {
     Prime p =new Prime();
     p.prime();
     p.primelist();
	}
}

