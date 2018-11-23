public class Array
{
	public static void main(String[] args)
	{
		float af = 5.2345556f;
		System.out.println(af);
		double a = 0.0;
		//	正无穷
		double b = Double.POSITIVE_INFINITY;
		//	负无穷
		double c = Double.NEGATIVE_INFINITY;
		System.out.println(b);
		System.out.println(c);
		//	0.0除以0.0将出现非数
		System.out.println(a / a);
	}
}