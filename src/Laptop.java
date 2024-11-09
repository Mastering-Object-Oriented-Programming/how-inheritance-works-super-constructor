public class Laptop extends Product { //Derived class, Sub class, Child class

    float processor;
    float ramSize;
    String operatingSystem;

    public Laptop(){
        super();
        System.out.println("Laptop constructor is invoked..");
    }

    public Laptop(int id, String name, String brand, float price, float discountPercentage, float rating, float processor, float ramSize, String operatingSystem) {
        super(id, name, brand, price, discountPercentage, rating);
        this.processor = processor;
        this.ramSize = ramSize;
        this.operatingSystem = operatingSystem;
    }
}
