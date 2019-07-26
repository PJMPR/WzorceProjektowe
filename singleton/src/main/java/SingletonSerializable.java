import java.io.Serializable;

public class SingletonSerializable implements Serializable {
    private static final long serialVersionUID = 1L;
    private int value;
    private String name;

    private static SingletonSerializable instance = new SingletonSerializable();

    private SingletonSerializable() {
    }

    public static SingletonSerializable getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return this;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
