package collection;

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("Apple");
		linkedList.add("Mango");
		linkedList.add("Banana");
		linkedList.add(1 , "Grapes");
		linkedList.add("Apple");
		linkedList.add(null);
		
		for(String string : linkedList)
		{
			System.out.println(string);
		}
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		
		linkedList2.add("Jasmine");
		linkedList2.add("Lilly");
		
		linkedList.addAll(linkedList2);
		System.out.println("Adding List2 in List1 : "+linkedList);
	}

}
