import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * 方法重载：在同一个类中出现了方法名相同的情况
 * 特点：
 *    方法名相同，参数列表不同（参数的个数不同，参数的类型不同）
 *
 * 注意：
 *   不能出现方法名相同，参数列表也相同的情况
 * */
public class MethodReloadDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int res1 = sum(a, b);
        int res2 = sum(a, b, c);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println("-----------");

        System.out.println(compare((byte)10, (byte)20)); // 强制类型转换
        System.out.println(compare((short)10, (short)10));
        System.out.println(compare(10L, 20L));
        System.out.println(compare(10, 20));
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean compare(int a, int b) {
        return a == b ? true : false;
    }
    public static boolean compare(short a, short b) {
        return a == b ? true : false;
    }
    public static boolean compare(byte a, byte b) {
        return a == b ? true : false;
    }public static boolean compare(long a, long b) {
        return a == b ? true : false;
    }

}
