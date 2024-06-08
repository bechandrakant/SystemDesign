package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonLazyStaticBlockTest {

    @Test
    void getInstance() {
        SingletonStaticBlock instance1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock instance2 = SingletonStaticBlock.getInstance();
        assertEquals(instance1, instance2);
    }
}