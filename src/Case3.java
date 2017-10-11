/**
 * DCL法，双重检验法；
 * 为什么需要两次检验呢？
 * 考虑如下情况：两个线程都执行到进行了第一次检测，进入到syn同步语句；
 * 先执行的锁住当前对象，后来者门外等待；
 * 先进入者new出一个对象，返回，结束执行，锁开；
 * 后来着上锁进入执行，如果没有第二次检验，后来着也会返回一个新对象；
 * 违反了单例模式单一对象的原则。
 */

public class Case3 {

    private static Case3 instance; //单个对象；

    //注意此处的构造函数是private;
    //这一点限制我们new一个对象；
    private Case3() {
    }

    public static Case3 getInstance() {
        if (instance == null) {   //第一次检验；
            synchronized (Case3.class){
                if (instance == null) {  //第二次检验；
                    instance = new Case3();  //如果没有分配内存，即instance为空，进行分配；
                }
            }
        }
        return instance; //返回单个对象。
    }
}
