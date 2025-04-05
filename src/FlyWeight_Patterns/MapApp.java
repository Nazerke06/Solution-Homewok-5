package FlyWeight_Patterns;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class MapApp {
    public static void main(String[] args) {
        List<Marker> markers = new ArrayList<>();

        int totalMarkers = 10000;

        for (int i = 0; i < totalMarkers; i++) {
            String type = switch (i % 3) {
                case 0 -> "Hospital";
                case 1 -> "Restaurant";
                default -> "GasStation";
            };
            String icon = type + "_Icon";
            String color = switch (type) {
                case "Hospital" -> "Red";
                case "Restaurant" -> "Green";
                default -> "Blue";
            };
            String labelStyle = "Bold";

            MarkerStyleFlyWeight style = MarkerStyleFlyWeight.getStyle(icon, color, labelStyle);
            markers.add(new Marker("Location_" + i, style));
        }

        System.out.println("Total markers created: " + totalMarkers);
        System.out.println("Unique marker styles: " + MarkerStyleFactory.getTotalUniqueStyles());

        // Optionally: draw the first 5 markers to see output
        for (int i = 0; i < 5; i++) {
            markers.get(i).draw();
        }
    }
}

