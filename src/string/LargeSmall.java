package string;

public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Find Large and Small number in this Sentence";
		String[] strArray = str.split(" ");
		String small = strArray[0];
		String large = strArray[0];
		for(int i = 1; i < strArray.length; i++)
		{
			if(strArray[i].length() < small.length())
			{
				small = strArray[i];
			}
		}
		
		for(int i = 1; i < strArray.length; i++)
		{
			if(strArray[i].length() > large.length())
			{
				large = strArray[i];
			}
		}
		
		System.out.println(small);
		System.out.println(large);

	}

}
