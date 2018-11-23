public class TestComposite
{
	public static void main(String[] args)
	{
		//此时需要显示创建被嵌入的对象
		Animal a1 = new Animal();
		Bird b = new Bird(a1);
		b.breath();
		b.fly();

		//此时需要显示创建被嵌入的对象
		Animal a2 = new Animal();
		Wolf w = new Wolf(a2);
		w.breath();
		w.run();
	}
}