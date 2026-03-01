package com.bro.learning.basics.opp.encapsulation;

// 封装
// 隐藏类的属性与方法,通过 setter 与 getter 方法来访问与修改属性 从而保护数据不被随意修改
// 广泛的说 封装就是 对内隐藏细节,对外暴露接口

public class Cat {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        // 在此处可以加入检查代码,增强代码安全性
        if(name != null) {
            this.name = name;// this.属性表示当前对象的属性值 后者为传进来的值
        }else{
            System.out.println("名字不合法!!");
        }
    }

    int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(this.name + " is eating");
    }
    public void sleep(){
        System.out.println("cat is sleeping");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("哈基米");
        cat.setAge(10);
        System.out.println(cat.getName() + "已经" + cat.getName() + "岁");
        cat.eat();
        cat.sleep();
    }
}
