public class TestPerson
{
	public static void main(String[] args)
	{
		Person p;
		p = new Person();
		p.name = "张三";
		System.out.println(p.name);
		p.say("Java语言很简单, 学习很容易");
		Person.name = "李四";
		System.out.println(p.name);
		Person.say("上海小鬼网络科技有限公司");
	}
}