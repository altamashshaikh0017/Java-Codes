package example;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private String email;
private String address;



public Employee(int id, String name, String email, String address) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.address = address;
}



public String toString() {
	return  id +"  "   + name +"  "  + email +"  "  + address + "  ";
}



@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	//return id-o.id;
	return name.compareTo(o.name);
}

     
}
