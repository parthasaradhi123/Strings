//Such a string in which where Alphabets are involved.
//Ex: A QUICK FOX JUMPS OVER  LAZY DOG
public class Pangram {

	public static void main(String[] args) 
	{
		String s1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
		boolean p = false;
		
		s1 = s1.replace(" ", "");
		
	    char[] ch = s1.toCharArray();
	   
	    int n = ch.length;
	    
	    int[] ar = new int[26];
	    int i = 0;
	    
	    while (i<n)
	    {
	    	int index = ch[i]-65;
	    	ar[index]++;
	     
	    	 
	    	i++;
	    }
	  
	     
	    
	    
 
////	    for(i =0; i<n;i++);
////	    {
////	    	//int index = ch[i]-65;
////	    	//ar[index]++;
////	    	System.out.println(ch[i]);
////	    	
////	         //or
////	    	
////	    	//ar[ch[i]-65]++;
////	    	
////	    }
//	    
	    for(int j = 0;j<ar.length;j++)
	    {
	    	if(ar[j]==0)
	    	{
	    		System.out.println("It is not a pangram");
	    		p = true;
	    	}
	    }
	    if(p == false)
	    {
	    	System.out.println("It is a panagram");
	    }
		
	}

}
