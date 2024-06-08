package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonBillPughTest {

    @Test
    void getInstance() {
        SingletonBillPugh instance1 = SingletonBillPugh.getInstance();
        SingletonBillPugh instance2 = SingletonBillPugh.getInstance();
        assertEquals(instance1, instance2);
    }
}