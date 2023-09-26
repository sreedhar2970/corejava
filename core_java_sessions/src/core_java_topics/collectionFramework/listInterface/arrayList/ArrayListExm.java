package core_java_topics.collectionFramework.listInterface.arrayList;

import java.util.ArrayList;

public class ArrayListExm {

	public static void main(String[] args) {

		// creating the of ArrayList class
		ArrayList<String> listOfCities = new ArrayList<String>();
		ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
		
		// add(E e) is the method to add the element to the list object
		// adding String type data/element to the listOfCities object
		listOfCities.add("Pune");
		listOfCities.add("Hyderabad");
		listOfCities.add("Bangalore");
		listOfCities.add("Mumbai");
		listOfCities.add(null);
		listOfCities.add("Chennai");
		listOfCities.add("Nagpur");
		listOfCities.add("Hyderabad");
		listOfCities.add("Chennai");
		listOfCities.add("Nagpur");
		listOfCities.add("Raichur");
		
		System.out.println(listOfCities);
		
		System.out.println("==============================================");
		listOfNumber.add(34);
		listOfNumber.add(null);
		listOfNumber.add(42);
		listOfNumber.add(23);
		listOfNumber.add(98);
		listOfNumber.add(45);
		listOfNumber.add(34);
		listOfNumber.add(23);
		listOfNumber.add(56);
		System.out.println(listOfNumber);
		// adding an element at the specific index using add(int index, String element);
		listOfCities.add(4, "Bhubneswar");
		System.out.println(" =============== After adding a new element of String type at 4th index==============");
		// using for each loop to traverse through list of object
		for(String city : listOfCities) {
			System.out.println(city);
		}
		// adding an new element at the specific index
		System.out.println(" =============== After adding a new element of Integer type at 1th index==============");
		listOfNumber.add(1,100);
		for(Integer number : listOfNumber) {
			System.out.println(number);
		}
		// adding the new collection of String object at specific index using add(int index, Collection object)
		ArrayList<String> listOfNewCities = new ArrayList<String>();
		listOfNewCities.add("Raichur");
		listOfNewCities.add("Bidar");
		listOfNewCities.add("Gulburga");

		System.out.println("=========Adding new list of cities to already existing array list object at specfic index( 2nd index )====");
		listOfCities.addAll(2, listOfNewCities);
		for(String newCities : listOfCities) {
			System.out.println(newCities);
		}
		// adding new collection object to the already existing list of object
		ArrayList<String> listOfCity = new ArrayList<String>();
		listOfCity.add("Bellary");
		listOfCity.add("Mangalore");
		listOfCity.add("Mysore");
		System.out.println("========= Adding new list of cities to already existing array list object ====");
		listOfCities.addAll(listOfCity);
		for(String city : listOfCities) {
			System.out.println(city);
		}
		
		System.out.println("Size of an arrayList object : " +listOfCities.size());
		//listOfCities.clear();
		//System.out.println("size of an array list object after clearing all the elements : " + listOfCities.size());
		System.out.println("=======using set(int index, String element) we can add that element on specific index =======");
		
		listOfCities.set(8, "Hassan");
		for(String city : listOfCities) {
			System.out.println(city);
		}
		System.out.println("If we want to check whether list is empty or not : " +listOfCities.isEmpty());
		System.out.println("get the element of 6th index : " + listOfCities.get(6));
		System.out.println("remove element of 9th index : " + listOfCities.remove(9));
		System.out.println("========== After removing element of specific index =================");
		for(String city : listOfCities) {
			System.out.println(city);
		}
		listOfCities.remove("Hyderabad");
		for(String city : listOfCities) {
			System.out.println(city);
		}
		System.out.println(listOfCities.contains("Mangalore"));
		System.out.println(listOfCities.contains("Delhi"));
		System.out.println("============ After removing collection of objects ===================");
		listOfCities.removeAll(listOfCity);
		for(String city : listOfCities) {
			System.out.println(city);
		}	
	}
}