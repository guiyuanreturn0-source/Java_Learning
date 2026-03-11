package com.bro.learning.coreAPI.Object_Big;

// Object类 所有类最严厉的父亲

public class ObjectDemo {
    // Object只有空参构造,他又是所有类的直接或者间接父类,所以 为什么在面向对象进阶中会提到子类默认调用 super() 构造

    static void main() {
        Object obj = new Object();
        Object obj1 = new Object();

        System.out.println(obj);
        System.out.println(obj1);
        // obj.toString();
        // 默认实现: 返回字符串，格式为：全限定类名@十六进制哈希码 例如：com.example.Person@1b6d3586
        // 想要访问对象的属性值时,,重写该方法

        /*
        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }

        */

        // obj.equals(obj1);
        // 默认比较地址值
        // 同理,可以重写

        /*

        @Override
        public boolean equals(Object o) {
            if (this == o) return true; // 同一个引用，快速通过
            if (o == null || getClass() != o.getClass()) return false; // 类型检查
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name); // 比较关键字段
        }

        */

        // clone() 的实现需要注意
        // 类必须实现 Cloneable接口 (一个标记接口，否则会抛出 CloneNotSupportedException)
        // 通常需要重写此方法，并将其访问修饰符改为 public
        // 默认返回的是对象的一个副本,浅克隆,即对于引用类型只是创建了一个新的地址变量来指向原来对象的堆内存
        // 深克隆与之相对,需要重写方法为每一个引用字段创建副本

        // obj.equals(obj);
        // 返回对象的哈希值,用于支持哈希表

        // 当然还有其他方法
    }
}
