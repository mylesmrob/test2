package car;

public abstract class Product {
    private String name;

    public Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
