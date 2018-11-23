public class overload
{
	//java允许同一个类里定义多个同名方法, 只要形参列表不同即可. 如果同一个类中包含了两个或两个以上方法的方法名相同, 但形参列表不同, 则被称为方法重载.
	//java中确定一个方法需要三个要素
	//1:调用者, 也就是方法的所属者, 既可以是类, 也可以是对象
	//2:方法名:方法的标识
	//3:形参列表:当调用方法时, 系统将会根据传入的实参列表匹配.
	//方法重载的要求:两同一不同, 即同一个类中方法名相同, 参数列表不同. 至于方法的其他部分, 如方法返回值类型 修饰符等, 与方法重载没有任何关系
	public void test()
	{
		System.out.println("无参数");
	}

	public void test(String msg)
	{
		System.out.println("重载的 test 方法" + msg);
	}

	public static void main(String[] args)
	{
		overload ol = new overload();
		//调用test时没有传入参数, 因此系统使用上面没有参数的test方法
		ol.test();
		ol.test("Hello");
	}
}