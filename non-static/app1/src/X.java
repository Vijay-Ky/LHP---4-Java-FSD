class X
{
	int i;
	static void test(int obj1, int obj2)
	{
		System.out.println("obj1: " + obj1);
		System.out.println("obj2: " + obj2);
		obj1 = 20;
		obj2 = 10;
		System.out.println("obj1: " + obj1);
		System.out.println("obj2: " + obj2);
	}
	public static void main(String[] args)
	{
		X x1 = new X(), x2 = new X();
		x1.i = 10;
		x2.i = 20;
		System.out.println(x1.i);
		System.out.println(x2.i);
		test(x1.i, x2.i); //call by value
		System.out.println(x1.i);
		System.out.println(x2.i);
	}
}