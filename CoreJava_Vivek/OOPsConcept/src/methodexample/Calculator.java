package methodexample;

public class Calculator {
 int x;
 int y;
 //accepts nothing returns nothing , just executed
 public void sum1() {
	 System.out.println(x+y);
 }
 //accepts nothing returns something , just executed
 public int sum2() {
	 return(x+y);
 }
 //accepts something returns something , just executed
 public int  sum3(int a , int b) {
	 return(a+b);
 }

 //Overloading
 //we can have multiple methods with same name with a class provided they differ in
 //1 number of arguments /parameters
 //2 order of paras
 //3 typr of paras
 //return type of method is not considered in method overloading
 public void sum(int a ,int b) {}
 public void sum(int a, int b , int x) {}
 public void sum (int a, float b) {}
 public void sum ( float a, int b) {}
 
 }
