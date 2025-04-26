public class StackArray {
    static final int MAX = 1000;
    int top;
    int arr[] = new int[MAX];

    StackArray() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            arr[++top] = x;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = arr[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Empty");
            return 0;
        } else {
            return arr[top];
        }
    }

    boolean isEmpty() {
        return (top < 0);
    }
}
 
