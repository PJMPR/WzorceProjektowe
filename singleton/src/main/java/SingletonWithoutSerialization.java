import java.io.Serializable;

public class SingletonWithoutSerialization implements Serializable {
    private int value = 100;
    private String name = "";

    private static SingletonWithoutSerialization instance = new SingletonWithoutSerialization();

    private SingletonWithoutSerialization() {
    }

    public static SingletonWithoutSerialization getInstance() {
        return instance;
    }
}
