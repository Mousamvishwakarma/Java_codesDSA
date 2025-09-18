import java.util.Stack;

public class One {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack: " + stack); // [A, B, C]

        // Peek
        System.out.println("Top element: " + stack.peek()); // C

        // Pop
        System.out.println("Popped: " + stack.pop()); // C

    
    }
}
