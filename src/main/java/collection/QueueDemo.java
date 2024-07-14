package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // FIFO: First In - First Out
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        // [1]
        queue.offer(3);
        // [1, 3]
        queue.offer(5);
        // [1, 3, 5]

        System.out.println(queue);

        int peek = queue.peek();
        System.out.println(peek);

        int poll = queue.poll();
        // 1
        System.out.println(poll);
        System.out.println(queue);
    }
}
