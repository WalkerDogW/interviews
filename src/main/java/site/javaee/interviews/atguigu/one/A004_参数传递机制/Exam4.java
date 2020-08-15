package site.javaee.interviews.atguigu.one.A004_参数传递机制;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2020-08-15 0:47
 */
public class Exam4 {
    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num=2;
        int[] arr={1,2,3,4,5};
        MyData my = new MyData();

        change(i, str, num, arr, my);

        System.out.println("i=:"+i);
        System.out.println("str=:"+str);
        System.out.println("num=:"+num);
        System.out.println("arr=:"+ Arrays.toString(arr));
        System.out.println("my.a=:"+my.a);
    }

    public static void change(int j,String s,Integer n, int[] a ,MyData m){
        j+=1;
        s+="world";
        n+=1;
        a[0]+=1;
        m.a+=1;
    }

//    String、包装类等对象不可变

//    实参给形参赋值时：
//        基本数据类型：数据值
//        引用数据类型：地址值
}


class MyData{
    int a = 10;
}
