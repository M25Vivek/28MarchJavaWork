package DoWhile;

import java.util.Scanner;

public class SmpInterest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter amount ");
		int amount= in.nextInt();
		System.out.println("Enter the rate");
		int rate = in.nextInt();
		System.out.println("Enetr the time");
		int time =in.nextInt();
		
		float interest=(amount*rate*time)/100;
		System.out.println("intesret is "+interest);
		 
			do {
				interest=(amount*rate*time)/100;
				time++;
			}while(interest<100000);
			System.out.println("no of years " +time);
		}
		
		

	}


