package oops.abstraction;

public class Employe extends Person implements Artist,Player {
	public void doSome() {
		System.out.println("An employee");
		
	}
	public void doArt() {
		System.out.println("Employees are allowed");
		
	}
	
	public void doPlay() {
		System.out.println("location tournamnets");
		
	}
	
	
}
