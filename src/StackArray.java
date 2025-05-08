import java.util.ArrayList;

public class StackArray implements Stack {
    private final ArrayList<Object> stack = new ArrayList<>();

    @Override
    public void push(Object o) {
        this.stack.add(0, o);
    }

    @Override
    public Object pop() {
        if (this.isEmpty()) {
            return null;
        }

       return this.stack.remove(0);
    }

    @Override
    public Object peek() {
        if (this.isEmpty()) {
            return null;
        }

        return this.stack.get(0);
    }

    @Override
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
}
