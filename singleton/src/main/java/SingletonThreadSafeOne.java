public class SingletonThreadSafeOne {

    private int value = 100;
    private String name = "";

    private static SingletonThreadSafeOne instance;

    private SingletonThreadSafeOne() {

    }

    public synchronized static SingletonThreadSafeOne getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafeOne();
        }
        return instance;
    }
}
