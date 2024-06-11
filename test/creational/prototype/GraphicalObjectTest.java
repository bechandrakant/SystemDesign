package creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphicalObjectTest {

    @Test
    void testClone() {
        Background prototype = new Background(5, 5, 5, 5, "RED", GraphicalObjectType.BACKGROUND);
        Background clone = prototype.clone();
        assertNotNull(prototype);
        assertNotNull(clone);
        assertEquals(5, clone.getX());
        clone.setX(2);
        assertEquals(2, clone.getX());
    }

    @Test
    void testRegistry() {
        GameRegistry registry = new GameRegistry();
        registry.addPrototype(GraphicalObjectType.BACKGROUND, new Background());
        registry.addPrototype(GraphicalObjectType.FOREGROUND, new Foreground());
        assertNotNull(registry.getPrototype(GraphicalObjectType.BACKGROUND));
        assertNotNull(registry.getPrototype(GraphicalObjectType.FOREGROUND));
    }
}