package example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSet {
  public void show() {
	 ArrayList<Employee>al=new ArrayList<Employee>();
	 al.add(new Employee(3, "Alok", "a@gm.in", "Kalwa"));
	 al.add(new Employee(1, "Slok", "m@gm.in", "Mumbai"));
	 al.add(new Employee(4, "jimmy", "pp@gm.in", "Kurla"));
	 al.add(new Employee(2, "zodrew", "vv@gm.in", "CSMT"));
       for(Employee e:al) {
    	   System.out.println(e);
       }
       System.out.println("----------------------------------------");
       Collections.sort(al);
       for(Employee e:al) {
    	   System.out.println(e);
       }
  }
	public static void main(String[] args) {
		ArraylistSet a=new ArraylistSet();
		a.show();
	}
}

