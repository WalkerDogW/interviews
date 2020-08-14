package site.javaee.interviews.atguigu.one.A002_单例模式;

/**
 * 4、懒汉式
 *
 * @author Tao
 * @Date 2020/8/14
 * @Time 15:49
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() throws InterruptedException {
        if (instance == null) {
            Thread.sleep(1000);
            return instance = new Singleton4();
        }
        return instance;
    }

}
