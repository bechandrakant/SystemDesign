package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Background implements GraphicalObject {

    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private String colour;
    private GraphicalObjectType type;

    private List<Integer> pixels = new ArrayList<>();

    public Background(Integer x, Integer y, Integer width, Integer height, String colour, GraphicalObjectType type) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.colour = colour;
        this.type = type;
        this.pixels = someHeavyMethod();
    }

    public Background() {
    }

    private List<Integer> someHeavyMethod() {
        List<Integer> pixels = new ArrayList<>();
        for(int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                pixels.add(i + j);
            }
        }
        return pixels;
    }

    @Override
    public Background clone() {
        Background clone = new Background();
        clone.x = x;
        clone.y = y;
        clone.width = width;
        clone.height = height;
        clone.colour = colour;
        clone.type = type;
        clone.pixels = pixels;
        return clone;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }

    public GraphicalObjectType getType() {
        return type;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(GraphicalObjectType type) {
        this.type = type;
    }
}
