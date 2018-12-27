import java.io.*;

class PositiveOrNegative
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		String str = br.readLine();		
		double num = Double.parseDouble(str);
		if ( num >= 0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}
}
