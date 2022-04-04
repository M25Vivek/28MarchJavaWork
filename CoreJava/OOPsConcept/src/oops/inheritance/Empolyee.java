package oops.inheritance;
private class Empolyee extends Person{
	int empId;


public  Empolyee (String name,int age, String address,int empId) 
{
//super() Person() capable of calling default
	super(name,age,address);
	this.empId=empId;
	System.out.println("employee constrt");
	
}
}
