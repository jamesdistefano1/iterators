package iterators;

import java.util.Iterator;
import java.util.ArrayList;

public class It {
	public static void main(String args[]) {
		ArrayList <Integer> list1 = new ArrayList <Integer>();
		list1.add(4);
		list1.add(7);
		list1.add(2);
		Iterator <Integer> it1 = list1.iterator(); 
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}

