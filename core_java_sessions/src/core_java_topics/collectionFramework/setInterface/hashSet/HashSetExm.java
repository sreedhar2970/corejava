package core_java_topics.collectionFramework.setInterface.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExm {

	public static void main(String[] args) {
		
		HashSet<String> setObject = new HashSet<String>();
		// to add the element to set object using add(Element e) method
		setObject.add("Hyderabad");
		setObject.add("Bangalore");
		setObject.add("Pune");
		setObject.add("Mumbai");
		setObject.add("Chennai");
		setObject.add("Pune");
		setObject.add("Hyderabad");
		
		// to iterate through set object
		Iterator<String> itr = setObject.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// creating another hash set object
		HashSet<String> setObject1 = new HashSet<String>();
		setObject1.add("Chandigarh");
		setObject1.add("Bhubneshwar");
		setObject1.add("Raichur");
		setObject1.add("Hyderabad");
		System.out.println("========== creating new set object(setObject1) ===================");
		Iterator<String> itr1 = setObject1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		setObject.addAll(setObject1);
		System.out.println("====== After adding new set object(setObject1) to already existing set object(setObject) ======");
		Iterator<String> itr2 = setObject.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		//setObject.clear();
		System.out.println("Size of setObject : " + setObject.size());
		System.out.println(setObject.contains("Raichur"));
		System.out.println(setObject.isEmpty());
		setObject.remove("Pune");
		System.out.println("=========== after removing the element using remove(Object e) method ==================");
		Iterator<String> itr3 = setObject.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		setObject.removeAll(setObject1);
		System.out.println("========= After removing setObject1 elements from setObject using removeAll(Collection obj) =========");
		Iterator<String> itr4 = setObject.iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
	
	}
}
