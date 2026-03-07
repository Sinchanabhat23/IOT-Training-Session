package DSA.collection.base;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        liveOrders.add("ORD115");
        liveOrders.add("ORD106");
        liveOrders.add("ORD104");
        // CHECK ORDER
        System.out.println("ORD104 exist?"+liveOrders.contains("ORD104"));
        // CHECK THE LIVE ORDERS
        System.out.println("Live orders:"+liveOrders);
        liveOrders.remove("ORD115");
        System.out.println("Live orders:"+liveOrders);
        liveOrders.clear();
        System.out.println("Live orders:"+liveOrders);
    }
}
