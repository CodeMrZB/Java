public class ConstructorOverload
{
	//如果一个类里提供了多个构造器, 就形成了构造器的重载
	//构造器重载
	//同一个类中有多个构造器, 多个构造器的形参列表不同, 即被称为构造器的重载. 构造器重载允许Java类里包含多个初始化逻辑, 从而允许使用不同的构造器来初始化Java对象.
	public String name;
	public String color;
	public double weight;
	//无参数的构造器
	public ConstructorOverload()
	{

	}
	//两个参数的构造器
	public ConstructorOverload(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
	//三个参数的构造器
	public ConstructorOverload(String name, String color, double weight)
	{
		this(name, color);
		this.weight = weight;
	}

	public static void main(String[] args)
	{
		ConstructorOverload constructor = new ConstructorOverload("张三", "绿色", 89.8);
		System.out.println("name:" + constructor.name + ",color:" + constructor.color + ",weight:" + constructor.weight);
	}
}