
public class CopyStrings {

	public static void main(String[] args) 
	{
		
		String s1 ="Ineuron";
		String s2 = "";
		int n = s1.length();
	
 
//		for(i=0;i<n-1;i++);
//		{
//			//s2 = s2+s1.charAt(i);
//			System.out.println(s1.charAt(i));
//			System.out.println(s1.indexOf(i));
//			
//		}
		int i =0;
		while (i<n)
		{
			s2 = s2+s1.charAt(i);
			i++;
		}
		System.out.println("The Main string S1 is : " + s1);
		System.out.println("The copied String s2 is : "+ s2);
	}

}
