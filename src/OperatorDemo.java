/**
 * 运算符：用于对常量和变量进行操作的符号
 * 表达式： 用运算符连接起来的符合Java语法的的式子，不同的运算符连接的表达式是不同类型的表达式
 * 运算符分类：
 *      算术运算符(+、-、*、/、%、++、--)
 *         字符参与加法运算，其实是拿字符在计算机中存储的数值来参与运算的
 *         字符串参与加法运算，其实是字符串的拼接
 *      赋值运算符（=、+=、-=、*=、/=）
 *          扩展运算符隐含了强制类型转换
 *      关系运算符（<、>、==、!=、<=、>=）
 *          结果是Boolean类型
 *      逻辑运算符（）
 *      三元运算符（?）
 * */
public class OperatorDemo {
    public static void main(String[] args) {
        int a = 1;
        char b = '2';
        System.out.println(a+b);
//        System.out.println("a+b:" + a + b);
        int c = 1;
        short d = 0;
        d += c;
        System.out.println("d:"+d);
    }
}
