package core_java_topics.collectionFramework.mapInterface.hashMap;

import java.util.HashMap;
import java.util.Map;
public class HashMapExm {

	public static void main(String[] args) {
		Map<String,String> mapObject1 = new HashMap<String,String>();
		// to add the key and value pair, we have to use put(Key,value)
		mapObject1.put("name1", "Kamran");
		mapObject1.put("name2", "Manoj");
		mapObject1.put("name3", "Amit");
		mapObject1.put("name4","Pavan");
		mapObject1.put("name5","Sangmesh");
		mapObject1.put("name6","Subrat");
		mapObject1.put("name7","Roshni");
	//	Map<String,String> mapobject = new HashMap<String,String>();
		//mapobject.put("name1","sreedhar");
			
		// traversing through map object
		System.out.println("================= using entrySet() =========================");
		for(Map.Entry<String,String> name : mapObject1.entrySet()) {
			System.out.println("key : " + name.getKey() + " === Value : " + name.getValue() );
		}
		
		//for(Map.Entry<String,String> name :mapobject1.entrySet()){
		//System.out.println("Key : "+name.getKey() + "====Value : "+name.getValue() );
		HashMap<Integer,String> mapObject2 = new HashMap<Integer, String>();
		mapObject2.put(101, "Mango");
		mapObject2.put(102, "Apple");
		mapObject2.put(103, "Banana");
		mapObject2.put(104, "Pine-Apple");
		mapObject2.put(105, "Custard-Apple");
		// traversing through map object
		System.out.println("================= using entrySet() =========================");
		for(Map.Entry<Integer, String> fruit : mapObject2.entrySet()) {
			System.out.println("key : " + fruit.getKey() + " === Value : " + fruit.getValue() );
		}
		
		mapObject1.putIfAbsent("name10", "Arnab Saha");
		System.out.println("================= using entrySet() =========================");
		for(Map.Entry<String, String> fruit : mapObject1.entrySet()) {
			System.out.println("key : " + fruit.getKey() + " === Value : " + fruit.getValue() );
		}
		HashMap<String, String> mapObject3 = new HashMap<String, String>();
		mapObject3.put("name8","Ramesh");
		mapObject3.put("name9", "Azhar");
		mapObject3.put("name11","Sai");
		
		mapObject1.putAll(mapObject3);
		System.out.println("========= after adding new map object to already existing object ==========");
		for(Map.Entry<String, String> fruit : mapObject1.entrySet()) {
			System.out.println("key : " + fruit.getKey() + " === Value : " + fruit.getValue() );
		}
		
		//mapObject1.clear();
		System.out.println("size of map object ============== " + mapObject1.size());
		System.out.println(mapObject1.isEmpty());
		System.out.println("Returns the value on the basis of key passed : " + mapObject1.get("name4"));
		System.out.println(mapObject1.getOrDefault("name12", "Suleman"));
		
	}
}