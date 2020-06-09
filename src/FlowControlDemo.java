/**
 * 流程控制语句：
 * 顺序结构
 * 选择结构
 *  if
 *  switch
 * 循环结构
 *  for
 *
 * */
public class FlowControlDemo {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        if (x > 6) {
            y = 2 * x + 1;
        } else if (x < 6 && x > -1) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println(y);
    }
}
