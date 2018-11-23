public class overloadVarargs
{
	public void test(String msg)
	{
		System.out.println("只有一个字符串参数的test方法");
	}

	public void test(String... books)
	{
		System.out.println("形参长度可变的test方法");
	}

	public static void main(String[] args)
	{
		overloadVarargs olv = new overloadVarargs();
		//下面两次调用将执行第二个方法
		olv.test();
		olv.test("1", "2");
		//下面将执行第一个方法
		olv.test("1");
		//下面调用将执行第二个方法
		olv.test(new String[]{"123"});
	}

}