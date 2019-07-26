import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingletonClassLoaderTests {
    @Test
    public void checkThreadSafeForSingletonClassLoader() {
        Set<SingletonClassLoader> singletonSet = Collections.newSetFromMap(new ConcurrentHashMap<>());
        int threadsAmount = 100;
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

            for (int i = 0; i < threadsAmount; i++) {
                executorService.execute(() -> {
                    SingletonClassLoader singleton = SingletonClassLoader.getInstance();
                    singletonSet.add(singleton);
                });
            }

            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(1, singletonSet.size());
    }

    @Test
    public void simpleCheckThreadSafe() {
        HashSet<Integer> singletons = new HashSet<>();
        for (int i = 0 ; i < 100 ; i++){
            SingletonClassLoader singleton = SingletonClassLoader.getInstance();
            SingletonClassLoader singleton2 = SingletonClassLoader.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }

        Assert.assertEquals(1, singletons.size());
    }
}
