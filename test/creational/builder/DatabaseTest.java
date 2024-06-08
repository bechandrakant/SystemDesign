package creational.builder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    void testBuilderPattern() {
        Database database = Database
                .builder()
                .withName("MySQL")
                .withUrl("10.10.10.55", 80)
                .withPassword("password")
                .build();
        assertNotNull(database);
        assertEquals("MySQL", database.getName());
        assertEquals("10.10.10.55", database.getHost());
        assertEquals(80, database.getPort());
        assertEquals("password", database.getPassword());
    }

    @Test
    void testInvalidName() {
        Executable executable = () -> Database
                .builder()
                .withUrl("10.10.10.55", 80)
                .withPassword("password")
                .build();;

        assertThrows(RuntimeException.class, executable);
    }
    @Test
    void testInvalidPassword() {
        Executable executable = () -> Database
                .builder()
                .withName("MySQL")
                .withUrl("10.10.10.55", 80)
                .withPassword("pass")
                .build();;

        assertThrows(RuntimeException.class, executable);
    }

}