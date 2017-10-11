public class Case6 {
    private static Case6 instance;

    static { //静态语句块，也可以确保线程安全；
        instance = new Case6();
    }

    private Case6() {

    }

    public void foo() {
        System.out.println("Test Singleton");
    }

    public static Case6 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Case6.instance.foo();
    }
}
