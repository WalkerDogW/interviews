package site.javaee.interviews.atguigu.one.A002_单例模式;

/**
 * 单例模式：即某个类在整个系统中只能有一个实例对象被获取和使用的代码模式
 * 1、饿汉式：直接实例化
 *
 * @author Tao
 * @Date 2020/8/14
 * @Time 15:49
 */
public class Singleton {

    /*
    要点：
        一是某个类只能有一个实例——构造器私有化。
        二是它必须自行创建这个实例——含有一个该类的静态变量来保存这个唯一的实例。
        三是它必须自行向整个系统提供这个实例——对外提供获取该实例对象的方式：
            （1）直接暴露
            （2）用静态变量的get方法获取

    常见形式：
        饿汉式：直接创建对象，不管需不需要这个对象，不存在线程安全问题
            直接实例化饿汉式（简洁直观）
            枚举式（最简洁）
            静态代码块饿汉式（适合复杂实例化）

        懒汉式：延迟创建对象
            线程不安全（只适用于单线程）
            线程安全（适用于多线程）
            静态内部类形式（适用于多线程，最简单）
     */

    //为了强调是单例模式，可以用final修饰
    public static final Singleton   INSTANCE = new Singleton();
    //    public static Singleton instance = new Singleton();
    private Singleton() {
    }
}
