package site.javaee.interviews.atguigu.one.A003_类和实例的初始化;

/**
 * @author shkstart
 * @create 2020-08-14 22:46
 */
public class Father {
//    父类初始化<clinit>:
//        类变量显示赋值代码和静态代码块代码从上到下顺序执行


    //    非静态方法前面其实有一个默认的对象this，
//    this在构造器(或<init>)表示的是正在创建的对象，因为这里是在创建Son对象，所以test()执行的是子类重写的代码(面向对象多态)
    private int i = test();
    private static int j = method();

    static {
        System.out.println(1);
    }

    Father() {
        System.out.println(2);
    }

    {
        System.out.println(3);
    }

    public int test() {
        System.out.println(4);
        return 1;
    }

    public static int method() {
        System.out.println(5);
        return 1;
    }
}
