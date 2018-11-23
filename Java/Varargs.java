public class Varargs
{
	//数组形式的形参可以处于形参列表的任意位置, 但个数可变的形参只能处于形参列表的最后
	public static void test(int a, String... books)
	{
		for (String tmp : books)
		{
			System.out.println(tmp);
		}
		System.out.println(a);
	}

	public static void test1(int a, String[] books)
	{
		for (String tmp : books)
		{
			System.out.println(tmp);
		}
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		// test(10, "张三", "李四", "王麻子");
		String[] books = new String[]{"张三", "李四", "王麻子"};
		test1(10, books);
		System.out.println(books[2]);
	}
}