public class Product { //Base class, Super class, Parent class

    int id;
    String name;
    String brand;
    float price;
    float discountPercentage;
    float rating;

    public Product(){
        System.out.println("Product constructor Invoked..");
    }

    public Product(int id, String name, String brand, float price, float discountPercentage, float rating) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
    }
}
