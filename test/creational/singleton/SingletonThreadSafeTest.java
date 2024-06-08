package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonThreadSafeTest {

    @Test
    void getInstance() {
        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();
        assertEquals(instance1, instance2);
    }
}