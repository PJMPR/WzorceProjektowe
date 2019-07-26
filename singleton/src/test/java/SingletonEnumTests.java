import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class SingletonEnumTests {

    @Test
    public void checkThreadSafeForSingletonEnum() {
        SingletonEnum enum1 = SingletonEnum.INSTANCE;
        SingletonEnum enum2 = SingletonEnum.INSTANCE;

        Assert.assertEquals(enum1.hashCode(), enum2.hashCode());
    }

    @Test
    public void checkSerializationProtection() {
        SingletonEnum instance1 = null;
        SingletonEnum instance2 = null;
        try {
            instance1 = SingletonEnum.INSTANCE;
            ObjectOutput output = new ObjectOutputStream(new FileOutputStream("file.txt"));

            output.writeObject(instance1);
            output.close();

            ObjectInput input = new ObjectInputStream(new FileInputStream("file.txt"));
            instance2 = (SingletonEnum) input.readObject();
            input.close();


        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Assert.assertEquals(instance1.hashCode(), instance2.hashCode());
    }
}
