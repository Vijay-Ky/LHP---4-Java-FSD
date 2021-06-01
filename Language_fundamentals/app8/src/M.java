class M
{
	public static void main(String[] args) 
	{
		boolean i = true;
		switch(i)//incompatible types: boolean cannot be converted to int
		{
			case false:
				System.out.println("from case false ");
				break;
			case true:
				System.out.println("from case true ");
				break;
			default :
				System.out.println("from case default ");
				break;
		}
	}
}
 
