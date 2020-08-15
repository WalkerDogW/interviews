package site.javaee.interviews.atguigu.one.A007_SpringBean作用域;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Tao
 * @Date 2020/8/15
 * @Time 10:05
 */
public class SpringBean {
//    Spring为每个在IOC容器里声明的Bean创建唯一一个实例，默认作用域为singleton，单例模式
//    springboot用@Score注解指定@Component的作用域

//作用域
//    singleton:默认，当IOC容器一创建就会创建Bean实例
//    prototype：原型的，IOC容器创建时不创建Bean实例，每次getBean操作都返回一个新的实例
//    request：每次http请求返回一个新的Bean实例
//    session：在一次会话中共享一个bean







//    @Autowired 和 @Resource的区别：
//        @Autowired注解是按类型装配依赖对象，默认情况下它要求依赖对象必须存在，
//        如果允许null值，可以设置它required属性为false。
//        如果有多个Bean实例，可以增加@Qualifier来指定
//
//        @Resource注解和@Autowired一样，也可以标注在字段或属性的setter方法上，但它默认按名称装配。
//        名称可以通过@Resource的name属性指定，
//        如果没有指定name属性，当注解标注在字段上，即默认取字段的名称作为bean名称寻找依赖对象，
//        当注解标注在属性的setter方法上，即默认取属性名作为bean名称寻找依赖对象。
//
//        @Resources按名字，是ＪＤＫ的，@Autowired按类型，是Ｓｐｒｉｎｇ的。

}
