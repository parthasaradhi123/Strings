
public class String1 {

	public static void main(String[] args) 
	{
//		String s1 = "sachin";
//		s1.concat("Tendulkar");
//		System.out.println(s1);
		
//		StringBuilder s1 = new StringBuilder("Saching ");
//		s1.append("Tendulkar");
//		System.out.println(s1);
		
		
//		String s2 = "Sachin";
//		String s1 = "Sachin";
		
//		String s3 = new String("Sachin");
//		String s4 = new String("Sachin");
		
//		System.out.println(s1 == s2);
		
	//	System.out.println(s3 == s4);
		
//		String s = new String("Sachin");
//		s.concat("tendulkar");
//		s = s.concat("ind");
//		s = "sachintendulkar";
//		System.out.println(s); // the out is coming from scp not from heap area.
		
		String s = new String("Sachin");
		System.out.println(s.length()); // .length() it is a String method.
		
		int[] ar = {1,2,4,5,6,7,8};
		System.out.println(ar.length);  // length it is an array property
		
	//	System.out.println(s[3]); // ce
		System.out.println(s.charAt(3));
		
	   // System.out.println(s.charAt(-1)); :-->StringOutOfBoundsException
	   // System.out.println(s.charAt(7)); :-->StringOutOfBoundsException
		
		
		
		
		
	}

}
