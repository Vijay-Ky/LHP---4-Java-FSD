class P
{
	int i;
	static void test(P obj)
	{
		System.out.println("test: "+ obj.i);
		obj.i = 20;
	}	
	public static void main(String[] args)
	{
		P p1 = new P();
		System.out.println("main1: " + p1.i);
		p1.i = 10;
		test(p1);
		System.out.println("main2: " + p1.i);
	}
}