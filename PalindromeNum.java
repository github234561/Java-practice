import java.io.*;

class PalindromeNum
{		
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter a number: ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int initialNum = num;
		
		int lastDigit = 0, newNum = 0;		
		
		while(num > 0)
		{
			lastDigit = num % 10;
			newNum = newNum * 10 + lastDigit;
			num = num / 10;			
		}
		
		if(newNum == initialNum)
		{
			System.out.println("Palindrome");
		}	
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
