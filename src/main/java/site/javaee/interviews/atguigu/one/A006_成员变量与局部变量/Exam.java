package site.javaee.interviews.atguigu.one.A006_成员变量与局部变量;

/**
 * @author Tao
 * @Date 2020/8/15
 * @Time 9:36
 */
public class Exam {
//局部变量与成员变量的区别：
//    一、变量的分类
//        成员变量
//            类变量
//            实例变量
//        局部变量
//            方法体{}中
//            形参
//            代码块{}中

//    二、值存储的位置
//        局部变量：栈
//        实例变量：堆
//        类变量：方法区
//
//    三、作用域
//        局部变量：从声明处开始，到所属的}结束
//        实例变量：在当前类中“this.”(有时this.可以缺省)，在其他类中“对象名.”访问
//        类变量：在当前类中“类名.”(有时类名.可以省略)，在其他类中“类名.”或“对象名.”访问
//
//    四、生命周期
//        局部变量：每一个线程，每一次调用执行都是新的生命周期
//        实例变量：随着对象的创建而初始化，随着对象的被回收而消亡，每一个对象的实例变量是独立的
//        类变量：随着类的初始化而初始化，随着类的卸载而消亡，该类的所有对象的类变量是共享的



//    当局部变量与xx变量重名时，如何区分：
//        局部变量与实例变量重名
//            在实例变量前面加“this.”
//        局部变量与类变量重名
//            在类变量前面加“类名.”

    int i;
    int j;
    static int s;
    {
        int i = 1;
        //就近原则
        i++;
        j++;
        s++;
    }

    public void test(int j){
        j++;
        i++;
        s++;
    }






    public static void main(String[] args) {

        Exam exam = new Exam();
        Exam exam2 = new Exam();
        exam.test(10);
        exam.test(20);
        exam2.test(30);

        System.out.println(exam.i+"\t"+exam.j+"\t"+exam.s);

        System.out.println(exam2.i+"\t"+exam2.j+"\t"+exam2.s);


    }
}
