
import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the product name and price        
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        // Create one Product object        
        Products p = new Products(name, price);
        // Call display()        
        p.display();
    }
}

class Products {

    double price;
    String name;

    Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}
