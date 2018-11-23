class Bird
{
	//将原来的父类嵌入到原来的子类, 作为子类的一个组合成分
	private Animal a;
	public Bird(Animal a)
	{
		this.a = a;
	}

	//重新定义一个自己的breath方法
	public void breath()
	{
		//直接复用Animal提供的breath方法来实现Bird的breath方法.
		a.breath();
	}

	public void fly()
	{
		System.out.println("我在天空自由自在的飞翔...");
	}
}