package stack.app;

import stack.datastructure.StackImpl;
import stack.service.Stack;

public class App {
    public static void main(String args[])
    {
        Stack stack = new StackImpl();
        stack.push(999);
        stack.push(666);
        stack.push(888);
        System.out.println(stack.pop() + " Popped from stack");
    }
}
