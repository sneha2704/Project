package string;

public class StringEx {
	
	public static void main(String[] args) {
		
		String s1 = new String("Hello User");
		System.out.println(s1);
		
		String str = "Welcome";
		System.out.println(str);
		
		String s2 = " ";
		String s3 = "welcome";
		String s4 ="    String Example      ";
		String s5 = "This is example of split function";
	
		//String methods
		System.out.println("length: "+str.length());
		
		System.out.println("charAt(3) : "+str.charAt(3));
		
		System.out.println("Substring: "+str.substring(3));
		
		System.out.println("Substring: "+str.substring(0,2));
		
		System.out.println("contains c : "+str.contains("c"));
		
		System.out.println("contains × : "+str.contains("×"));
		
		System.out.println("isEmpty: "+s2.isEmpty());
		
		System.out.println("isBlank : "+s2.isBlank());
		
		System.out.println("indexOf e: "+str.indexOf("e"));
	
		System.out.println("indexOf e: "+str.indexOf("e", 3));
		
		System.out.println("lastIndexOf e: "+str.lastIndexOf("e"));
		
		System.out.println("equals : "+str.equals(s3));
		
		System.out.println("equalsIgnoreCase : "+str.equalsIgnoreCase(s3));
		
		System.out.println("concat: "+str.concat(" User"));
		
		System.out.println(str);
		
		str = str.concat(" User");
		
		System.out.println(str);
		
		System.out.println("replace"+s1. replace('e','a'));
		
		System.out.println("uppercase : "+s3. toUpperCase());
		
		System.out.println("toLowercase : "+s1.toLowerCase());
		
		System.out.println("length before trim() : "+s4.length());
		
		s4 = s4.trim(); //removes leading and trailing spaces
		
		System.out.println("length after trim() : "+s4. length());

		String splitedString[] = s5.split(" ");
		
		System.out.println("count of words: "+splitedString.length);
		
		for(String string : splitedString)
		{
		System.out.println(string);
		}
		
		StringBuffer buffer = new StringBuffer("String Buffer example");
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder ("string builder example");
		System.out.println(builder);
		
}
}

