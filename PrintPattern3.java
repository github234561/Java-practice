class PrintPattern3
{
	public void printLetters()
	{	
		for(char a = 'A'; a < 'F'; a ++)
		{
			for(char b = 'A'; b <= a; b ++)
			{
				System.out.print(a + " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		PrintPattern3 pattern = new PrintPattern3();
		pattern.printLetters();
	}
}


