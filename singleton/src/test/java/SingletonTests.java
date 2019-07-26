import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingletonTests {

    @Test
    public void checkThreadUnSafeSingleton() throws InterruptedException {
        Set<Singleton> singletonSet = Collections.newSetFromMap(new ConcurrentHashMap<>());
        int threadsAmount = 100;
        ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

        for (int i = 0; i < threadsAmount; i++) {
            executorService.execute(() -> {
                Singleton singleton = Singleton.getInstance();
                singletonSet.add(singleton);
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        Assert.assertTrue(singletonSet.size() > 1);
    }

    @Test
    public void simpleCheckThreadUnSafeSingleton() {
        HashSet<Integer> singletons = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            Singleton singleton = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }

        Assert.assertTrue(singletons.size() > 1);
    }
}
