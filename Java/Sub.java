public class Sub extends Base
{
	private String name;
	//重写父类的test方法, 方法重写遵循"两同两小一大"原则
	public void test()
	{
		System.out.println("子类重写父类的方法, 其name字符串长度" + name.length());
	}

	public static void main(String[] args)
	{
		//下面代码会发生空指针异常
		Sub sub = new Sub();
		//当系统试图创建Sub对象时, 同样会先执行其父类的构造器, 如果父类构造器调用了被其子类重写的方法, 则编程调用被子类重写后的方法. 当创建Sub对象时, 会先执行Base类中的Base构造器, 而Base构造器中又调用了test方法(并不是调用父类中的test方法, 而是调用子类中的test方法), 此时Sub对象的name属性是null, 因此将引发空指针异常.
		//如果想把某些类设置为最终类, 即不能被当成父类, 则可以使用final修饰这个类. 或者使用private修饰这个类的所有构造器, 从而保证子类无法调用该类的构造器, 也就无法继承该类. 对于把所有构造器都使用private修饰的父类而言, 可另外提供一个静态方法, 用于创建该类的实例.
	}
}