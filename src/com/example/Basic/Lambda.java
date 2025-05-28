package com.example.Basic;

@FunctionalInterface
interface A{
	void show();
}
//class B implements A{
//	@Override
//	public void show() {
//		System.out.println("Hey!!");
//	}
//}
public class Lambda {
	public static void main(String[] args) {
		A obj = ()->System.out.println("Lamda Expression");
		
//		{
//			@Override
//			public void show() {
//				System.out.println("Anonymous Inner Class");				
//			}			
//		};
		obj.show();
	}
	
}
