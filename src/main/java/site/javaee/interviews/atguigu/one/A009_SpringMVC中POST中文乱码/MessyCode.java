package site.javaee.interviews.atguigu.one.A009_SpringMVC中POST中文乱码;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.nio.charset.StandardCharsets;

/**
 * @author shkstart
 * @create 2020-08-15 21:33
 */
@Configuration
public class MessyCode {


//Springboot通过配置的方式解决中文乱码：
//    #是否将编码强制到HTTP请求和响应上配置的字符集。默认为false
//    spring.http.encoding.force=true
//    #是否启用http编码支持。默认为false
//    spring.http.encoding.enabled=true
//    #HTTP请求和响应的字符集。如果没有明确设置,就将该字符集添加到Content-Type中
//    spring.http.encoding.charset=UTF-8
//    #用于解码URI的字符编码。
//    server.tomcat.uri-encoding=UTF-8


//Springboot通过配置类的方式解决中文乱码
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        //用于注册过滤器
        FilterRegistrationBean frb = new FilterRegistrationBean();
        // 使用spring 提供的字符编码过滤器，不用自己写过滤器
        CharacterEncodingFilter cef = new CharacterEncodingFilter(StandardCharsets.UTF_8.toString(), true);
        frb.setFilter(cef);
        return frb;
    }


//SpringMVC 通过在web.xml配置过滤器的方式解决中文乱码
//    <filter>
//        <filter-name>CharacterEncodingFilter</filter-name>
//        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
//        <init-param>
//            <param-name>encoding</param-name>
//            <param-value>UTF-8</param-value>
//        </init-param>
//        <init-param>
//            <param-name>forceEncoding</param-name>
//            <param-value>true</param-value>
//        </init-param>
//    </filter>
}