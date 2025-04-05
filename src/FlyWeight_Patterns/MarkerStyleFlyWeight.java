package FlyWeight_Patterns;

public class MarkerStyleFlyWeight implements MarkerStyle {
    private String iconType;
    private String color;
    private String labelStyle;

    public MarkerStyleFlyWeight(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }
    
    public void render(String location){
        System.out.println("Rendering at: " + location + "icon: " + iconType + "color: " + color + ", labelstyle: " + labelStyle);
    }
}
