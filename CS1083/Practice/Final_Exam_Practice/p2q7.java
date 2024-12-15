import java.util.Stack;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class p2q7 {
    public static void switchStack2Queue(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        while (!stack.isEmpty()) {
            int value = stack.pop();
            queue.add(value);
            tempStack.push(value);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}

/*
 * Write a static method that will take all the elements out of a stack and add them to a
queue. Both contain data of type Integer. The original stack should have the same
contents and same order a9er the method has completed its execu=on.
 */