package DSA.collection.list;

import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart=new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mobile");
        cart.add("Tablet");
        cart.add("Desktop");
        cart.remove("Laptop");
        cart.set(2,"Iphone");
        System.out.println("Cart:"+cart);
        System.out.println("Cart size is:"+cart.size());
    }
}
