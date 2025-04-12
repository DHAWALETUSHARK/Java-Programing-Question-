package basicQuestions;

public class LongestWord {

	public static void main(String[] args) {
		
		String text = "My name is Tushar";
		
		String[] words =text.split(" ");
		
		String longestWord ="";
		
		for(String word :words)
		{
			if(word.length() > longestWord.length())
			{
				longestWord = word;
			}
		}
		System.out.println("Longest Word : "+longestWord);
	}

}
