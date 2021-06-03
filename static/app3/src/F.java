class F
{
    static 
    {
		System.out.println(i);//usage
		i = 1;//reinitialization
    }
    static int i;//declartion
    public static void main(String[]args)
    {
		System.out.println(i);
    }
}
