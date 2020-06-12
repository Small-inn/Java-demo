/**
 * 方法：完成特定功能的代码块
 * 定义格式：
 *      修饰符 返回值类型 方法名（参数类型 参数1， 参数类型 参数2，。。。。）{
 *          方法体
 *          return 返回值
 *      }
 * 格式：
 *    修饰符： public static
 *    返回值类型: 用限定返回值的数据类型
 *    方法名: 方便调用的名字
 *     参数类型：传入参数的数据类型
 *     参数名：调用时传入的数据变量
 *     方法体：完成功能的代码
 *     return 结束方法
 *
 * 要求：
 *   A:返回值类型
 *   B:参数列表
 *
 *
 *
 *   void修饰的方法只能单独调用
 *
 *
 * 方法详情解析：
 *    除了静态方法之外的所有方法都只能通过对象调用， static关键字的方法可以直接调用
 * */
public class MethodDemo {
    public static void main(String[] args) {
        int res = sum(10, 20);
        System.out.println(res);

        sayHi();
    }
    public static int sum(int a, int b) {
        return a + b;
    }
//    void声明的方法
    public static void sayHi() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}
