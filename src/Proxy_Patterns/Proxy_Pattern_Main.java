package Proxy_Patterns;

public class Proxy_Pattern_Main {
    public static void main(String[] args) {
        System.out.println("🎯 --- Virtual Proxy (Lazy Loading) ---");
        Image image1 = new Proxy_Pattern("house1.jpg");
        Image image2 = new Proxy_Pattern("house2.jpg");

        System.out.println("\n👀 Displaying thumbnails:");
        image1.display();
        image2.display();

        System.out.println("\n🔍 User clicks to zoom in:");
        image1.displayFullImage();
        System.out.println("--------------------");
        image2.displayFullImage();

        System.out.println("\n🎯 --- Protection Proxy (Agent Access Check) ---");
        Protection_Proxy uploader1 = new Protection_Proxy(true);
        Protection_Proxy uploader2 = new Protection_Proxy(false);

        uploader1.uploadImage("house3.jpg");
        uploader2.uploadImage("house4.jpg");
            }
        }
