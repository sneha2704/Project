package java8features;

import java.util.ArrayList;

//created by Sneha

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Sneha");
		list.add("Swetha");
		list.add("Jesi");
		list.add("Selvam");
		list.add("Pravin");
		list.add("Pushan");
		
		//count names with length less than 6
		//without using stream api
		
		int count = 0 ;
		
		for (String string : list)
		{
			if(string.length() < 6)
			{
				count++;
			}
		}
		
		System.out.println("There are "+count+" strings with length less than 6");
		
		//with stream api
		
		long count1 = list.stream().filter(str -> str.length() < 6).count();
		System.out.println("There are "+count1+" strings with length less than 6");
	}

}
