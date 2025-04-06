package ltd.pvt.velocis.di;

public class Student {

	public int id;
	public String name;
	public Certi certi;
	
	public Student(int id, String name, Certi certi) {
		
		System.err.println("this constructor is calling");
		this.id = id;
		this.name = name;
		this.certi=certi;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + this.id + ", name=" + this.name + ", Certificate=" + this.certi + "]";
	}
	
}
