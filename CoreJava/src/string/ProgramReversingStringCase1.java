package string;

public class ProgramReversingStringCase1
{
	public static void main(String[] args) 
	{
		String s1="PWJava";
		String s2 ="";
		
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("Before Reversing = " + s1);
		System.out.println("After Reversing = " + s2);
	}
}
