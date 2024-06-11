package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class GameRegistry {
    private Map<GraphicalObjectType, GraphicalObject> registry = new HashMap();

    public void addPrototype(GraphicalObjectType type, GraphicalObject object) {
        registry.put(type, object);
    }

    public GraphicalObject getPrototype(GraphicalObjectType type) {
        return registry.get(type);
    }
}
