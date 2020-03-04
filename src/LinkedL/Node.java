package LinkedL;

public class Node {
    int data;
    private Node prev;
    private Node next;

    Node(int data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }
}
