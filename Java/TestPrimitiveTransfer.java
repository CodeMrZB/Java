public class TestPrimitiveTransfer
{
	public static void swap(int a, int b)
	{
		a = a + b;
		b = a - b;
		a = 
		int temp = a;
		a = b;
		b = temp;
		System.out.println("sawp方法里, a的值是" + a + "; b的值是" + b);
	}

	public static void main(String[] args)
	{
		int a = 3, b = 6;
		swap(a, b);
		System.out.println("交换之后, 实参a的值是" + a + "; 实参b的值是" + b);
	}
}