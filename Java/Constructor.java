public class Constructor
{
	public static void mian(String[] args)
	{
		//构造器是一个特殊的方法, 这个特殊方法用于创建类的实例. Java语言里构造器是创建对象的重要途径(即使使用工厂模式 反射等方式创建对象, 其实质依然是依赖于构造器), 因此Java类必须包含一个或一个以上的构造器.
		//构造器的作用是在创建对象时执行初始化, 基本类型的属性设为0(对数值类型)或者false(对布尔类型), 引用类型设置为null.
		//如果没有为Java类提供任何构造器, 系统会自动为这个类提供一个无参数的构造器, 构造器的执行体为空.
		//一旦提供了自定义的构造器, 系统则不再提供默认的构造器
		TestConstructor constructor = new TestConstructor("战死", 1);
		//通常建议为Java类保留无参数的默认构造器, 因此, 如果为一个类编写了有参数的构造器, 通常建议为该类额外编写一个无参数的构造器
	}
}