public class TestConstructor
{
	public String name;
	public int count;
	//提供无参数的构造器
	public TestConstructor()
	{

	}

	//提供自定义的构造器
	public TestConstructor(String name, int count)
	{
		this.name = name;
		this.count = count;
	}

	public static void main(String[] args)
	{
		//通过无参数构造器创建TestConstructor对象
		TestConstructor constructor = new TestConstructor();
		System.out.println("name:" + constructor.name + ", count:" + constructor.count);
		//通过有参数构造器创建TestConstructor对象
		TestConstructor constructor1 = new TestConstructor("张三", 1800);
		System.out.println("name:" + constructor1.name + ", count:" + constructor1.count);
	}
}