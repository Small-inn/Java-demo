/**
 * 面向对象
 *
 */

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st);
        System.out.println(st.age);
        st.study();
    }
}

class Student {
    String name;
    int age;
    public void eat() {
        System.out.println("吃饭啦！");
    }
    public void study() {
        System.out.println("好好学习，天天向上！");
    }
}
