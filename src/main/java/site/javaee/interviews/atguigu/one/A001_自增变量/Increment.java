package site.javaee.interviews.atguigu.one.A001_自增变量;

/**
 * i/j/k的值是多少
 *
 * @author Tao
 * @Date 2020/8/14
 * @Time 15:46
 */
public class Increment {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
    }
}
