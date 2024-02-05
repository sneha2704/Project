package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertionMethods {

	@Test
	public void test() {
		
		int a = 10;
		int b = 20;
		
		String str1 = new String("Sneha");
		String str2 = new String("Sneha");
		
		String str3 = new String("Welcome");
		String str4 = new String("Welcome");
		String str5 = null;
		
		//assertNotSame(str1, str2);
		
		//assertSame(str3, str4);
		
		//assertTrue(a == b);
		
		//assertFalse(a == b);
		
		//assertNull(str5);
		
		//assertNotNull(str1);
		
		String a1[] = {"one", "two", "three"};
		String a2[] = {"one", "two", "three"};
		
		assertArrayEquals(a1, a2);
	}

}
