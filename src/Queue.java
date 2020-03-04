import LinkedL.LL;
import LinkedL.Node;

public class Queue {
    int size;
    LL ll ;

    Queue(){
        ll= new LL();
    }


    public boolean enque(int data){
        ll.insertAtPosition(data, size);
        size++;
        return true;
    }
    public int deque(){
        Node temp =ll.head;

        ll.head= temp.getNext();
        size--;
        return temp.getData();

    }
    public void reverseAQ(){
        Node temp= ll.head;
        ll.reverseLLLinear();
    }
}
