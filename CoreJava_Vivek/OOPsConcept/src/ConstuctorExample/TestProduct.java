package ConstuctorExample;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product p1=new Product();
        p1.name="mobile";
        p1.brand="vivo";
        p1.price=25000;
        p1.qty=100;
        
        Product p2=new Product ("A","B",0.3);
        System.out.println(p2.name);
        Product p6=new Product()
	}

}
