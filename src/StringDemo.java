/**
 * String：字符串类
 *      有多个字符组成的一串数据
 *      字符串本质是一个字符数组
 *
 *
 * 构造方法：
 *      String(String original): 字符串数据封装成字符串对象
 *      String(char[] value): 字符数组的数据封装成字符串对象
 *      String(char[] value, int index, int count): 字符数组中的一部分封装成字符对象
 * 注意：
 *      字符串是一种比较特殊的引用类型的数据类型，直接输出字符串对象输出的是该对象的数据
 *
 * String类判断功能：
 *      boolean equals(Object obj) 比较字符串的内容是否相同
 *      boolean equalsIgnoreCase(String str) 比较字符串的内容是否相同,不区分大小写
 *      boolean startsWith(String str) 判断字符串对象是否以指定str开头
 *      boolean endsWith(String str) 判断字符串对象是否以指定str结尾
 * */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("hello");
        System.out.println(s1);

        char[] chs = {'h', 'e', 'l', 'l', 'o'};
        String s2 = new String(chs);
        System.out.println(s2);

        String s3 = new String(chs, 1, 4);
        System.out.println(s3);
    }
}