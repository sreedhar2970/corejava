package core_java_topics.collectionFramework.listInterface.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExm {

	public static void main(String[] args) {

		// List<E> list = new LinkedList<E>();
		LinkedList<String> listOfNames = new LinkedList<String>();
		
		listOfNames.add("Kamran");
		listOfNames.add("Amit");
		listOfNames.add("Sheik");
		listOfNames.add("Manoj");
		listOfNames.add("Vamshi");
		listOfNames.add("Ramesh");
		listOfNames.add("Roshni");
		listOfNames.add("Mohan");
		listOfNames.add("Azhar");
		listOfNames.add("Shubham");
		listOfNames.add("Sarawad");
		listOfNames.add("Subrat");
		listOfNames.add("Manoranjan");
		
		
		//using for-each to traverse through linkedList object
		System.out.println("================ traversing through linkedlist object =============");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		listOfNames.add(null);
		System.out.println("================ after adding null element traversing through linkedlist object =============");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		listOfNames.add("Sheik");
		System.out.println("================ after adding duplicate element traversing through linkedlist object =============");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		System.out.println("================ after adding element on specific index and traversing through linkedlist object =============");
		listOfNames.add(4, "Farhan");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		
		LinkedList<String> listOfName = new LinkedList<String>();
		listOfName.add("Fazlur");
		listOfName.add("Neha Tyagi");
		listOfName.add("Gaurav");
		listOfNames.addAll(listOfName);
		
		System.out.println("================ after adding new list object traversing through linkedlist object =============");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		
		LinkedList<String> listObject = new LinkedList<String>();
		listObject.add("Anish");
		listObject.add("Ashish");
		listObject.add("Rajan Raman");
		
		listOfNames.addAll(5, listObject);
		System.out.println("================ after adding new list object at specifc index and traversing through linkedlist object =============");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		System.out.println("================ Adding the element using addFirst() method ======================");
		listOfNames.addFirst("Parvez");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		System.out.println("================ Adding the element using addLast() method ======================");
		listOfNames.addLast("Suresh");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		//listOfNames.clear();
		System.out.println("size of the list After removing elements using clear() : " + listOfNames.size());
		System.out.println("========= using set to replace the old element with the new element using set(int index, String element)========");
		listOfNames.set(18,"Venkat");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		System.out.println(listOfNames.contains("kamran"));
		listOfNames.remove(8);
		listOfNames.remove("Sheik");
		System.out.println("=========== after using remove(int index) and remove(Object obj)=================================================");
		for(String name : listOfNames) {
			System.out.println(name);
		}
		System.out.println("To get the element of specific index : " + listOfNames.get(5));
		System.out.println("To get the first element of list object : " + listOfNames.getFirst());
		System.out.println("To get the last element of the list object : " + listOfNames.getLast());
		System.out.println("======================= Using listIterator() ==========================================");
		ListIterator<String> itr = listOfNames.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		listOfNames.removeAll(listObject);
		System.out.println("========== After removing collection object =========================");
		for(String name : listOfNames) {
			System.out.println(name);
		}
	}

}
