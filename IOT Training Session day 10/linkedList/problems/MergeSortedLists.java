package DSA.linear.linkedList.problems;
class Nodee{
    int data;
    Nodee next;
    public Nodee(int data){
        this.data = data;
    }
}
public class MergeSortedLists {
    static Nodee mergeSortedLists(Nodee l1, Nodee l2){
        Nodee dummy = new Nodee(0);
        Nodee tail = dummy;
        while (l1 != null && l2 != null){
            if (l1.data < l2.data){
                tail.next = l1;
                l1 = l1.next;
            }else{
                tail.next = l2;
                l2 = l2.next;
        }
            tail=tail.next;
    }
        // attach remaining nodes by just copy paste
    if (l1!= null)
    { // because dummy is pointing zero
        tail.next = l1;
    }
    return dummy.next;
            }
            static void printList(Nodee head){
        while(head!=null){
                System.out.print(head.data+" -> ");
                head=head.next;
        }
        System.out.println("null");
            }
    public static void main(String[] args) {
        Nodee l1 = new Nodee(1);
       l1.next = new Nodee(2);
       l1.next.next = new Nodee(3);
       l1.next.next.next = new Nodee(9);

       Nodee l2 = new Nodee(4);
       l2.next = new Nodee(5);
       l2.next.next = new Nodee(6);
       l2.next.next.next = new Nodee(7);
       l2.next.next.next.next = new Nodee(8);
       Nodee merged=mergeSortedLists(l1,l2);
       printList(merged);
    }
}

