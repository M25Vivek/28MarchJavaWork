package org;
import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		
	
	
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the principal ");
		int principal =scn.nextInt();
		System.out.println("Enter the rate ");
		int rate=scn.nextInt();
		System.out.println("Enter the time");
		int time=scn.nextInt();
		int si;
		si=(principal*rate*time)/100;
		System.out.println("The Simple Interest is : " + si);
		
		
		
		
		
	}

}
