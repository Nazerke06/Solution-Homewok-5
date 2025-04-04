package Proxy_Patterns;

public class FullImage implements Image{
    private String file;

    public FullImage(String file) {
        this.file = file;
    }
    private void LoadImage(){
        try {
            Thread.sleep(2500);;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void display(){
        System.out.println("Mini version: " + file);
    }
    public void displayFullversion(){
        System.out.println("Full image version:" + file);
    }
}
