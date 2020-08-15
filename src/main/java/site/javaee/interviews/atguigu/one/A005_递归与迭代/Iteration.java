package site.javaee.interviews.atguigu.one.A005_递归与迭代;

/**
 * @author Tao
 * @Date 2020/8/15
 * @Time 9:03
 */
public class Iteration {
    public static long step(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(n + "不能小于0");
        } else if (n <= 2) {
            return n;
        }
        long[] result = new long[n + 1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }


    public static long step2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(n + "不能小于0");
        } else if (n <= 2) {
            return n;
        }

        long one = 2;//初始化为走到第二级台阶的走法
        long two = 1;//初始化为走到第一级台阶的走法
        long sum = 0;

        for(int i=3; i<=n; i++){
            //最后跨两步+最后跨一步的走法
            sum = one+two;
            two = one;
            one = sum;
        }
        return sum;

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(step2(50));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
