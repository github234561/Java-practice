class PrintPattern4
{
	public void printStars(int n)
	{	
		for(int i = 1; i <= n; i ++)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		PrintPattern4 pattern = new PrintPattern4();
		pattern.printStars(n);
	}
}


