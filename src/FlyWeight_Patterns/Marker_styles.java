package FlyWeight_Patterns;

public class Marker_styles {
    private String iconType;
    private String color;
    private String labelStyle;

    public Marker_styles(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }
    public void render(String location){
        System.out.println("Rendering at: " + location + "icon: " + iconType + "color: " + color + ", labelstyle: " + labelStyle);
    }
}
