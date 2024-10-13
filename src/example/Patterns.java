package example;


public class Patterns {
	public void ex1() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*"+"  ");
			}
			System.out.println();
		} 
		System.out.println("======P1=====");

	}

	public void ex2() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		} 
		System.out.println("======P2=====");
	}

	public void ex3() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+"  ");
			}
			System.out.println();
		} 

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print(k+"  ");
			}
			System.out.println();
		} 
		System.out.println("====P3=====");
	}
	public void ex4() {
	for(int i=1;i<=5;i++) {
    	for(int j=5; j>=i; j--) {
		System.out.print(" ");
    	}
    	
		for(int k=1; k<=i; k++) {
			System.out.print(k);
				}
		System.out.println();
			
		}
		System.out.println("======P4=======");
	}

	public void ex5() {
		for(int i=1;i<=5;i++) {
	    	for(int j=5; j>i; j--) {
			System.out.print("*");
	    	}	    	
			for(int k=5; k>=5+i-1; k--) {
				System.out.print(k);
		    	}
			System.out.println();	
			}
			System.out.println("======P5=======");
		}
	void ex6() {
		System.out.println("======P6=======");
		for(int i=1; i<=5; i++) {
			for(int j=10; j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print("* ");
			}  
			for(int j=5;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void ex7() {
		System.out.println("======P7=======");
		for(int i=1;i<=5;i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			for(int j=5; j>i; j--) {
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void ex8() {
		System.out.println("======P8=======");
		for(int i=5;i>=1;i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("  ");
			}	
			for(int j=5; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			}
		}
	void ex9() {
		System.out.println("======P9=======");

			for(int i=1;i<=5;i++) {
				for(int j=5;j>=i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("*"+" ");
				}
				System.out.println();
			} 
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				for(int k=4;k>=i;k--) {
					System.out.print(" "+"*");
				}
				System.out.println();
			} 
	}
	void ex10() {
		System.out.println("====================example10=======================");
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
		Patterns p= new Patterns();
	//	p.ex1(); p.ex2(); p.ex3();
		//p.ex4();
      p.ex5();
//		p.ex6(); p.ex7();
		//p.ex8();
		//p.ex9(); p.ex10();
		

	}
}
