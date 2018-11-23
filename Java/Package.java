public class Package
{
	public static void main(String[] args)
	{
		//Java语法只要求包名是有效的标识符即可, 从可读性规范角度来看, 包名应该全部由小写字母组成.
		//Java的包机制需要2个方面保证
		//1源文件使用package语句指定包名
		//2class文件必须存放在对应的路径下

		//package语句必须作为源文件的第一句非注释性语句, 一个源文件只能指定一个包. 即只能包含一条package语句, 如果没有显示指定package语句, 则处于默认包下.
		//import可以向某个Java文件中导入指定包层次下某个类或全部类, import语句应该在package语句之后 类定义之前.
		//import静态导入, 用于导入指定类的某个静态属性或全部静态属性, 静态导入也有两种语法
		//import static package.subpackage...ClassName.fieldName用于导入指定类的单个静态属性
		//import static package.subpackage...ClassNmae.*用于导入指定类的全部静态属性, * 只能代表属性名
		System.out.println("package");

		//Java源文件的大体结构如下
		//package语句:0个或1个, 必须放在文件开始
		//import | import static:0个或多个, 必须放在所有类定义之前, package语句之后
		//public classDefinition | interfaceDefinition:0个或1个public类或接口定义
		//classDefinition | interfaceDefinition:0个或多个普通类或接口定义
	}
}