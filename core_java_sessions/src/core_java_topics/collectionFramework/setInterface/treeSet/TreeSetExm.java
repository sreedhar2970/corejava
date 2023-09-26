package core_java_topics.collectionFramework.setInterface.treeSet;

import java.util.TreeSet;

public class TreeSetExm {

	public static void main(String[] args) {

		TreeSet<Integer> setObject1 = new TreeSet<Integer>();
		setObject1.add(101);
		setObject1.add(109);
		setObject1.add(108);
		setObject1.add(102);
		setObject1.add(105);
		
		for(Integer number : setObject1) {
			System.out.println(number);
		}
		
		System.out.println(setObject1.ceiling(100));
		System.out.println(setObject1.floor(100));
		System.out.println(setObject1.first());
		System.out.println(setObject1.last());
		System.out.println(setObject1.isEmpty());
		//setObject1.clear();
		System.out.println("Size of setObject : " + setObject1.size());
	
	}

}
