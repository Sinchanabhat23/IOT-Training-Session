package DSA.collection.lamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
class Product{
    String name;
    int price;
    int quantity;
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
public class ItemSorting {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("Mobile", 7000, 30));
        list.add(new Product("Laptop", 8000, 10));
        list.add(new Product("Desktop", 9000, 9));
        list.add(new Product("Gadget", 10000, 54));
        // Original list
        for (Product p : list) {
            System.out.println(p.name + " " + p.price + " " + p.quantity);
        }
        System.out.println("Sorted list based on quantity is:");
        // Sorting using lambda
        Collections.sort(list, (p1, p2) -> p2.quantity - p1.quantity);
        // Sorted list
        for (Product p : list) {
            System.out.println(p.name + " " + p.price + " " + p.quantity);
        }
    }
}