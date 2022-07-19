public class ReverseSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        
        sll.insert("foo");
        sll.insert("bar");
        sll.insert("baz");
        sll.insert(10);
        sll.insert(20);
        sll.insert(30);

        System.out.println("Original list: " + sll);;
        System.out.println("Reversed list: " + sll.reverse());
    }
}