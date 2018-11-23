public class Student
{
	//java提供了三个访问控制符:private protected public
	//如果一个java源文件里定义的所有类都没有使用public修饰, 则这个java源文件的文件名可以是一切合法的文件名.
	//将属性使用private修饰, 将这些属性隐藏起来
	private String name;
	private int age;
	//提供方法来操作name属性
	public void setName(String name)
	{
		//执行合理性校验, 要求用户名必须在2~6位之间
		if (name.length() > 6 || name.length() < 2)
		{
			System.out.println("您设置的人名不符合要求");
			return;
		} else
		{
			this.name = name;
		}
	}

	public String getName()
	{
		return this.name;
	}

	//提供方法操作age属性
	public void setAge(int age)
	{
		//执行合理性校验, 要求用户年龄必须在0~100之间
		if (age < 0 || age > 100)
		{
			System.out.println("您设置的年龄不合法");
			return;	
		} else
		{
			this.age = age;
		}
	}

	public int getAge()
	{
		return this.age;
	}
}