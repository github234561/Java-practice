import java.io.*;
import java.lang.Math;

class RootsQuadraticEquation
{
	public static void main(String[] args) throws IOException
	{	int arr[] = new int[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter integer values for a, b and c separated by space for the equation a*x*x + b*x + c = 0 ");
		String str = br.readLine();
		String[] arrS = str.trim().split("\\s+");
		for(int i = 0 ; i < 3 ; i++)
		{
			arr[i] = Integer.parseInt(arrS[i]);
		}
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		
		double root1 = (- b + Math.sqrt(b * b - 4 * a * c ))/(2 * a);
		double root2 = (- b - Math.sqrt(b * b - 4 * a * c ))/(2 * a);
		
		System.out.println("First root is " +root1);
		System.out.println("Second root is " +root2);
	}
}

