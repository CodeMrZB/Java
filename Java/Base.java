public class Base
{
	public Base()
	{
		System.out.println("父类默认构造器方法");
		test();
	}

	public void test()
	{
		System.out.println("将被子类重写的方法");
	}
}