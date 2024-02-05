package basic;

public class InAmsterdam extends Source {
	// Write Your Code Here..
	public int countAm(String str) {
		int count, len, repeated = 0;
		String lowerCaseStr = str.toLowerCase();

		String words[] = lowerCaseStr.split(" ");
		len = words.length;
		String word;
		for (int i = 0; i < len; i++) {
			word = words[i];
			count = 1;

			for (int j = (i + 1); j < (len - 1); j++) {
				if (word.equals(words[j])) {
					count++;
					for (int k = j; k < (len - 1); k++) {
						words[k] = words[k + 1];
					}
					len--;
					j--;
				}
			}
			if (count > 1) {
				repeated++;
				count = 0;
			}
		}

		return repeated;
	}

}