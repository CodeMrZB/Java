public class Recursive
{
	//一个方法体内调用它自身, 被称为方法的递归. 方法递归包含了一种隐式的循环, 它会重复执行某段代码, 但这种重复执行无须循环控制.
	//注意:递归一定要向已知方向递归, 否则递归就变成了无穷递归.
	public static int fn(int n)
	{
		if (n == 0) 
		{
			return 1;	
		} else if(n == 1)
		{
			return 4;
		} else
		{
			return 2 * fn(n - 1) + fn(n - 2);
		}
	}

	public static void main(String[] args)
	{
		System.out.println(fn(10));
	}
}