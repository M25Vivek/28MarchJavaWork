package forExample;

import java.util.Scanner;

public class StarDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc =new Scanner(System.in);
           System.out.println("Eneter row");
           int n = sc.nextInt();
           for(int i=1;i<=n;i++)
           {
        	   for(int j=1;j<=n-i;j++)
        	   {
        		   System.out.println(" ");
        	   }
        	   for(int j=1;j<=i*2-1;j++)
        	   {
        		   System.out.println("*");
        	   }
        	   System.out.println();
           }
           
           }

}
