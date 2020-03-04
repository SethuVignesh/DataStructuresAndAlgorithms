package LinkedL;

public class LL {
    public Node head;
    private int size;

    public int getMiddle() {
        if (isEmpty() == false) {
            //head
            if (head.getNext() == null) {
                return head.getData();
            } else if ((size & 1) == 0) {
                //even
            } else {
                //odd
            }
            return -1;
        }
        return -1;
    }

    public boolean insertAtBegin(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            size++;
            return true;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
            size++;
            return true;
        }
    }

    public boolean insertAtPosition(int data, int pos) {
        Node node = new Node(data);
        Node current = head;
        Node prev = head;
        int currentPos = 0;

        while (current != null) {
            currentPos++;
            current = prev.getNext();
            if (currentPos == pos) {
                prev.setNext(node);
                node.setNext(current);
                prev = current;
                current = prev.getNext();
                return true;

            }
            prev = current;
            current = prev.getNext();
        }
        head = node;

//        if (isEmpty()) {
//            if (pos == 0) {
//                head = node;
//                size++;
//            }
//        }else{
//            LinkedL.Node current= head;
//            LinkedL.Node prev=head;
//            int currentPos =0;
//            if(currentPos==pos){
//
//            }
//        }
        return false;
    }

    public boolean insertAsc(int data) {//2
        // -, 3-
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            size++;
            return true;
        }

        Node prev = head;
        Node current = prev.getNext();
        while (current != null) {
            if (prev.data < data && current.data > data) {
                prev.setNext(node);
                node.setNext(current);
                size++;
                return true;
            } else if (prev.data > data) {
                head = node;
                head.setNext(prev);
                size++;
                return true;
            }
            prev = current;
            current = prev.getNext();
        }
        if (prev.data > data) {
            head = node;
            head.setNext(prev);
            size++;
            return true;
        }
        prev.setNext(node);
        return false;
    }

    public void printReverse(Node temp) {
        if (temp == null) return;
        printReverse(temp.getNext());
        System.out.println(temp.data);
    }

    public void reverseLLLinear() {
        if (size > 1)
            head = reverseLinkedList(head.getNext(), head);
    }

    private Node reverseLinkedList(Node prev, Node curr) {
        if (curr == null) {
            return null;
        }
        reverseLinkedList(curr, curr.getNext());
        curr.setNext(prev);
        return prev;
    }

    public void reverseLLRecursion() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void iterate() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.getNext();
        }
    }
}
