package reflectionFactory;

import model.Product;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ReflectionFactory {

    private static ReflectionFactory instance;
    private Map<String, Class<? extends Product>> registeredTypes = new HashMap<>();

    private ReflectionFactory() {
    }

    public static ReflectionFactory getInstance() {
        if (instance == null)
            instance = new ReflectionFactory();
        return instance;
    }

    public void registerType(String type, Class<? extends Product> _class) {
        registeredTypes.put(type, _class);
    }

    public Product getProduct(String type) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> cClass = registeredTypes.get(type);
        Constructor productConstructor = cClass.getDeclaredConstructor();
        return (Product) productConstructor.newInstance(new Object[]{});
    }
}
