public class SingletonThreadSafeDoubleCheck {

    private int value = 100;
    private String name = "";

    private static SingletonThreadSafeDoubleCheck instance;

    private SingletonThreadSafeDoubleCheck() {

    }

    public static SingletonThreadSafeDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafeDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafeDoubleCheck();
                }
            }
        }
        return instance;
    }
}
