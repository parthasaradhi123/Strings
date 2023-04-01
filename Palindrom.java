
public class Palindrom {

	public static void main(String[] args) 
	{
		String s1 ="poop";
		String s2 ="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2 = s2+s1.charAt(i);
		}
		
		//System.out.println(s2);
		
		if(s1.equals(s2))
		{
			System.out.println(s1+" It is a palindrom");
		}
		else
		{
			System.out.println(s1+" Is not a palindrom");
		}
		
		StringBuilder sb = new StringBuilder("nitin");
		StringBuilder s = sb.reverse();
		if(sb.equals(s))
		{
			System.out.println("it is a palindrom");
		}
		else
		{
			System.out.println("it is not a palindrom");
		}
	}

}
