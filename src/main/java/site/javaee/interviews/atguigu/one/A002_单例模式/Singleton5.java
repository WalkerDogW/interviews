package site.javaee.interviews.atguigu.one.A002_单例模式;

/**
 * 5、懒汉式:synchronized保平安
 *
 * @author Tao
 * @Date 2020/8/14
 * @Time 15:49
 */
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {
    }

    public static Singleton5 getInstance() throws InterruptedException {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    Thread.sleep(1000);
                    return instance = new Singleton5();
                }
            }
        }
        return instance;
    }

}
