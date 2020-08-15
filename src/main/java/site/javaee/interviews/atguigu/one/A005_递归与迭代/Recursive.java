package site.javaee.interviews.atguigu.one.A005_递归与迭代;

/**
 * n步台阶，一次1或者2步，有几种走法
 *
 * @author Tao
 * @Date 2020/8/15
 * @Time 8:40
 */
public class Recursive {
    public static long step(int n){
        if(n <0){
            throw new IllegalArgumentException(n+"不能小于0");
        }else if(n <=2){
            return n;
        }
        return step(n-1)+step(n-2);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(step(50));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
