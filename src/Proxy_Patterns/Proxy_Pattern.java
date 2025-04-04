package Proxy_Patterns;

public class Proxy_Pattern implements Image {
    private FullImage fullImage;
    private String imageName;

    public Proxy_Pattern(String imageName) {
        this.imageName = imageName;
    }
    public void display(){
        if (fullImage==null){
            fullImage= new FullImage(imageName);
            System.out.println("No image");
        }
        fullImage.display();
    }
}
