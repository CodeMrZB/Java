public class SubClass extends BaseClass
{
	//重新定义一个book实例属性覆盖父类的book实例属性
	public String book = "轻量级 J2EE 企业应用实践";
	public void test()
	{
		super.test();
		System.out.println("子类的覆盖父类的方法");
	}

	public void sub()
	{
		System.out.println("子类的普通方法");
	}

	public static void main(String[] args)
	{
		//下面编译时类型和运行时类型完全一致, 不存在多态
		BaseClass bc = new BaseClass();
		//输出6
		System.out.println(bc.book);
		//下面两次调用将执行BaseClass的方法
		bc.base();
		bc.test();

		//下面编译时类型和运行时类型完全一致, 不存在多态
		SubClass sc = new SubClass();
		//输出 轻量级 J2EE 企业应用实践
		System.out.println(sc.book);
		//下面调用将执行从父类继承到的base方法
		sc.base();
		//下面调用将执行从当前类的test方法
		sc.test();

		//下面编译时类型和运行时类型不一样, 多态发生
		BaseClass polymorphism = new SubClass();
		//输出6, 表示访问的是父类属性, 对象的属性不具备多态性
		System.out.println(polymorphism.book);
		//下面调用将执行从父类继承到的base方法
		polymorphism.base();
		//下面调用将执行从当前类的test方法
		polymorphism.test();

		//polymorphism编译类型是BaseClass, BaseClass类没有提供sub方法
		//下面代码编译时会出现错误
		//polymorphism.sub();
	}
}