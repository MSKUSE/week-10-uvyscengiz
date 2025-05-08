public class Main {
    public static void main(String[] args) {
        Stack stack = new StackLinkedList();
        stack.push("String");
        stack.push(12);
        System.out.println("Peek = " + stack.peek());
        System.out.println("Pop = " + stack.pop());
        System.out.println("Peek = " + stack.peek());
        System.out.println("Pop = " + stack.pop());
        System.out.println("Is empty =" + stack.isEmpty());
        stack.peek();
    }
}
