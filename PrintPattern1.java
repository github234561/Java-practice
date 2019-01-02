class PrintPattern1
{
	public void printStars(int n)
	{	
		for(int i = 0; i < n; i ++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		PrintPattern1 pattern1 = new PrintPattern1();
		pattern1.printStars(n);
	}
}
