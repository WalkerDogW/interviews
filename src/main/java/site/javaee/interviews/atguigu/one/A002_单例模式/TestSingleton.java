package site.javaee.interviews.atguigu.one.A002_单例模式;

import java.util.concurrent.*;

/**
 * @author Tao
 * @Date 2020/8/14
 * @Time 16:13
 */
public class TestSingleton {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singletonB = Singleton.INSTANCE;
        System.out.println(singleton==singletonB);
        System.out.println("-----------------------------");


        Singleton2 singleton2 = Singleton2.INSTANCE;
        Singleton2 singleton2B = Singleton2.INSTANCE;
        System.out.println(singleton2==singleton2B);
        System.out.println("-----------------------------");


        Singleton3 singleton3 = Singleton3.INSTANCE;
        Singleton3 singleton3B = Singleton3.INSTANCE;
        System.out.println(singleton3==singleton3B);
        System.out.println(singleton3.info);
        System.out.println("-----------------------------");


        Singleton4 singleton4 = Singleton4.getInstance();
        Singleton4 singleton4B = Singleton4.getInstance();
        System.out.println(singleton4==singleton4B);
        //懒汉模式线程不安全
        Callable<Singleton4> callable = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = executorService.submit(callable);
        Future<Singleton4> f2 = executorService.submit(callable);

        System.out.println(f1.get()==f2.get());
        System.out.println("-----------------------------");

    }
}
