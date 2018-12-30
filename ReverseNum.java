import java.io.*;

class ReverseNum
{		
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer: ");
		String str = br.readLine();	
		int length = str.length();
		int num = Integer.parseInt(str);
		int arr[] = new int[11];
		
		if( num < 0 )
			length = length - 1;
		
		for(int i = 0; i < length; i++)
		{
			arr[i] = num % 10;
			num /= 10;	
		}			
		
		for(int i = 0; i < length; i++)
		{	
			num = num * 10 + arr[i];
				
		}
		System.out.println("Reversed Number is : " + num);
	}
}

