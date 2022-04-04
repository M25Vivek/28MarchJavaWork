package org;

public class TestArray {
	public static void main(String[] args) {
		//declare
		String[] names;
		//initantiate
		names=new String[5];//allocation of memory
		names[0]="Vivo";
		names[1]="Oppo";
		names[2]="OnePlus";
		names[3]="Poco";
		names[4]="IooQ";
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		//enhanced for loop 
		System.out.println("enhanced for loop");
		for(String temp:names)
		{
			System.out.println(temp);
		}
		
		
		
		
		String[] cities= {"Mumbai","Chennai","Pune","Delhi","Punjab"};
		for(int i=0;i<cities.length;i++)
		{
			System.out.println(cities[i]); 
		}
		
		int[] nums=new int[5];
		nums[0]=100;
		nums[1]=200;
		nums[2]=300;
		nums[3]=400;
		nums[4]=500;
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	

}
}

