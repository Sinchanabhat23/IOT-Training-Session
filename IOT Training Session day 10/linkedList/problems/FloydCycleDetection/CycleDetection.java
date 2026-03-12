package DSA.linear.linkedList.problems.FloydCycleDetection;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class CycleDetection {
    static Node head=null;
    static void createList(){
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        // creating a cycle
        head.next.next.next.next=head.next; // 5th is connected to second node
    }
static boolean hasCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true; // cycle has been detected
            }
        }
        return false; // no cycle has been detected
   }
    public static void main(String[] args) {
        createList();
        if(hasCycle()){
            System.out.println("Cycle Detected");
        }
        else{
            System.out.println("Cycle Not Detected!!!");
        }
    }
}
