public class SingletonClassLoader {

    private int value = 100;
    private String name = "";

    private static SingletonClassLoader instance = new SingletonClassLoader();

    private SingletonClassLoader() {
    }

    public static SingletonClassLoader getInstance() {
        return instance;
    }
}
