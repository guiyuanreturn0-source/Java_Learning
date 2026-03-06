package com.bro.learning.basics.opp.inheritance;

// 继承 这里创建了一个子类
// 注意 Java是单继承:一个父类可以有多个子类,一个子类只能有一个父类

public class Penguin extends Animal {
    // Penguin 继承了Animal的属性,包括 private 属性(虽然不能直接用)
    // 还可以添加自己的属性
    String wingType;

    // Penguin 继承了父类的非private 非static方法
    // 还可以添加自己的方法
    public void makeSound(){
        System.out.println("咕咕嘎嘎!");
    }
    // 还可以重写父类的方法
    // 注意,重写时方法名 参数列表必须和父类相同
    // 返回值类型要么和父类相同,要么是父类返回值类型的子类
    // 访问权限不能比父类更严格

    @Override// 重写时添加该注解,让编译器检查是否符合重写规则
    public void eat() {
        System.out.println("味太太太~太正!");
    }

    // 子类的构造方法
    // 子类不会继承父类的构造方法
    // 如果不自己写构造方法,Java编译器会隐式生成一个默认空参构造,如下
    public Penguin() {
        super();// 子类的构造方法第一行默认会先调用父类的空参构造方法(不写也存在),前提是父类必须有显示或者隐式的空参构造
    }
    // 如果父类没有空参构造 子类必须 super(参数) 显式调用父类的某个有参构造,因为此时Java编译器不会隐式生成空参构造与 super()

    public Penguin(String name,int age,String color,String wingType) {
        super(name,age,color);
        this.wingType = wingType;
    }
    public void main(String[] args){
        Penguin penguin = new Penguin("Hey?",18,"black and white","鳍状翼");

        System.out.println("name: " + penguin.name);
        System.out.println("age: " + penguin.age);
        System.out.println("color: " + penguin.color);
        System.out.println("wingType: " + penguin.wingType);
        penguin.eat();
        penguin.makeSound();
        penguin.sleep();

        // super 关键字 使用super调用父类的方法与属性
        // super()调用父类的构造方法
        super.eat();
        // 与之类似的 this 在子类中调用当前对象的属性和方法
        this.eat();
        // 这两个关键字都只能在类的非静态方法或者构造方法内使用
        // 聪明的你或许发现了,这个 main 方法我没有写 static,如果加上就会报错

    }
}
