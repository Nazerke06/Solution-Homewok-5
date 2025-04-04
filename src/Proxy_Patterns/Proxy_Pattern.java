package Proxy_Patterns;

public class Proxy_Pattern implements Image {
    private Full_Image fullImage;
    private String imageName;

    public Proxy_Pattern(String imageName) {
        this.imageName = imageName;
    }
    public void display() {
        System.out.println("Mini version:" +imageName);
    }
    public void displayFullImage(){
        if (fullImage==null){
            fullImage= new Full_Image(imageName);
            System.out.println("No image");
        }
        fullImage.displayFullImage();
    }
}
