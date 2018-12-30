import java.io.*;

class PowerNum
{		
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter a number: ");
		String strNum = br.readLine();			
		
		System.out.print("Enter the power of the number that you want to find: ");
		String strPower = br.readLine();
		
		int num = Integer.parseInt(strNum);
		int power = Integer.parseInt(strPower);
		int result = 1;
		
		for(int i = 0; i < power; i++)
		{
			result *= num;
		}
		System.out.print("Required power of the given number is : " + result);		
	}
}
