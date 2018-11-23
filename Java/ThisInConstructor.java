public class ThisInConstructor
{
	//普通方法访问其他方法和属性时无须使用this前缀, 但如果方法里有个局部变量和属性同名, 但程序又需要在该方法里访问这个被覆盖的属性, 则必须使用this前缀
	//定义一个名为foo的属性
	public static int foo;
	//定义构造器
	// 修饰符 构造器名(形参列表)
	// {
	//		由零条到多条可执行语句组成的构造器执行体
	// }
	//修饰符:修饰符可以省略, 也可以是private public protected其中之一
	//构造器名:必须和类名相同
	//形参列表:和定义方法形参列表的格式完全相同
	//构造器不能定义返回值类型声明, 也不能使用void定义构造器没有返回值
	public ThisInConstructor()
	{
		//在构造器里定义一个foo变量
		int foo = 0;
		//使用this代表此构造器进行初始化的对象
		this.foo = 6;
	}

	public static void main(String[] args)
	{
		//所有使用ThisInConstructor创建的对象的foo属性都将被设为6
		System.out.println(new ThisInConstructor().foo);
		System.out.println(ThisInConstructor.foo);
	}
}