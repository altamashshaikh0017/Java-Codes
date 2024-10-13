package example;

import java.util.Scanner;

class Bank{
	Scanner s= new Scanner(System.in);
	int balance=5000;
	int amt=0;

	synchronized void deposit() throws InterruptedException {
		System.out.println("Total Balance is : "+balance);
		Thread.sleep(500);
		System.out.println("enter amount for deposit");
		amt=s.nextInt();
		balance=balance+amt;
		Thread.sleep(500);

		System.out.println("Total amount after deposit is "+balance);
	}

	synchronized void withdraw() throws InterruptedException {
		System.out.println("Total Balance is : "+balance);
		Thread.sleep(500);
		System.out.println("enter amount for withdrawal");
		amt=s.nextInt();
		balance=balance-amt;
		Thread.sleep(500);

		System.out.println("Total amount after withdrawal is "+balance);
	}
}
class Wife extends Thread{
	Bank b;
	public Wife(Bank b) {
		this.b=b;
	}
	public void run() {
		try {
			b.deposit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Husband extends Thread{
	Bank b;
	public Husband(Bank b) {
		this.b=b;
	}
	public void run() {
		try {
			b.withdraw();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class Execute {
	public static void main(String[] args) {


		Bank b= new Bank();
		Wife w= new Wife(b);
		Husband h= new Husband(b);
		w.start();
		h.start();
	}
}
