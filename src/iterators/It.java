package iterators;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

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
		
		ArrayList<Dog> pack = new ArrayList<>();
		pack.add(new Dog("Steiner", true, 20));
		pack.add(new Dog("Riley", false, 10));
		Iterator <Dog> it2 = pack.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next().age);
		}
	}
}

