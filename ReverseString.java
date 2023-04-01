
public class ReverseString {

	public static void main(String[] args)
	{
//		StringBuilder sb = new StringBuilder("partha");
//		System.out.println(sb.reverse());   dont use inbuilt methods.
		
		String s1 = "java ineuron"; //"partha";
		String s2 = "";
		
		int i = s1.length()-1;
		while(i>=0)
		{
			s2 = s2+(s1.charAt(i));
			i--;
		}
		System.out.println(s1);
		System.out.println(s2);


	
//	StringBuilder s3 = new StringBuilder("java ineuron");
//	 System.out.println(s3.reverse());
	 
		String s3 = "java ineuron";
		String s4 = "";
		
		String s5[] = s3.split(" ");
		
		for(String ele:s5)
		{
			 for(int i1=ele.length()-1;i1>=0;i1--)
			 {
				 s4 = s4+ele.charAt(i1);
			 }
			 s4=s4+" ";
		}
		
		System.out.println(s4);
		
		// ineuron java --> java ineuron
		String ss = "ineuron java";
		String ss1 = "";
		String ar[] = ss.split(" ");
		
		for(int i2 = ar.length-1;i2>=0;i2--) // here we are not going to the inner loop are going to traverse
// each element here we are spliting the two words in to array and 
			// 0 location -> ineuron
			// 1 location -> java
			// now the loop will run two times because the loop length is ar.length = 2 and we are running it 
			// back so ar[1] we wil get java and we will add +" " to java and next ar[0] will take it and print it thats it.			
		{
			ss1 = ss1+ar[i2]+" ";
		}
		System.out.println(ss);
		System.out.println(ss1);
		
	 
	}	

}
