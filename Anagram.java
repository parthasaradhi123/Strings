import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		// what ever the alphabets are used in String A are present in String B then it is called Anangram
		
		String s1 = "anagramm";
		String s2 ="marganaa";
		
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if(Arrays.equals(c1, c2))
        {
        	System.out.println("It is an Anagram");
        }
        else
        {
        	System.out.println("It is not an Anagram");
        }
		
		
	}

}
