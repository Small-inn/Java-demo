/**
 * 构造方法：
 *      给对象初始化数据
 * 格式：
 *      方法名和类名相同
 *      没有返回值类型，void也不能写
 *      没有具体的返回值
 * 注意事项：
 *      A：如果我们没有给出构造方法，系统会提供一个默认的无参构造方法供我们使用
 *      B：如果我们给出了构造方法，系统将不会再提供无参构造方法供我们使用，这个时候我们想使用无参构造方法，就必须自己提供
 *      C：构造方法也是可以重载的
 * */
public class ConstructorDemo {
    public static void main(String[] args) {
        Student st = new Student();
    }
}

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
