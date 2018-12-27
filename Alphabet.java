import java.io.*;

class Alphabet
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a character: ");
		String str = br.readLine();	
		char c = str.charAt(0);
		if( ( 64 < c && c < 91 ) || ( 96 < c && c < 123 ))
			System.out.println("The entered character belongs to the Alphabet ");
		else 
			System.out.println("The entered character doesn't belong to the Alphabet");		
	}
}
