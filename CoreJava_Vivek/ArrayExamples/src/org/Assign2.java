package org;

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter elemets of a array");
	       for(int i=0;i<3;i++)
	       {
	    	   for(int j=0;j<3;j++)
	    	   {
	    		   a[i][j]=sc.nextInt();
	    	   }
	    	   System.out.println("");
	       }
	       
	       System.out.println("Enter elements of b array");
	       for(int i=0;i<3;i++)
	       {
	    	   for(int j=0;j<3;j++)
	    	   {
	    		   b[i][j]=sc.nextInt();
	    	   }
	    	   System.out.println("");
	       }
	       //Addition of matrix
	       for(int i=0;i<3;i++)
	       {
	    	   for(int j=0;j<3;j++)
	    	   {
	    		   for(int k=0;k<3;k++)
	    		   {
	    			   c[i][j]=a[i][j] + b[i][j];
	    		   }
	    	   
	            }
	       }
	       //Result
	       System.out.println("Matrix after addition");
	       for(int i=0;i<3;i++)
	       {
	    	   for(int j=0;j<3;j++) 
	    	   {
	    		   System.out.print(c[i][j]+" ");
	    	   }
	    	   System.out.println("");
	       }
	      
	       

	}

}
