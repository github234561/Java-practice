import java.io.*;

class Vowel
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a character: ");
		String s = br.readLine();
		char c = s.charAt(0);
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			System.out.println("The charater is a vowel");
		else
			System.out.println("The character is a consonant");
		
	}
}
