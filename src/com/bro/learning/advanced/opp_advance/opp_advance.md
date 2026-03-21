# 类
在面向对象基础中,我们粗略地学习了类和对象的创建,在类中我们可以定义变量(属性) 方法

但是把所有的内容都放在一个类里是十分凌乱的

因此我们按照功能的不同把他们分为三类

- Javabean类 -> 描述一类事物
- 测试类 -> 测试代码是否书写正确,含有main方法,是程序的入口
- 工具类 -> 实现一些功能的类,不描述事物(构造方法私有,因为没用;写静态方法,方便调用)

# Static
在 Static_demo 中,静态方法中没有 this 关键字,因此 --> 静态方法只能访问静态方法和静态变量,而非静态方法可以访问所有

因此?

核心原理阐述:

this关键字的本质：this是一个隐式的、**指向当前对象实例的引用**。
当一个非静态方法被调用时（例如 obj.method()），JVM 会自动将调用该方法的对象 obj的引用传递给方法内部的 this。
因此，在非静态方法内部，所有对实例变量和其他实例方法的访问，实际上都是通过 this.变量名或 this.方法名()的形式进行的（通常 this被省略了）。

静态方法与对象实例解耦：静态方法属于类本身，而不是类的任何一个实例。
它通过类名直接调用（例如 ClassName.staticMethod()），在**调用时没有任何具体的对象实例参与**。
因此，JVM 无法为它提供一个有效的 this引用。

# 继承
面向对象基础中,我们简单地学习了Java的继承

Java是单继承,还可以多层继承

比如,A是B的子类,B是C的子类 则C是B的直接父类,是A的间接父类

Java中有一个最大的类Object,他是其他所有类的直接父类或者间接父类

继承中成员变量的访问特点:
**就近原则** 先从局部位置找,本类成员位置找,父类成员位置找,逐级往上

可以使用 this.变量名 访问本类成员变量,使用 super.变量名 访问父类成员变量,如下
```java
public class Fu{
    String name = "父类名";
    String hey = "Hey?";
}
public class Zi extends Fu{
    String name = "子类名";

    static void main(String[] args){
        String data = "某数据";
        System.out.println(data);// 某数据
        System.out.println(name);// 子类名
        System.out.println(this.name);// 子类名
        System.out.println(super.name);// 父类名
        
        System.out.println(hey);// Hey?
        System.out.println(super.hey);// Hey?
    }
}
```
super 和 this :
- 构造方法 --> 二选一,必须放在第一行,调用方法
- 普通方法 --> 访问成员,调用方法
- 静态方法 ××× 都不能用

# 多态
基础部分学习了多态的基本用法,弊端也很明显:无法调用子类的特有方法

有没有什么解决办法呢?

有的,向下转型(将父类对象转换成子类对象),相对的,还有向上转型,不过向上转型是自动的,因为子类对象本身就是父类的一种

```java
public class Test{
    static void main() {
        Animal dog = new Dog(); // 此处向上转型 隐式自动转换
        Dog dog_1 = (Dog)dog;// 向下转型 显式强制转换
    }
}
```
向下转型存在风险,可能失败（抛出ClassCastException）

这里介绍一个关键字` instanceof ` 用法: ` 变量名 instanceof 类名 ` 检查变量是否为该类,是则返回true,否则返回false

关于向上转型:
```
    // 参数多态
    void feedAnimal(Animal animal) {
        animal.eat();  // 可接收任何Animal子类
    }

    feedAnimal(new Dog());

    feedAnimal(new Cat());

    // 集合多态
    List<Animal> animals = new ArrayList<>();
    animals.add(new Dog());
    animals.add(new Cat());

    // 返回类型多态
    Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();  // 向上转型
        }
        return new Cat();
    }
```

# import 包
包( package ) 就是文件夹,用于管理类
使用 ` import ` 关键字导入包,使用所在包的类不需要导入,使用 java.lang 的类不用导入
如果要使用其他包中的同名类,需要使用全名类 例如 ` com.bro.learning.basics.HelloWorld `\

# final
`final` 修饰方法:表示该方法为最终方法,不能被重写
`final` 修饰变量:只能赋值一次,表示常量
`final` 修饰方法:表示类为最终类,不能被继承

值得注意的是: final 修饰引用数据类型时,不能修改的是地址值,引用数据类型所指向的属性内部还是可以改变的

# 内部类
关于创建内部类对象:

如果内部类使用了 ` private ` 修饰,则在外部类外不能直接创建内部类对象,此时需要在外部类书写创建内部类对象的方法供其调用;

如果没有,也可以使用 ` 外部类名.内部类名 对象名 = 外部类对象.内部类对象 ` 创建,比如 ` Outer.Inner io = new Outer().new Inner() `

- 成员内部类
定义在成员位置的内部类
- 静态内部类
JDK 16 添加,static 修饰的成员内部类
- 局部内部类
定义在方法里的类
- **匿名内部类**
隐藏了名字的内部类,可以写在成员位置,也可以写在局部位置