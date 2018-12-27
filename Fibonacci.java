import java.io.*;

class Fibonacci
{		
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer greater than 0 : ");
		String str = br.readLine();		
		int num = Integer.parseInt(str);
		int a = 0;
		int b = 1;	
		int sum = 0;
				
		while(num > sum)
		{
			sum = a + b ;
			a = b ;
			b = sum;
			if( sum > num )
				break;				
			System.out.print(sum + ",");
		}
	}
}
