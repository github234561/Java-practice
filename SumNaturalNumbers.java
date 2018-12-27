import java.io.*;

class SumNaturalNumbers
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer greater than 0 : ");
		String str = br.readLine();		
		int num = Integer.parseInt(str);
		int sum = 0;
		
		for( int i = 0 ; i < num + 1 ; i++ )
		{
			sum = sum + i;
		}			
		System.out.println("Sum is : " +sum);
	}
}
