package DSA.linear.linkedList.problems;
import java.util.Stack;
class ListtNode {
    int data;
    ListtNode next;
    ListtNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListtNode head) {
        Stack<Integer> stack = new Stack<>();
        ListtNode temp = head;
        // push all elements to stack

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        // compare with stack
        while (temp != null) {
            if (temp.data != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListtNode head = new ListtNode(1);
        head.next = new ListtNode(2);
        head.next.next = new ListtNode(1);
        System.out.println(isPalindrome(head) ? "Palindrome" : "Not Palindrome");
        ListtNode head2 = new ListtNode(1);
        head2.next = new ListtNode(2);
        head2.next.next = new ListtNode(3);
        System.out.println(isPalindrome(head2) ? "Palindrome" : "Not Palindrome");
    }
}