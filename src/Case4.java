/**
 * 饿汉式
 *
 */
public class Case4 {
    private static final Case4 instance = new Case4();

    private Case4() {

    }

    public static Case4 getInstance() {
        return instance;
    }
}
