//Create an array of number type
//accept value from the user for array
//multiply each element by 2 n then store in array
//display all the elements of array
package org;

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of elements");
	 int n=sc.nextInt();
	int[]arr=new int[n];
	System.out.println("Enter elements of array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();

	}
	//for printing arrays
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=arr[i]*2;
		for(int i1=0;i1<arr.length;i1++)
			System.out.println("elements "+arr[i1]);
	}

}
}
