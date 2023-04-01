/*
-> The basic login is the small letter will star from a to z and ascii values will start from 97 to 122
-> The capital letters will start from A to Z and its Ascii values will star from 65 to 90.
-> So if I want to convert a small letter to upper letter then the logic should be any small letter ch -32
   and then type cast into (char) then it will convert it into capital letter.
->Same goes for Capital letters if you wanna convert any Capital letter into samll letter then do this
   char+32 and do typecasting it will be converted into small letter.
*/
import java.util.*;
public class LowerToUpperCase {

	public static void main(String[] args)
	{
		//String s1 = "ineuron";
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Please enter the lowercase value to convert into to upper case : ");
		String s1 = sc.nextLine();
		String s2 ="";
		
		char ch = 'a'; // a = 97 and 97-32 = A // logic to convert lower letters to higher letters
		System.out.println(ch);
		ch = (char)(ch-32);
		System.out.println(ch);
		
		int i =0;
		while(i<s1.length())
		{
			s2=s2+(char)(s1.charAt(i)-32);
			i++;
		}
		System.out.println(s2);
	}

}
