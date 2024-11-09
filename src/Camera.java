public class Camera extends Product{ //Derived class, Sub class, Child class

    String imageProcessor;
    float cameraInMegaPixels;
    boolean isMirrorless;

    public Camera(){
        super();
        System.out.println("Camera constructor is invoked..");
    }

    public Camera(int id, String name, String brand, float price, float discountPercentage, float rating, String imageProcessor, float cameraInMegaPixels, boolean isMirrorless) {
        super(id, name, brand, price, discountPercentage, rating);
        this.imageProcessor = imageProcessor;
        this.cameraInMegaPixels = cameraInMegaPixels;
        this.isMirrorless = isMirrorless;
    }

}
