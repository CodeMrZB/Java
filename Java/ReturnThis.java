public class ReturnThis
{
	public int age;
	public ReturnThis grow()
	{
		//当this作为对象的默认引用使用时, 程序可以像访问普通引用变量一样来访问这个this引用, 甚至可以把this当成普通方法的返回值.
		age++;
		return this;
	}

	public static void main(String[] args)
	{
		ReturnThis rt = new ReturnThis();
		rt.grow()
		  .grow()
		  .grow();
		System.out.println("rt的age属性值是:" + rt.age);
	}
}