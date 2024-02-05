package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<>();
		stack.push("Guava");
		stack.push("Mango");
		stack.push("Guava");
		stack.push("Apple");
		stack.push("Banana");
		stack.push(null);
		
		System.out.println("Stack : "+stack);
		System.out.println("Removing element : "+stack.pop());
		System.out.println("Stack after removing : "+stack);
		System.out.println("Search Mango : "+stack.search("Mango"));
		System.out.println("Search Watermelon : "+stack.search("Watermelon"));

	}

}
