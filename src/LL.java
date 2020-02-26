public class LL {
    private Node head;
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

 public boolean insertAtBegin(int data){}
 public boolean insertAtPosition(){}
 public boolean insertAsc(){}
 public void printReverse(){}
 public void reverseLLLinear(){}
 public void reverseLLRecursion(){}

    public boolean isEmpty() {
        return head == null;
    }
}
