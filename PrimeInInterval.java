import java.io.*;

class PrimeInInterval
{		
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the first number: ");
		String str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		System.out.print("Enter the second number: ");
		String str2 = br.readLine();
		int num2 = Integer.parseInt(str2);		
		
		boolean flag = false;
		
		while(num1 < num2)
		{	
			for(int i = 2 ; i <= num1/2 ; i++)
			{
				if(num1 % i == 0)
				{	
					flag = true;
					break;
				}
			}		
			if(!flag)
			{	
				System.out.print( num1 + ", ");
			}
			num1++;	
			flag = false;
		}
	}
}


