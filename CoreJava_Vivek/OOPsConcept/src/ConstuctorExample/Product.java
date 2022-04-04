package ConstuctorExample;

public class Product {
     String name;
     String brand;
     int price;
     int qty;
     
     public Product() {
    	 System.out.println("person constr");
    	 
     }
     public Product(String name,String brand,int price, int qty)
        this.name=name;
        this.brand=brand;
         if(price<=0)
         {
        	 System.out.println("Price can't be 0");
        	 
         }else {
        	 this.price=price;
          }
          this.qty=qty;
          }
        public Product(String name,String brand)
        {
        	this.name=name;
        	this.brand=brand;
        }
        }