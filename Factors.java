import java.io.*;

class Factors
{		
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter a number: ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
						
		for(int i = 1 ; i <= num/2 ; i++)
		{
			if(num % i == 0)
			{	
				System.out.print(i + ", ");					
			}
		}	
		System.out.print(num);		
	}
}


