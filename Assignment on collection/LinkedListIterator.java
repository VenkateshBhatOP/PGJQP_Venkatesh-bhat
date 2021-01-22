package collection;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		    // Create a LinkedList
		    LinkedList<String> linkedlist = new LinkedList<String>();
		 
		    // Add elements to LinkedList
		    linkedlist.add("Venkatesh");
		    linkedlist.add("Rajath");
		    linkedlist.add("Prajwal");
		    linkedlist.add("Rahul");
		    linkedlist.add("Rohit");
		 
		    // Obtaining Iterator
		    Iterator<String> it = linkedlist.iterator();
		 
		    // Iterating the list in forward direction
		    System.out.println("LinkedList elements:");
		    while(it.hasNext()){
		    	String s=it.next();
		    	System.out.println(s);
		    	
		    	if(s.equals("Rajath")){
		    		it.remove();
		    		
		    	}
		      
		       
		    
		
		    }
		    System.out.println(linkedlist);
		    linkedlist.add(4,"Sohan");
		    System.out.println(linkedlist);
		    
		 }
		
	}


