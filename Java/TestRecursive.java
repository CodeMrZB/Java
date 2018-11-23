public class TestRecursive
{
	//只要一个方法的方法体实现里再次调用了方法本身, 就是递归方法. 递归一定要向已知方向递归.
	public static int fn(int n)
	{
		if (n == 20) 
		{
			return 1;	
		} else if(n == 21)
		{
			return 4;
		} else
		{
			return fn(n+2) - 2*fn(n+1);
		}
	}

	public static void main(String[] args)
	{
		System.out.println(fn(10));
	}
}