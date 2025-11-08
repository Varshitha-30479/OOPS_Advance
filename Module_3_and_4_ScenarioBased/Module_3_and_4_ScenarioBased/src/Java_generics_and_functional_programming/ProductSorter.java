package Java_generics_and_functional_programming;

import java.util.*;

class Product {
    private String productName;
    private double price;
    private double rating;

    public Product(String productName, double price, double rating) {
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }

    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return productName + " | Price: ₹" + price + " | Rating: " + rating;
    }
}

public class ProductSorter {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 55000, 4.5));
        products.add(new Product("Smartphone", 25000, 4.7));
        products.add(new Product("Headphones", 1500, 4.2));
        products.add(new Product("Smartwatch", 5000, 4.7));
        products.add(new Product("Camera", 42000, 4.3));

        // Sort: rating desc, then price asc
        Collections.sort(products, (p1, p2) -> {
            int byRating = Double.compare(p2.getRating(), p1.getRating());
            return (byRating != 0) ? byRating : Double.compare(p1.getPrice(), p2.getPrice());
        });

        System.out.println("Sorted Product List:");
        products.forEach(System.out::println);
    }
}
