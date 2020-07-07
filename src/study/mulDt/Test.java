package study.mulDt;

public class Test {
    public static void main(String[] args) {
        Animal an = new Animal();
        Animal an1 = new Dog();
        Animal an2 = new Cat();
//        Dog an2 = new Animal(); // 子类引用不可以指向父类对象
        an.eat();
        an1.eat();
        an2.eat();
//        an1.watchDoor();
    }
}
