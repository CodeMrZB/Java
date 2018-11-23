public class Person
{
	// static修饰的方法和属性, 可以通过类和实例来调用, 没有static修饰的普通方法和属性, 则只能通过实例来调用.
	public static String name;
	public int age;
	public static void say(String content)
	{
		System.out.println(content);
	}
}