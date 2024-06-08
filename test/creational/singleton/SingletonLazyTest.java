package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonLazyTest {

    @Test
    void testGetInstance() {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();
        assertEquals(instance1, instance2);
    }
}