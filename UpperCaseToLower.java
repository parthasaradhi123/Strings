import java.util.*;

public class UpperCaseToLower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value you wanna convert it into upper case : ");
		String s1 = sc.nextLine();
		String s2 = "";
		
		//The logic if we add + 32 to any lower case letter and type cast it with char it will become a upper case
		//  letter 65 = 'a', 65+32= (char)97-->'A' see simple.
		
		int i =0;
		while(i<s1.length())
		{
			s2 = s2+(char)(s1.charAt(i)+32);
			i++;
		}
		System.out.println(s2);
		

	}

}
