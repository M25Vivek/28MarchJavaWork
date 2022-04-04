package oops.inheritance;

public class Manager extends Empolyee {
	String dept;
	public Manager (String name,int age,String address,int empId,String dept) {
		super(name,age,address,empId);
		this.dept=dept;
		System.out.println("manager constructor");
	}

}
