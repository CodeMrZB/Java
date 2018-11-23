public class TestInstanceof
{
	public static void main(String[] args)
	{
		//声明str时使用Object类, 则str的编译类型是Object, Object是所有类的父类, 但str变量的实际类型是String
		Object str = "hello world";
		//String是Object类的子类, 所以可以进行instanceof运算. 返回true
		System.out.println("字符串是否是Object类的实例:" + (str instanceof Object));
		//返回true
		System.out.println("字符串是否是String类的实例:" + (str instanceof String));
		//Math是Object类的子类, 所以可以进行instanceof运算. 返回false.
		System.out.println("字符串是否是Math  类的实例:" + (str instanceof Math));
		//String类既不是Math类, 也不是Math类的父类, 所以下面代码无法编译通过.
		String a = "Hello";
		System.out.println("字符串是否是Math  类的实例:" + (a instanceof Math));
	}
}