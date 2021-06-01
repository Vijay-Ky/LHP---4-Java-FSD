class S
{
	public static void main(String[] args) 
	{
		test();
		System.out.println(test());
	}
	public static boolean test()
	{
		System.out.println("from test()");
		return false;
	}
}
