import java.io.*;

class PalindromeString
{		
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter a string: ");
		String reverse = "";
		String str = br.readLine();
		int length = str.length();			
		
		for ( int i = length - 1; i >= 0; i--)	
		{
		reverse = reverse + str.charAt(i);
		}
		
		if (str.equals(reverse))
		{
			System.out.println("Palindrome");
		}
			
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
