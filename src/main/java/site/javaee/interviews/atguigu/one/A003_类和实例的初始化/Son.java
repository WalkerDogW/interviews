package site.javaee.interviews.atguigu.one.A003_类和实例的初始化;

/**
 * @author shkstart
 * @create 2020-08-14 22:48
 */
public class Son extends Father {

//    子类初始化：
//        先初始化父类：5-1
//        初始化子类：10-6

    //    子类实例化：
//        super最前
//        非静态实例变量显示赋值代码和非静态代码块代码从上到下顺序执行
//        子类无参构造最后
    private int i = test();
    private static int j = method();

    static {
        System.out.println(6);
    }

    Son() {
//        写或不写都存在，在子类构造器中一定会先调用父类的构造器，而子类构造器在非静态成员/代码块之后才调用
//        super();
        System.out.println(7);
    }

    {
        System.out.println(8);
    }

    public int test() {
        System.out.println(9);
        return 1;
    }

    public static int method() {
        System.out.println(10);
        return 1;
    }

    //
    public static void main(String[] args) {
//        每次创建实例对象，调用对应构造器，执行的就是对应的<init>方法
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();
    }


//    类初始化过程
//        main方法所在的类需要先加载和初始化
//        一个类要创建实例需要先加载并初始化该类
//        一个子类要初始化需要先初始化父类
//        一个类初始化就是执行<clinit>()方法
//            <clinit>()方法由静态类变量显示赋值代码和静态代码块组成
//            类变量显示赋值代码和静态代码块代码从上到下顺序执行
//            <clinit>()方法只执行一次
//输出：5-1-10-6


//    实例初始化过程
//        实例初始化就是执行<init>()方法
//            <init>()方法可能重载有多个，有几个构造器就有几个<init>方法
//            <init>()方法由非静态实例变量显示赋值代码和非静态代码块、对应构造器代码组成
//                非静态实例变量显示赋值代码和非静态代码块代码从上到下顺序执行，而对应构造器的代码最后执行
//            每次创建实例对象，调用对应构造器，执行的就是对应的<init>方法
//            <init>方法的首行是super()或super(实参列表)，即对应父类的<init>方法


//    不会被重写的方法：
//        final
//        静态方法
//        private等子类不可见的方法


//    对象的多态性：
//        子类如果重写了父类的方法，通过子类对象调用的一定是子类重写过的代码
//        非静态方法默认的调用对象是this
//        this对象在构造器或者说<init>方法中就是正在创建的对象

}
