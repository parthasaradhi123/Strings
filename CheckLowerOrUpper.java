
public class CheckLowerOrUpper {

	public static void main(String[] args) 
	{
		String s = "InEuRoN";
		String s1 = "";
		
		int i =0;
		while(i<s.length())
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				s1 = s1+(char)(s.charAt(i)-32);
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				s1 = s1+(char)(s.charAt(i)+32);
			}
			else
				System.out.println("Someother special characters");
			i++;
		}
		System.out.println(s1);
		

	}

}
