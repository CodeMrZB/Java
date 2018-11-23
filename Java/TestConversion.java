public class TestConversion
{
	//类型转换
	public static void main(String[] args)
	{
		double d = 3.1415926;
		System.out.println("d:" + d);
		long l = (long)d;
		System.out.println("l:" + l);
		int in = 5;
		//下面代码编译时出错, 试图把一个数值型变量转为boolean型, 编译时会提示:不可类型转换的
		//boolean b = (boolean)in;
		Object obj = "Hello";
		//obj变量的编译类型是Object, 是String类型的父类, 可以强制类型转换, 而且obj变量实际上类型是String类型, 所以运行时也可通过
		String objStr = (String)obj;
		System.out.println("objStr:" + objStr);
		//定义一个objPri变量, 编译类型Object, 实际类型为Integer
		Object objPri = 5;
		System.out.println("objPri:" + objPri);
		//objPri变量的编译类型是Object, 是String类型的父类, 可以强制类型转换
		//而objPri变量实际类型是Integer类型, 所以下面代码运行时引发ClassCastException(类转换异常)异常
		String str = (String)objPri;
	}
}