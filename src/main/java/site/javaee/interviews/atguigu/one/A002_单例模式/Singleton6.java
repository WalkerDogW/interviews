package site.javaee.interviews.atguigu.one.A002_单例模式;

/**
 * 2、懒汉式：静态内部类
 * 在内部类被加载和初始化时才创建INSTANCE实例对象
 * 静态内部类不会自动随着外部类加载和初始化而初始化，它是要单独去加载和初始化的
 *
 * @author Tao
 * @Date 2020/8/14
 * @Time 15:49
 */
public class Singleton6 {
    private Singleton6() {
    }


    //静态内部类在调用的时候创建，而不是一开始就创建
    private static class Inner {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return Inner.INSTANCE;
    }

}
