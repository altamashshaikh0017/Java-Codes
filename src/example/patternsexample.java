package example;

public class patternsexample {
	void exm1(){
		for(int i=1; i<=5; i++) {
			for(int j=1;  j<=i; j++){
				System.out.print("*"+" "); 
			}
			//System.out.println();


			for(int j=5;j>i; j--) {
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	void exm2() {
		System.out.println("====================example2=======================");
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i ;j--) {
				System.out.print("*"+" ");
			}
			for(int k=1; k<i;k++) {
				System.out.print("  ");
			}
			for(int k=0; k<i;k++) {
				System.out.print("  ");
			}
			for(int j=5; j>=i ;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*"+" ");
			}
			for(int k=5; k>=i; k--) {
				System.out.print("  ");
			}
			for(int k=5; k>=i; k--) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		patternsexample pe= new patternsexample();
		pe.exm1(); pe.exm2(); 
	}
}

