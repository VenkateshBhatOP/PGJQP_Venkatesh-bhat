package collection;
import java.util.LinkedList;
import java.util.Iterator;
public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		     // create a LinkedList
		     LinkedList<String> list = new LinkedList<String>();

		     // Adding elements to the LinkedList
		     list.add("1");
		     list.add("2");
		     list.add("3");
		     list.add("4");

		     // Displaying LinkedList elements
		     System.out.println("LinkedList elements: "+list);

		     Iterator it = list.descendingIterator();

		     // Displaying list in reverse order
		     System.out.println("Elements in Reverse Order:");
		     while (it.hasNext()) {
		        System.out.println(it.next());
		     }
		  }
		
	}


