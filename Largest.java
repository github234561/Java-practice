import java.io.*;

class Largest
{
	public static void main(String[] args) throws IOException
	{	int a[] = new int[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter three integers separated by space and then press enter: ");
		String str = br.readLine();
		String[] arr = str.trim().split("\\s+");
		for(int i = 0 ; i < 3 ; i++)
		{
			a[i] = Integer.parseInt(arr[i]);
		}
		
		for(int j = 0 ; j < 3 ; j++)
		{
			if((a[j] >= a[0]) && (a[j] >= a[1]) && (a[j] >= a[2]))
			System.out.println( a[j] + " is the largest");			
		}		
	}
}

