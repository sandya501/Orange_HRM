package FAQS;

public class ReverseString
{
	public static void main(String[] args)
	{

		
		String str ="Sudhakar";
		
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println("Reversed string is:");
		System.out.println(sb.reverse().toString());
	}
}