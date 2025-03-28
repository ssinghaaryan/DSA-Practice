package Easy.Strings.Uncovered;

public class CheckPrefix {
	
	public static int checkPrefix(String sentence, String prefix) {
		
		String[] sentence_words = sentence.split("\\s+");
		
		for(int i = 0; i < sentence_words.length; i++) {
			
			if(sentence_words[i].startsWith(prefix)) {
				return i + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[]args) {
		
		System.out.println(checkPrefix("I love chicken burgers", "chi"));
		
	}

}
