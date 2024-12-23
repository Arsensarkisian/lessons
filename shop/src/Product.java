public class Product {
    private String name;
    private String description;
    private double price;
    private Categories productCategories;


    public Product(String name, String description, double price, Categories productCategories){
        this.name = name;
        this.description = description;
        this.price = price;
        this.productCategories = productCategories;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getProductCategories() {
        return productCategories.toString().toLowerCase();
    }
    public void setProductCategories(Categories productCategories) {
        this.productCategories = productCategories;
    }
}
