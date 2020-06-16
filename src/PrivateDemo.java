/**
 * private关键字：
 *      是一个修饰符，可以修饰成员变量也可以修饰成员方法
 *      只能在本类访问
 *
 *      针对private修饰的成员变量，会提供相应的getXxx()和setXxx()用于获取和设置成员变量，方法用public修饰
 * */
public class PrivateDemo {
    String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show() {
        System.out.println(name + "," + age);
    }
}
