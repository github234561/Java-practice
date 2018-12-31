import java.io.*;

class Prime
{		
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter a number: ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		boolean flag = false;
		
		for(int i = 2 ; i <= num/2 ; i++)
		{
			if(num % i == 0)
			{	
				flag = true;
				break;
			}
		}			
		if(flag)
			System.out.println("Not a prime number");
		else
			System.out.println("Prime Number");
	}
}

