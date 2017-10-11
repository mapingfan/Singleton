/**
 * 针对case1进行修正；
 * 考虑两个线程同时执行getInstance函数，我们给函数上锁。
 * 实现同步。
 */
public class Case2 {
    private static Case2 instance;

    private Case2(){
    }

    public synchronized static Case2 getInstance() { //线程同步方法，加锁，会导致效率低下。
        if (instance == null) {
            instance = new Case2();  //如果没有分配内存，即instance为空，进行分配；
        }
        return instance; //返回单个对象。
    }
}
