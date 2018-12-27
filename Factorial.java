import java.io.*;

class Factorial
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer greater than 0 : ");
		String str = br.readLine();		
		int num = Integer.parseInt(str);
		int prod = 1;
		
		for( int i = num ; i > 0 ; i-- )
		{
			prod = prod * i;
		}			
		System.out.println("Factorial is : " +prod);
	}
}
