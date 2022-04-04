package methodexample;

public class TestCalculator {
   public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.x=100;
	cal.y=200;
	cal.sum1();
	int result=cal.sum2();
	System.out.println("store result"+result);
	System.out.println("call directly"+cal.sum2());
	int sum =cal.sum3(21, 23);
	System.out.println(sum);
	System.out.println(cal.sum3(45,32));
	
	cal.sum(12.55f, 13);
	cal.sum(10, 30);
	cal.sum(10, 20,30);
	cal.sum(12, 13.66f);
}
   
}
