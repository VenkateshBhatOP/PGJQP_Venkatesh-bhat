package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.IntStream;

class SuperMarket {
String productname;
int quantity;
int price;

	public SuperMarket(String productname, int quantity, int price) {
	super();
	this.productname = productname;
	this.quantity = quantity;
	this.price = price;
}
	
	
	@Override
	public String toString() {
		return "Product name=" + productname + "\t Quantity=" + quantity + "\tprice=" + price + "\n";
	}
}
 class Product{
	

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <SuperMarket> list=new ArrayList<SuperMarket>();
list.add(new SuperMarket("Shampoo",2,400));
list.add(new SuperMarket("Tea Bag",1,100));
System.out.println(list);
double total=0.0;

Iterator<SuperMarket>listiterator=list.listIterator();
while(listiterator.hasNext()) {
	SuperMarket s=listiterator.next();
	total+=(s.quantity*s.price);
}
System.out.println("Total amount:" +total);
	}
}

