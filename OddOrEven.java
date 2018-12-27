import java.io.*;

public class OddOrEven
{
	public static void main(String[] args) throws IOException
	{	
		String userInput;
		int num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer: ");
		userInput = br.readLine();
		num = Integer.parseInt(userInput);
		
		if(num%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");		
	}
}

