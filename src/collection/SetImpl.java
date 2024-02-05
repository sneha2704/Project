package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hashset = new HashSet<>();
		hashset.add("Riya");
		hashset.add("Ravi");
		hashset.add("Riya");
		hashset.add("Meera");
		hashset.add(null);
		
		System.out.println("implementing HashSet : ");
		
		for(String string : hashset)
		{
			System.out.println(string);
		}
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Mango");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Guava");
		linkedHashSet.add(null);
		
		System.out.println("Implementing LinkedHashSet : \n"+linkedHashSet);
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Pizza");
		treeSet.add("Burger");
		treeSet.add("Coffee");
		treeSet.add("Burger");
		//treeSet.add(null);
		
		System.out.println("Implementing TreeSet : \n"+treeSet);

	}

}
