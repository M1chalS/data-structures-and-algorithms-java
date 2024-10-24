import java.util.Collections;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.Queue<String> queue = new java.util.PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
