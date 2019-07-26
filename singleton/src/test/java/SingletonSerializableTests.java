import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class SingletonSerializableTests {

    @Test
    public void checkSerializationLeak() {
        SingletonWithoutSerialization instance1 = null;
        SingletonWithoutSerialization instance2 = null;
        try {
            instance1 = SingletonWithoutSerialization.getInstance();
            ObjectOutput output = new ObjectOutputStream(new FileOutputStream("file.txt"));

            output.writeObject(instance1);
            output.close();

            ObjectInput input = new ObjectInputStream(new FileInputStream("file.txt"));
            instance2 = (SingletonWithoutSerialization) input.readObject();
            input.close();


        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Assert.assertNotEquals(instance1.hashCode(), instance2.hashCode());
    }

    @Test
    public void checkSerializationProtection() {
        SingletonSerializable instance1 = null;
        SingletonSerializable instance2 = null;
        try {
            instance1 = SingletonSerializable.getInstance();
            ObjectOutput output = new ObjectOutputStream(new FileOutputStream("file.txt"));

            output.writeObject(instance1);
            output.close();

            ObjectInput input = new ObjectInputStream(new FileInputStream("file.txt"));
            instance2 = (SingletonSerializable) input.readObject();
            input.close();


        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Assert.assertEquals(instance1.hashCode(), instance2.hashCode());
    }

    @Test
    public void checkDeserialization() {
        SingletonSerializable instance1 = null;

        try {
            instance1 = SingletonSerializable.getInstance();
            instance1.setValue(10);

            ObjectOutput output = new ObjectOutputStream(new FileOutputStream("file.txt"));

            output.writeObject(instance1);
            output.close();

            instance1.setValue(100);

            ObjectInput input = new ObjectInputStream(new FileInputStream("file.txt"));
            instance1 = (SingletonSerializable) input.readObject();
            input.close();


        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(instance1.getValue());
        Assert.assertEquals(10, instance1.getValue());

    }
}
