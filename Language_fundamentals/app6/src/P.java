class P
{
	public static void main(String[] args)
	{
		int i;
		for(i = 0, System.out.println("INITIALIZER: "+i);
		i < 5;
		i++, System.out.println("INCREMENT: " + i))
		{
			System.out.println("BODY: " + i);
		}
	}
}
/*
INITIALIZER
BODY-0
INCREMENT0-1
BODY-1
INCREMENT1-2
BODY-2
INCREMENT2-3
BODY-3
INCREMENT3-4
BODY-4
INCREMENT4-5
*/