package collection;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap <Integer,String> a=new TreeMap<Integer, String>();
a.put(1, "Karnataka");
a.put(2,"Maharashtra");
a.put(3,"TamilNadu");

Set<Integer>keyset=a.keySet();

Iterator<Integer>setiterator=keyset.iterator();
while(setiterator.hasNext()) {
	
	Integer integer=(Integer)setiterator.next();
	System.out.println(a.get(integer));
	

}
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the state you want:");
n=s.nextInt();
if(n==1)
System.out.println(a.get(1));
else if(n==2)
System.out.println(a.get(2));
else if(n==3)
System.out.println(a.get(3));
else
	System.out.println("Error");

	}

}
