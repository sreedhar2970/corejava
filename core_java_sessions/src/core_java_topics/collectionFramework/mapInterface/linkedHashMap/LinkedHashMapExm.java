package core_java_topics.collectionFramework.mapInterface.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExm {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> mapObject = new LinkedHashMap<String, String>();
		
		mapObject.put("name1","Kamran");
		mapObject.put("name2", "Pavan");
		mapObject.put("name3","Azhar");
		mapObject.put("name4","Vamshee");
		mapObject.put(null,"Roshni");
		mapObject.put("name5", null);
		mapObject.put("name6","Subrat");
				
		for(Map.Entry<String,String> name : mapObject.entrySet()) {
			System.out.println("Key : " + name.getKey() + " ===== Value : " + name.getValue());
		}
		
		LinkedHashMap<String, String> newMapObject = new LinkedHashMap<String, String>();
		newMapObject.put("name7","Amit");
		newMapObject.put("name8","Sheik");
		newMapObject.put("name9","Mohan");
		
		mapObject.putAll(newMapObject);
		System.out.println("======== After adding new map object to already existing map object =============");
		for(Map.Entry<String,String> name : mapObject.entrySet()) {
			System.out.println("Key : " + name.getKey() + " ===== Value : " + name.getValue());
		}
		
		System.out.println("Value of key name6 : " +mapObject.get("name6"));
		mapObject.putIfAbsent("name12", "Ramesh");
		
		System.out.println("======== using putIfAbsent() =============");
		for(Map.Entry<String,String> name : mapObject.entrySet()) {
			System.out.println("Key : " + name.getKey() + " ===== Value : " + name.getValue());
		}
		
		mapObject.remove(null);
		System.out.println("======== after using remove(Object key) method =========================");
		for(Map.Entry<String,String> name : mapObject.entrySet()) {
			System.out.println("Key : " + name.getKey() + " ===== Value : " + name.getValue());
		}
	}
}
