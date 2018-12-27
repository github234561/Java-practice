import java.io.*;

class MultiplicationTable
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer greater than 0 : ");
		String str = br.readLine();		
		int num = Integer.parseInt(str);
				
		for( int i = 1 ; i < 11 ; i++ )
		{
			int prod = num * i;
			System.out.println( num + " X " + i + " = " + prod);
		}			
	}
}
