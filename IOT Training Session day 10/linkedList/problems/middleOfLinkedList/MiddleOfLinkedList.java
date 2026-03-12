package DSA.linear.linkedList.problems.middleOfLinkedList;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class MiddleOfLinkedList {
    static int findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(9);
        System.out.println("Middle of LinkedList is:" + findMiddle(head1));
        // Example 2
        Node head2 = new Node(8);
        head2.next = new Node(2);
        head2.next.next = new Node(7);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);
        head2.next.next.next.next.next = new Node(1);
        System.out.println("Middle of LinkedList is:" + findMiddle(head2));
    }
}