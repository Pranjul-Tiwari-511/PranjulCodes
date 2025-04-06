package in.sp.beans;

public class Student {
	private int rollno;
	private String name;
	private Address address;
	
	
	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}



	public void display(){
		
		System.out.println("name: "+ name);
		System.out.println("rollno: "+ rollno);
		System.out.println("address: "+ address);
	}
		
}
