import java.io.*;

class LeapYear
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer value: ");
		String str = br.readLine();		
		int leapYear = Integer.parseInt(str);
		if ( (leapYear%4) == 0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a leap year");
	}
}
