public class StaticAccessNonStatic
{
	public void info()
	{
		System.out.println("简单的info方法");
	}

	public static void main(String[] args)
	{
		//因为main方法是静态方法, 而info是非静态方法, 所以下面语句将出现错误:无法从静态上下文中引用非静态方法
		//info();
		//如果确实需要在静态方法中访问另一个普通方法, 则只能重新创建一个对象.
		new StaticAccessNonStatic().info();
	}
}