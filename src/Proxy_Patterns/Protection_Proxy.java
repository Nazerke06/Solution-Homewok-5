package Proxy_Patterns;

public class Protection_Proxy {
    private  boolean isAdminEntered;

    public Protection_Proxy(boolean isAdminEntered) {
        this.isAdminEntered = isAdminEntered;
    }
    public void uploadImage(String filename) {
        if (isAdminEntered) {
            System.out.println("Admin downloaded image:" + filename);
        } else {
            System.out.println("Wrong! Only admins can download this image.");
        }
    }
}
