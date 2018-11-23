public class Dog
{
	//	this关键字是一个对象的默认引用, this关键字总是指向调用该方法的对象. 根据this出现位置的不同, this作为对象的默认引用有两种情形
	//	1构造器中引用该构造器执行初始化的对象
	//	2在方法中引用调用该方法的对象

	public void jump()
	{
		System.out.println("执行jump方法");
	}

	public void run()
	{
		//this.jump();
		//一个方法访问相同实例的其他方法和属性时加不加this前缀的效果是完全一样的
		jump();
		System.out.println("执行run方法");
	}
}