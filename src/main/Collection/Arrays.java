package main.Collection;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        List<Integer> stack = new Stack<>();
        List<Integer> vector = new Vector<>();
        stack.add(1);
        stack.add(1);
        stack.add(2);
        stack.add(1);
//        System.out.println(stack);
//        System.out.println(stack.get(1));
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.add(1);
        queue2.add(2);
        queue2.add(3);
        queue2.add(4);
        System.out.println(queue2);
        Queue<Integer> queue3 = new PriorityQueue<>();
        queue3.add(1);
        queue3.add(2);
        queue3.add(8);
        queue3.add(4);
        System.out.println(queue3);
        System.out.println(queue3.poll());
        System.out.println(queue3.poll());
        System.out.println(queue3.poll());
        System.out.println(queue3.poll());
    }
}
