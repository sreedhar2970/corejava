package core_java_topics.collectionFramework.mapInterface.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExm {

	public static void main(String[] args) {

		TreeMap<Integer,String> mapObject = new TreeMap<Integer,String>();
		mapObject.put(107, "Sai Sharan");
		mapObject.put(103, "Azhar");
		mapObject.put(101, "Pavan");
		mapObject.put(104, "Roshni");
		mapObject.put(102, "Mohan");
		mapObject.put(106, "Sangmesh");
		mapObject.put(105, "Vamshi");
		
		for(Map.Entry<Integer, String> name : mapObject.entrySet()) {
			System.out.println("key : " + name.getKey() + "===== Value : " + name.getValue());
		}
		
		TreeMap<String,Integer> mapObject2 = new TreeMap<String, Integer>();
		mapObject2.put("Sai Sharan",107);
		mapObject2.put("Azhar",101);
		mapObject2.put("Pavan",103);
		mapObject2.put("roshni",105);
		mapObject2.put("Mohan",104);
		mapObject2.put("Sangmesh",102);
		mapObject2.put("Vamshi",106);
		
		System.out.println("========== sorting based on name(key)==========================");
		for(Map.Entry<String, Integer> name : mapObject2.entrySet()) {
			System.out.println("key : " + name.getKey() + "===== Value : " + name.getValue());
		}
		TreeMap<Integer,String> mapObject3 = new TreeMap<Integer,String>();
		mapObject3.put(109, "Ramesh");
		mapObject3.put(110, "Sheik");
		mapObject3.put(108, "Amit");
		
		mapObject.putAll(mapObject3);
		System.out.println("================ Adding new map object(mapObject3) to already existing map object(mapObject) ========");
		for(Map.Entry<Integer, String> name : mapObject.entrySet()) {
			System.out.println("key : " + name.getKey() + "===== Value : " + name.getValue());
		}
		
		mapObject.remove(102);
		System.out.println("================ after removing from the mapObject ========");
		for(Map.Entry<Integer, String> name : mapObject.entrySet()) {
			System.out.println("key : " + name.getKey() + "===== Value : " + name.getValue());
		}
	}
}
