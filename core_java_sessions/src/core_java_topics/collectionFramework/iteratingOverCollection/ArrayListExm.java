package core_java_topics.collectionFramework.iteratingOverCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExm {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Manoj");
		list.add("Kamran");
		list.add("Azhar");
		list.add("Mohan");
		list.add("Amit");
		list.add("Vamshi");
		list.add("Shubham");
		list.add("Ramesh");
		
		// 1st way to iterate over the list of object using for-each loop
		for(String name : list) {
			System.out.println(name);
		}
		// 2nd way to iterate over the list using iterator();
		System.out.println("============ using iterator() method ===========");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// 3rd way using listIterator() method
		System.out.println("============ using listIterator() method ===========");
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		// assignment use for loop to traverse through collection of list.....
	}

}
