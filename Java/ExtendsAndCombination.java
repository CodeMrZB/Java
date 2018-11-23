public class ExtendsAndCombination
{
	//继承与组合
	//继承和组合是实现类重用的重要手段, 但继承带来了一个最大的坏处:破坏封装, 而采用组合方式来实现类重用则能提供更好的封装性.

	//使用继承的注意点
	//子类扩展父类时, 子类将可以从父类继承得到属性和方法, 如果访问权限允许, 子类将可以直接访问父类的属性和方法, 相当于子类可以在直接复用父类的属性和方法.
	//设计父类通常应该遵循如下规则:
	//1尽量隐藏父类的内部数据. 尽量把父类的所有属性都设置成private访问属性, 不用让子类直接访问父类的属性.
	//2不要让子类可以随意访问和修改父类的方法. 父类中那些仅为辅助其他的工具方法, 应该使用private访问控制符修饰, 让子类无法访问该方法; 如果父类中的方法需要被外部类调用, 必须以public修饰, 但又不希望子类重写该方法, 可以使用final修饰符来修饰方法; 如果希望父类的某个方法被子类重写, 但不希望被其他类自由访问, 可以使用protected来修饰该方法.
	//3不要在父类构造器中调用被子类重写的方法


	//利用组合实现复用
	//对于继承而言, 子类可以直接访问父类的public方法, 程序使用子类时, 将可以直接访问该子类从父类那里继承到的方法. 
	//而组合则是把旧类对象作为新类的属性嵌入, 用以实现新类的功能, 用户看到的是新类的方法, 而不能看到嵌入对象的方法. 通常需要在新类里使用private修饰嵌入旧类对象.

	//继承要表达的是一种"是(is-a)"的关系, 而组合表达的是"有(has-a)"的关系.
	public static void main(String[] args)
	{

	}
}