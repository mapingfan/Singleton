/**
 * 懒汉式，线程不安全；
 */
public class Case1 {

    private static Case1 instance; //单个对象；

    //注意此处的构造函数是private;
    //这一点限制我们new一个对象；
    private Case1() {
    }

    public static Case1 getInstance() {
        if (instance == null) {
            instance = new Case1();  //如果没有分配内存，即instance为空，进行分配；
        }
        return instance; //返回单个对象。
    }
}
