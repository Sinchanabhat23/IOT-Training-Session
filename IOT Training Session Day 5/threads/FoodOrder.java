package threads;
public class FoodOrder extends Thread {
    String task;
    FoodOrder(String task) {
        this.task = task;
    }
    public void run(){
        System.out.println(task +" Started");
    }
public static void main(String[] args) {
    FoodOrder cooking = new FoodOrder("Cooking");
    FoodOrder packing = new FoodOrder("Packing");
    FoodOrder delivery = new FoodOrder("Delivering food");
    cooking.start();
    packing.start();
    delivery.start();
    }
}
/*points to remember
extend thread class
override run()
use start()
it is less flexible bcz of inheritance limitation multiple inheritance it doesnt support
 */