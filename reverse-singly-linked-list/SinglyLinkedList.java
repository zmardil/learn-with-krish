class Node {
	public Object item;
	public Node next;
 
	Node(Object item){
		this.item = item;
	}

	public void NodeData() {
		System.out.println("[ " + item + " ] ");
	}
}
 
public class SinglyLinkedList {
	private Node head;
 
	public boolean isEmpty() {
		return (head == null);
	}
 
	public void add(Object item) {
		//insert a node at the start of list
		Node node = new Node(item);
		node.next = head;
		head = node;
	}
 
	public SinglyLinkedList reverse() {
		//reverse the list
		Node previous = null;
		Node current = head;
		Node next = null;
		while (current != null & !isEmpty()) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
		return this;
	}
	
	public String toString() {
		// print the List
		Node node = head;
		String text = "[ ";
		while(node != null) {
			text += node.next == null ? node.item :  node.item + " -> ";
			node = node.next;
		}
		return text + " ]";
	}
}