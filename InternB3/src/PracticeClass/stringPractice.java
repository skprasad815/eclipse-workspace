package PracticeClass;

public class stringPractice {

	public static void main(String[] args) {

		// to lower case
		String str = "This IS ME";
		String name = str.toLowerCase();
		System.out.println(name);

		// replace space with _
		String Hi = "Hi how are you";
		Hi=Hi.replace(" ","_");
		System.out.println(Hi);
		
		// replace a word in sentence
		String A = "Hi <|how|> are you";
		A=A.replace("<|how|>","<|where|>");
		System.out.println(A);
		
		//to detect double & triple space 
		
		String q= "Hi  what are    you doing";
		System.out.println(q.indexOf("  "));
		System.out.println(q.indexOf("   "));
		
		//write a prog to format using escape sequence letter
		
		String letter = "Dear Sanjay,\n\t This Java Course is Nice.\n\t Thanks";
		
		System.out.println(letter);
		
	}

}
