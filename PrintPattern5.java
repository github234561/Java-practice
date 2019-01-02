class PrintPattern5
{
	public void printNum(int n)
	{	
		for(int i = n; i > 0 ; i -- )
		{
			for(int j = 1; j <= i; j ++)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		PrintPattern5 pattern = new PrintPattern5();
		pattern.printNum(n);
	}
}
