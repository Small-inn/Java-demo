package study.extendsDemo;

public class Dog extends Animal {
    public int age = 20;
    public void eat() {
        System.out.println(name + age + "狗吃东西！");
        super.eat();
    }
    public void method() {
        System.out.println(super.age);
    }
    public Dog() {
        System.out.println("Dog构造方法执行！");
    }
}
