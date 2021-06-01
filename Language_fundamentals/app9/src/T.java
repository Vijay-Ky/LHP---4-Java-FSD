class T
{
	public static void main(String[] args) 
	{
		test();
		System.out.println(test());//void type not allowed here
	}
	public static void test()
	{
		System.out.println("from test()");
	}
}
