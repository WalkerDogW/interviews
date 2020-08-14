package site.javaee.interviews.atguigu.one.A002_单例模式;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 3、饿汉式：静态代码块，适合于初始化复杂构造
 *
 * @author Tao
 * @Date 2020/8/14
 * @Time 15:49
 */
public class Singleton3 {
    public static final Singleton3   INSTANCE ;
    static {
        Properties properties = new Properties();
        InputStream is = Singleton3.class.getClassLoader().getResourceAsStream("singleton.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            throw new RuntimeException();
        }
        INSTANCE=new Singleton3(properties.getProperty("info"));
    }
    private Singleton3(String info) {
        this.info = info;
    }

    public String info;
}
