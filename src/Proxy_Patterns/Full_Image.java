package Proxy_Patterns;

public class Full_Image implements Image{
    private String file;

    public Full_Image(String file) {
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
    public void displayFullImage(){
        System.out.println("Full image version:" + file);
    }
}
