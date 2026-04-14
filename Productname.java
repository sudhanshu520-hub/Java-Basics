class Product {

    // Private variables (data hiding)
    private int productId;
    private String productName;
    private double price;

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setProductId(int id) {
        productId = id;
    }

    public void setProductName(String name) {
        productName = name;
    }

    public void setPrice(double p) {
        if (p > 0) {
            price = p;
        } else {
            System.out.println("Invalid price!");
        }
    }
}

public class Productname {
    public static void main(String[] args) {

        // Create object
        Product p1 = new Product();

        // Set values using setters
        p1.setProductId(101);
        p1.setProductName("Laptop");
        p1.setPrice(55000);

        // Get values using getters
        System.out.println("Product ID: " + p1.getProductId());
        System.out.println("Product Name: " + p1.getProductName());
        System.out.println("Price: " + p1.getPrice());
    }
}
