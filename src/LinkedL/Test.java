package LinkedL;

public class Test {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertAsc(3);
        ll.insertAsc(2);
        ll.insertAsc(4);
        ll.insertAsc(1);
//        ll.iterate();
//        ll.printReverse(ll.head);
        ll.reverseLLLinear();

        ll.iterate();


    }
}
