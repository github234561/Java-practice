import java.io.*;

class Armstrong
{	
	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Armstrong armStr = new Armstrong();
		
		System.out.print("Enter a number: ");
		String str = br.readLine();
		int length = str.length();
		int num = Integer.parseInt(str);
		int numCheck = num;
		int digit = 0, sum = 0, temp = 1;
		
		while(num > 0)
		{
			for(int i = 0; i < length; i++)
			{
				digit = num % 10;
				temp *= digit;				
			}
			sum += temp;
			num /= 10;
			temp = 1;
		}
				
		if(sum == numCheck)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an armstrong number");
	}	
}


