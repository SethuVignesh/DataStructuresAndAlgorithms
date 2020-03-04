

import LinkedL.LL;
import LinkedL.Node;

import java.util.LinkedList;

public class Stack {
    int size;
    LL ll;

    public Stack() {
        ll = new LL();

    }

    public boolean push(int data) {
        return ll.insertAtBegin(data);
    }

    public int pop() {
        if (isEmpty()) return -1;
        Node temp = ll.head;
        ll.head = ll.head.getNext();
        return temp.getData();
    }

    public int peek() {
        if (isEmpty()) return -1;

        return ll.head.getData();
    }

    public boolean isEmpty() {
        return size == 0;
    }
//    public int pop(){}
//    public int peek(){}
}

