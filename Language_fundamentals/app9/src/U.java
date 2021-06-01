class U
{
	public static void main(String[] args) 
	{
		System.out.println(test(10, 20.0, 'a', "abc", true));
	}
	public static char test(int i, double j, char k, String l, boolean m)
	{
		System.out.println("from test(int, double, char, String, boolean)");
		return k;
	}
}
