package TestIfElse;

public class TestIfElse {

	public static void main(String[] args) {
		int a,b;
		a=10;b=20;
		if(a>b)
		{
			System.out.println("a is bigger");
		}
		else if (b>a)
		{
			System.out.println("b is bigger");
		}
		else
			System.out.println("both are equal");

	}

}
//if (condition1 && condition2)||if(cond1||cond2)