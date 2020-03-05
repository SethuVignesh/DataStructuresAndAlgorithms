public class QusingStack {
    Stack stack = new Stack();
    Stack stack2 = new Stack();
    int size= stack.size+stack2.size;

    public boolean enque(int data) {
        stack.push(data);
        return true;
    }

    public int deque() {
        if (stack2.isEmpty() == false) {
            return stack2.pop();
        } else {
            while (stack.isEmpty()) {
                stack2.push(stack.pop());
            }
            return stack2.pop();
        }
    }



}
