/**
 * 这种写法我一开始也不理解；
 * 后来我查资料，知道instance的类型为Singleton；
 * 并且我们可以在枚举中定义方法；
 */
public enum Singleton {
    instance;

    public void foo() {
        System.out.println("Test Singleton");
    }

    public static void main(String[] args) {
        Singleton.instance.foo();
    }
}

