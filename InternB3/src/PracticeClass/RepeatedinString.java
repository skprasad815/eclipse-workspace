package PracticeClass;

public class RepeatedinString {

	public static void main(String[] args) {
		
	 String str= "saturday";
	int count;
	System.out.println("the length is "+str.length());
		System.out.println("The repeated characters are");
	char[] ch= str.toCharArray();
		for(int i=0;i<str.length();i++) {
			count=1;
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
			ch[j]=0; //to avoid printing the visited characters
			
			if(count>1)
			{
			System.out.println(ch[i]);
				}
	
		}
		}
		
		
	}

}
}