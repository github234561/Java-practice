class PrintPattern2
{
	public void printNum(int n)
	{	
		for(int i = 0; i < n; i ++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(j+1 + " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		PrintPattern2 pattern = new PrintPattern2();
		pattern.printNum(n);
	}
}


