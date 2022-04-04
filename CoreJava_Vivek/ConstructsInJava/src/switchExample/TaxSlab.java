package switchExample;

import java.util.Scanner;

public class TaxSlab {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter salary");
		int salary=sc.nextInt();
		int s1=0;
		int s2=0;
		System.out.println("Enetr tax");
		int tax =sc.nextInt();
		switch(tax) {
		case 10:
			if(salary<=600000)
			{
				s1=salary/100;
				s2=salary-s1;
			}
			if(salary<=1000000)
			{
				s1=salary/100;
				s2=salary-s1;
			}
			if(salary<=3000000)
			{
				s1=salary/100;
				s2=salary-s1;
			}
			System.out.println("salary" +salary);
			
			
			
			
			
		}
	}

}
