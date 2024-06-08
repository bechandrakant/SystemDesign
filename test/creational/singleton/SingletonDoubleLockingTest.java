package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonDoubleLockingTest {

    @Test
    void getInstance() {
        SingletonDoubleLocking instance1 = SingletonDoubleLocking.getInstance();
        SingletonDoubleLocking instance2 = SingletonDoubleLocking.getInstance();
        assertEquals(instance1, instance2);
    }
}