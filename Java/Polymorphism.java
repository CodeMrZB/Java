import java.lang.Boolean;
public class Polymorphism
{
	//Java引用变量有两个类型:一个是编译时的类型, 一个是运行时的类型. 编译时的类型由声明该变量时使用的类型决定, 运行时的类型由实际赋给该变量的对象决定. 如果编译时类型和运行时类型不一致, 就会出现所谓的多态.
	//引用变量的方法调用
	//在编译阶段只能调用其编译时的类型所具有的方法, 但运行时则执行它运行时类型所具有的方法.
	//对象的属性不具备多态性.通过引用变量来访问其包含的实例属性时,系统总是试图访问它编译时类所定义的属性,而不是它运行时类所定义的属性.
	//注意:引用变量在编译阶段只能调用其编译时类型所具有的方法, 但运行时则执行它运行时类型所具有的方法.因此,编写Java代码时, 引用变量只能调用声明该变量时所用类型里包含的方法. 例如我们通过Objcect p = new Person()代码定义一个变量p, 则这个p只能调用Object类的方法, 而不能调用Person类里定义的方法

	//引用变量的强制类型转换
	//编写Java程序时, 引用变量只能调用其编译时类型的方法, 而不能调用其运行时类型的方法. 如果需要引用变量调用其运行时类型的方法, 则必须把它强制类型转换成运行时类型.
	//类型转换运算符是小括号, 类型转换运算符可以将引用类型变量转换成其子类类型.
	//强制类型转换的注意点
	//1基本类型之间的转换只能在数值类型(整数型 字符型 浮点型)之间进行, 但数值类型不能和布尔型之间进行转换.
	//2引用类型之间的转换只能把一个父类变量转换成子类类型. 如果是两个没有任何继承关系的类型, 则无法进行类型转换, 否则编译时就会出现错误. 如果试图把一个父类实例转换子类类型, 则这个对象必须实际上是子类实例(即编译时类型为父类类型, 运行时类型是子类类型), 否则将在运行时引发ClassCastException异常
	//注意:当把子类对象赋给父类引用变量时, 被称为向上转型, 这种转型总是可以成功的, 这种转型只是表明这个引用变量的编译类型是父类, 但实际执行它的方法时, 依然表现出子类对象的行为方式. 但把父类对象赋给子类引用变量时, 就需要进行强制类型转换, 而且还可能在运行时产生ClassCastException异常. 使用instanceof运算符可以让强制类型转换更安全.

	//在进行类型转换之前应先通过instanceof运算符来判断是否可以成功转换
	//instanceof运算符的前一个操作数通常是一个引用类型的变量, 后一个操作数通常是一个类(也可以是接口, 可以把接口理解成一种特殊的类),它用于判断前面的对象是否是后面的类, 或者其子类 实现类的实例. 如果是, 则返回true, 否则返回false.
	//在使用instanceof运算符时, instanceof运算符前面操作数的编译类型要么与后面的类相同, 要么是后面类的父类, 否则会引起编译错误.
	//instanceof运算符的作用:在执行强制类型转换之前, 首先判断前一个对象是否是后一个类的实例, 是否可以成功转换, 从而保证代码更加健壮.
	public static void main(String[] args)
	{
		Object str = "Hello World";
		System.out.println(str instanceof Object);
	}
}