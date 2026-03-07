package DSA.collection.base;
import java.util.ArrayList;
import java.util.Collection;
public class FlashSaleOrders {
    public static void main(String[] args) {
        Collection<Integer> orderIds=new ArrayList<>();
        orderIds.add(115);
        orderIds.add(106);
        orderIds.add(104);
        System.out.println("Orders Received:"+orderIds);
        System.out.println("No of orders received:"+orderIds.size());
    }
}
// wrapper class data type-> Integer,Boolean,Float....starts from capital letter