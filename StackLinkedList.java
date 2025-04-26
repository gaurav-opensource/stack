class StackNode {
    int data;
    StackNode next;
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    StackNode root;

    boolean isEmpty() {
        return root == null;
    }

    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int popped = root.data;
        root = root.next;
        return popped;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        }
        return root.data;
    }
}
