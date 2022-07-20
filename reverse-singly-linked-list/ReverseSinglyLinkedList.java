public class ReverseSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add("foo");
        sll.add("bar");
        sll.add("baz");
        sll.add(10);
        sll.add(20);
        sll.add(30);

        System.out.println("Original list: " + sll);;
        System.out.println("Reversed list: " + sll.reverse());
    }
}