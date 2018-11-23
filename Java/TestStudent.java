public class TestStudent
{
	//主方法, 程序的入口
	//-d选项用于设置编译生成class文件的保存位置(.代表当前路径)
	public static void main(String[] args)
	{
		Student stu = new Student();
		//因为age属性是私有属性, 所以下面语句将出现编译错误
		//stu.age = 10;
		//下面语句编译不会出现错误, 但运行时将提示输入的age属性不合法, 程序不会修改stu的age属性
		stu.setAge(10000);
		//访问stu的age属性也必须通过其对应的getter方法
		System.out.println("未能设置age属性时:" + stu.getAge());
		stu.setAge(10);
		System.out.println("成功设置age属性时:" + stu.getAge());
		stu.setName("张波");
		System.out.println("成功设置name属性时:" + stu.getName());
	}
}