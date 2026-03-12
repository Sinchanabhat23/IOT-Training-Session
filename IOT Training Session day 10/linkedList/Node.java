package DSA.linear.linkedList;
class LL{
    Node head;
    int size;
    LL(){
        size=0;
}
public class Node {
    String data;
    Node next;
    Node(String data) {
        this.data = data;
        this.next = null; // we don't know the address of the next node
        size++; //Increment the size as soon as a node is created
    }
    }
public void printList() {
    Node curr = head;
    while (curr != null) {
        System.out.print(curr.data + "->");
        curr = curr.next;
    }
    System.out.println("null");
  }
  public void addFirst(String data){
        // Create a new node
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;
}
public void addLast(String data){
    // Create a new node
    Node newNode=new Node(data);
    // Empty list
    if(head==null){
        head=newNode;
        return;
    }
    // If there are multiple nodes,we need to find the last node
    Node last=head;
    while(last.next!=null){
        last=last.next;
    }
    // at the end of this loop, we will stand at the last node
    // point the next node next pointer to the new node
    last.next=newNode;
}
public void removeFirst(){
        // Empty list-> Cannot remove the head node.
        if(head==null)
        {
            System.out.println("List is empty so cannot delete the head!");
            return;
        }
        // For a single node,the head will point to the next(null)
    // For multiple node head will point to the next(head.next)
    head=this.head.next;
}
public void removeLast(){
    if(head==null)
    {
        System.out.println("List is empty so cannot delete the head!");
        return;
    }
    // Single element in the list
    if(head.next==null)
    {
        head=null;// C or C++ style of code
        size--;
        return;
    }
    // Multiple elements in the list
    Node curr=head;
   Node last=head.next;
   while(last.next!=null){
       curr=last;
       last=last.next;
   }
   // the last node will be cleared by the JVM if not used
    // so,we point the secondLast(curr) node to null pointer
    curr.next=null;
   size--;
    }
    public void removeTarget(String target) {
        // Empty list->cannot remove the target node.
        if (head == null) {
            System.out.println("List is empty so cannot delete the head!");
            return;
        }
        // Case: target is the head node itself
        if (head.data.equals(target)) {
            head = head.next;
            size--;
            return;
        }
        // Case: target is anywhere in the list
        Node prev = null;
        Node curr = head;
        while (curr != null && !curr.data.equals(target)) {
            prev = curr;
            curr = curr.next;
        }
        // do a check to see if the curr pointer is null
        // if its null, the target is not found
        if (curr == null) {
            System.out.println("Target not found in the list!");
            return;
        }
        prev.next = curr.next;
        size--;
        return;
    }
public static void main(String[] args) {
    LL sll = new LL();
    sll.addFirst("We");
    sll.addFirst("are");
    sll.addFirst("learning ");
    sll.addFirst("dsa");
    sll.removeFirst();
    sll.printList();
    sll.removeLast();
    sll.printList();
    sll.addLast("We");
    sll.addLast("are");
    sll.addLast("learning ");
    sll.addLast("dsa");
    sll.printList();
    sll.removeFirst();
    sll.printList();
    sll.removeLast();
    sll.printList();
    sll.removeTarget("learning ");
    sll.printList();
  }
}
