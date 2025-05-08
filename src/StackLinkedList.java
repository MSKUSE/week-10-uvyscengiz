public class StackLinkedList implements Stack {
    StackItem top = null;


    @Override
    public void push(Object o) {
        StackItem item = new StackItem(o);
        item.setNext(top);
        top = item;
    }

    @Override
    public Object pop() {
        if (top == null) {
            return null;
        }

        StackItem item = top;
        top = top.getNext();
        return item.getItem();
    }

    @Override
    public Object peek() {
        if (top == null) {
            return null;
        }

        return top.getItem();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
