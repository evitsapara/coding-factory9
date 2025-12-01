package gr.aueb.cf.cf9.ch6;

/**
 * Implements a Last-In-First-Out (LIFO) logic.
 */
public class StackApp {
    static int[] stack = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        int num = 0;

        push(1);        // top -> 0
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);        // top -> 5

        printStack();
        num = pop();
        System.out.println("Popped: " + num);
        System.out.println();
        printStack();
    }

    public static void push(int num) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        stack[top] = num;
        //stack[++top} = num;
    }
    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        int num = stack[top];
        top--;
        return num;
        //return stack[top--};
    }

    /**
     * method to check if the stack is empty
     * @return  true if the stack is empty, false otherwise
     */
    public static boolean isEmpty() {
        return top == -1;
    }
    /**
     * method to check if the stack is full
     * @return  true if the stack is full, false otherwise
     */

    public static boolean isFull() {
        return top == stack.length - 1;
    }
    public static void printStack() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

    }
}
