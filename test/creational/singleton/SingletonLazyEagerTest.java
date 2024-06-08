package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonLazyEagerTest {

    @Test
    void getInstance() {
        SingletonEager instance1 = SingletonEager.getInstance();
        SingletonEager instance2 = SingletonEager.getInstance();
        assertEquals(instance1, instance2);
    }
}