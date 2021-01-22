package collection;

import java.util.ArrayList;

public class ReplaceSecondElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> a=new ArrayList<String>();
a.add(0, "Karnataka");
a.add(1,"Delhi");
a.add(2,"TamilNadu");
a.add(3,"Kerala");
System.out.println(a);
a.set(1, "Andra Pradesh");
System.out.println(a);
	}

}
