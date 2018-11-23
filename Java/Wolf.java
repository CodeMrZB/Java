class Wolf
{
	//将原来的父类嵌入原来的子类, 作为子类的一个组合成分
	private Animal a;
	public Wolf(Animal a)
	{
		this.a = a;
	}
	
	//重新定义一个自己的breath方法
	public void breath()
	{
		//直接复用Animal提供的breath方法来实现Wolf的breath方法.
		a.breath();
	}

	public void run()
	{
		System.out.println("我在陆地上快速的奔跑...");
	}
}