class Z
{
	static int test()
	{
		return j;	
	}
	static int i = test() + j;
	
	static int j;
	
	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
	}
}
