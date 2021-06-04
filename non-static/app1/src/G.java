class G
{
	int i;
	public static void main(String[]args)
	{
		//G g1 = null;
		//if we call anything on the null reference we get null pointer exception
		G g1 = new G();
		System.out.println(g1.i);
	}
}