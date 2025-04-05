package FlyWeight_Patterns;

public class Marker {
    private final String location;
    public final MarkerStyleFlyWeight labelStyle;

    public Marker(String location, MarkerStyleFlyWeight labelStyle) {
        this.location = location;
        this.labelStyle= labelStyle;
    }
    public void draw() {
        labelStyle.render(location);
    }
}
