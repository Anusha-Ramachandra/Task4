import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> stack;

    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void push(int value) {
        stack.push(value);
        System.out.println("Pushed: " + value);
    }

    // Method to pop an element from the stack
    public Integer pop() {
        if (!isEmpty()) {
            int value = stack.pop();
            System.out.println("Popped: " + value);
            return value;
        } else {
            System.out.println("Stack is empty, cannot pop.");
            return null;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Main method to demonstrate the functionalities
    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();

        // Pushing elements onto the stack
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        // Popping elements from the stack
        integerStack.pop();
        integerStack.pop();

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + integerStack.isEmpty());

        // Popping remaining elements
        integerStack.pop();

        // Check if the stack is empty again
        System.out.println("Is the stack empty? " + integerStack.isEmpty());
    }
}
