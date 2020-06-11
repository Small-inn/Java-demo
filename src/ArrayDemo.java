import java.lang.reflect.Array;

/**
 *
 * 数组：存储同一数据类型的多个元素的容器
 * 定义格式：
 *      数据类型[] 数组名  int[] arr 推荐这种写法
 *      数据类型 数组名[]  int arr[]
 * 数组初始化
 *      为数组开辟内存空间，为数组中的每个元素赋予初始值
 *      静态初始化 ：给出初始值，由系统决定长度
 *          数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3, ....}
 *      动态初始化 ：只能给出长度，由系统给出初始值
 *          数据类型[] 数组名 = new 数据类型[数组长度]
 *          简化格式： 数组类型[] 数组名 = {元素1, 元素2, 元素3, ....}
 *
 *
 *      byte、short、int、long 默认值0
 *      float、double 默认值0.0
 *      Boolean 默认值 false
 *      char 默认值'\u0000'
 *
 * */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] arr2 = new int[]{1, 2, 3, 4, 5}; // int[] arr2 = {1, 2, 3, 4, 5}
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
