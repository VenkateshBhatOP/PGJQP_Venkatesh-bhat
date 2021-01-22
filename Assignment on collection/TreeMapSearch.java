package collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap <Integer,String> h=new TreeMap<Integer, String>();
h.put(1, "Venkatesh");
h.put(3, "Divya");
h.put(2, "Yasmeen");
h.put(4, "Rishi");

Set<Integer> keyset=h.keySet();

Iterator<Integer>setiterator=keyset.iterator();
while(setiterator.hasNext()) {
	Integer integer=(Integer)setiterator.next();
	System.out.println(h.get(integer));
}
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Select a name you want:");
n=sc.nextInt();

if(n==1)	
System.out.println(h.get(1));
else if(n==2)
	System.out.println(h.get(2));
else if(n==3)
	System.out.println(h.get(3));
else if(n==4)
	System.out.println(h.get(4));
else
	System.out.println("error");
	}

}
