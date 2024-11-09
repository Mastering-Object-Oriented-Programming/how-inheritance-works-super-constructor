public class Mobile extends Product { //Derived class, Sub class, Child class

    float  processor;
    float ramSize;
    String operatingTechnology;

    public Mobile(){
        super();
        System.out.println("Price: " + price);
        System.out.println("Mobile constructor is invoked..");
    }

    public Mobile(int id, String name, String brand, float price, float discountPercentage, float rating, float processor, float ramSize, String operatingTechnology) {
        super(id, name, brand, price, discountPercentage, rating);
        this.processor = processor;
        this.ramSize = ramSize;
        this.operatingTechnology = operatingTechnology;
    }
}
