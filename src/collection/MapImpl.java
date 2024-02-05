package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;


public class MapImpl {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<>();
		map.put("In", "India");
		map.put("Br", "Brazil");
		map.put("De", "Germany");
		map.put("Fr", "France");
		map.put(null, null);
		map.put(null, null);
		
		System.out.println("Implementing HashMap : ");
		
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			System.out.println("Country code : "+entry.getValue());
		}
		
		System.out.println(map.get("Br"));
		
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("BR102", "Coffee");
		treeMap.put("L207", "Chole-Puri");
		treeMap.put("D305", "Paste");
		treeMap.put("BR105", "Tea");
		treeMap.put("L212", "Biriyani");
		//treeMap.put(null, null);
		
		System.out.println("Implementing TreeMap : ");
		
		for(Map.Entry<String, String> entry : treeMap.entrySet())
		{
			System.out.println("Code : "+entry.getKey()+", Menu : "+entry.getValue());
		}
		
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("BR102", "Coffee");
		hashtable.put("D102", "Biriyani");
		hashtable.put("L27", "Pizza");
		hashtable.put("D106", "Sandwitch");
		//hashtable.put(null, null);
		
		System.out.println("Implementing Hashtable : ");
		
		for(Map.Entry<String, String> entry : hashtable.entrySet())
		{
			System.out.println("Code : "+entry.getKey()+"Menu : "+entry.getValue());
		}

	}

}
