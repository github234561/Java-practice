import java.io.*;

class DigitsInInt
{		
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer greater than 0 : ");
		String str = br.readLine();		
		int num = Integer.parseInt(str);
		int count = 0;
		while(num != 0)
		{
			num /= 10;
			count++;
		}
		System.out.println("No of digits: " + count);		
	}
}
